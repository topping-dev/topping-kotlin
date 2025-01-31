package dev.topping.kotlin

import android.app.Activity
import android.os.HandlerThread
import android.os.Process
import dev.topping.android.ToppingEngine
import dev.topping.kotlin.graphics.LuaGraphics
import dev.topping.kotlin.graphics.LuaPoint
import dev.topping.kotlin.graphics.LuaRect
import dev.topping.kotlin.libs.*
import dev.topping.kotlin.lifecycle.*
import dev.topping.kotlin.navigation.*
import dev.topping.kotlin.resource.*
import dev.topping.kotlin.widgets.*

actual class Platform actual constructor() {
    actual companion object {
        var luaContext: dev.topping.android.luagui.LuaContext? = null
        var luaId: String? = null
        private var bindingMap: HashMap<Any, Any>? = null
        private var retBindingMap: HashMap<Any, Any>? = null

        actual fun init(activityOrWindow: Any, onBeforeInit: OnBeforeInit, onComplete: OnComplete) {
            luaContext =
                dev.topping.android.luagui.LuaContext.createLuaContext(activityOrWindow as Activity?)

            val luaEngine = dev.topping.android.ToppingEngine.getInstance()
            ToppingEngine.getInstance().context = luaContext?.context
            onBeforeInit.onBeforeInit()
            val ht = HandlerThread("Lua Loader Thread", Process.THREAD_PRIORITY_URGENT_DISPLAY)
            ht.start()

            val handler: dev.topping.android.backend.LuaLoadHandler = object :
                dev.topping.android.backend.LuaLoadHandler(
                    activityOrWindow as Activity?,
                    ht.looper
                ) {
                override fun onFinished() {
                    val lf: dev.topping.android.LuaForm =
                        activityOrWindow as dev.topping.android.LuaForm
                    luaId = luaEngine.mainForm
                    val initUI = luaEngine.mainUI
                    if (initUI.compareTo("") != 0) {
                        val inflater = dev.topping.android.luagui.LuaViewInflator(luaContext)
                        val view: android.widget.LGView? = inflater.parseFile(initUI, null)
                        lf.setView(view)
                        lf.setContentView(view?.view);
                    }
                    lf.runOnUiThread {
                        (activityOrWindow as dev.topping.android.LuaForm).afterInit()
                    }
                    ht.quit()
                    onComplete.onComplete();
                }
            }
            handler.sendEmptyMessage(dev.topping.android.backend.LuaLoadHandler.INIT_MESSAGE)
        }

        actual fun getRetBindings(): HashMap<Any, Any>? {
            return retBindingMap
        }

        actual fun getBindings(): HashMap<Any, Any>? {
            if (bindingMap == null) {
                bindingMap = hashMapOf(
                    android.widget.LGAbsListView::class to LGAbsListView::class,
                    android.widget.LGAdapterView::class to LGAdapterView::class,
                    android.widget.LGAutoCompleteTextView::class to LGAutoCompleteTextView::class,
                    android.widget.LGBottomNavigationView::class to LGBottomNavigationView::class,
                    android.widget.LGButton::class to LGButton::class,
                    android.widget.LGCheckBox::class to LGCheckBox::class,
                    android.widget.LGComboBox::class to LGComboBox::class,
                    android.widget.LGCompoundButton::class to LGCompoundButton::class,
                    android.widget.LGDatePicker::class to LGDatePicker::class,
                    android.widget.LGEditText::class to LGEditText::class,
                    androidx.fragment.app.LGFragmentContainerView::class to LGFragmentContainerView::class,
                    android.widget.LGFragmentStateAdapter::class to LGFragmentStateAdapter::class,
                    android.widget.LGFrameLayout::class to LGFrameLayout::class,
                    android.widget.LGHorizontalScrollView::class to LGHorizontalScrollView::class,
                    android.widget.LGImageView::class to LGImageView::class,
                    android.widget.LGLinearLayout::class to LGLinearLayout::class,
                    android.widget.LGListView::class to LGListView::class,
                    android.widget.LGListViewFragment::class to LGListViewFragment::class,
                    android.widget.LGProgressBar::class to LGProgressBar::class,
                    android.widget.LGRadioButton::class to LGRadioButton::class,
                    android.widget.LGRecyclerView::class to LGRecyclerView::class,
                    android.widget.LGRecyclerViewAdapter::class to LGRecyclerViewAdapter::class,
                    dev.topping.android.ILGRecyclerViewAdapter::class to ILGRecyclerViewAdapter::class,
                    android.widget.LGRelativeLayout::class to LGRelativeLayout::class,
                    android.widget.LGScrollView::class to LGScrollView::class,
                    android.widget.LGTabLayout::class to LGTabLayout::class,
                    android.widget.LGTextView::class to LGTextView::class,
                    android.widget.LGToolbar::class to LGToolbar::class,
                    android.widget.LGView::class to LGView::class,
                    android.widget.LGViewGroup::class to LGViewGroup::class,
                    android.widget.LGViewPager::class to LGViewPager::class,
                    dev.topping.android.LuaAppBarConfiguration::class to LuaAppBarConfiguration::class,
                    dev.topping.android.LuaBuffer::class to LuaBuffer::class,
                    dev.topping.android.LuaBundle::class to LuaBundle::class,
                    dev.topping.android.LuaColor::class to LuaColor::class,
                    dev.topping.android.luagui.LuaContext::class to LuaContext::class,
                    dev.topping.android.LuaCoroutineScope::class to LuaCoroutineScope::class,
                    dev.topping.android.LuaDatabase::class to LuaDatabase::class,
                    dev.topping.android.LuaDate::class to LuaDate::class,
                    dev.topping.android.LuaDefines::class to LuaDefines::class,
                    dev.topping.android.LuaDialog::class to LuaDialog::class,
                    dev.topping.android.LuaDispatchers::class to LuaDispatchers::class,
                    dev.topping.android.LuaEvent::class to LuaEvent::class,
                    dev.topping.android.LuaForm::class to LuaForm::class,
                    dev.topping.android.ILuaForm::class to ILuaForm::class,
                    dev.topping.android.LuaFragment::class to LuaFragment::class,
                    dev.topping.android.ILuaFragment::class to ILuaFragment::class,
                    dev.topping.android.LuaFragmentManager::class to LuaFragmentManager::class,
                    dev.topping.android.LuaGraphics::class to LuaGraphics::class,
                    dev.topping.android.LuaHttpClient::class to LuaHttpClient::class,
                    dev.topping.android.LuaJob::class to LuaJob::class,
                    dev.topping.android.LuaJSONArray::class to LuaJSONArray::class,
                    dev.topping.android.LuaJSONObject::class to LuaJSONObject::class,
                    dev.topping.android.LuaLifecycle::class to LuaLifecycle::class,
                    dev.topping.android.LuaLifecycleObserver::class to LuaLifecycleObserver::class,
                    dev.topping.android.LuaLifecycleOwner::class to LuaLifecycleOwner::class,
                    dev.topping.android.LuaLiveData::class to LuaLiveData::class,
                    dev.topping.android.LuaLog::class to LuaLog::class,
                    dev.topping.android.LuaMutableLiveData::class to LuaMutableLiveData::class,
                    dev.topping.android.LuaNativeCall::class to LuaNativeCall::class,
                    dev.topping.android.LuaNativeObject::class to LuaNativeObject::class,
                    dev.topping.android.LuaNFC::class to LuaNFC::class,
                    dev.topping.android.LuaNavController::class to LuaNavController::class,
                    dev.topping.android.LuaNavHostFragment::class to LuaNavHostFragment::class,
                    dev.topping.android.LuaNavigationUI::class to LuaNavigationUI::class,
                    dev.topping.android.LuaNavOptions::class to LuaNavOptions::class,
                    dev.topping.android.LuaObjectStore::class to LuaObjectStore::class,
                    dev.topping.android.LuaPoint::class to LuaPoint::class,
                    dev.topping.android.LuaRect::class to LuaRect::class,
                    dev.topping.android.luagui.LuaRef::class to LuaRef::class,
                    dev.topping.android.LuaResource::class to LuaResource::class,
                    dev.topping.android.LuaStore::class to LuaStore::class,
                    dev.topping.android.LuaStream::class to LuaStream::class,
                    dev.topping.android.LuaTab::class to LuaTab::class,
                    dev.topping.android.LuaThread::class to LuaThread::class,
                    dev.topping.android.LuaToast::class to LuaToast::class,
                    dev.topping.android.LuaTranslator::class to LuaTranslator::class,
                    dev.topping.android.luagui.LuaViewInflator::class to LuaViewInflator::class,
                    dev.topping.android.LuaViewModel::class to LuaViewModel::class,
                    dev.topping.android.LuaViewModelProvider::class to LuaViewModelProvider::class
                )
                retBindingMap = HashMap<Any, Any>()
                for ((k, v) in bindingMap!!) {
                    retBindingMap?.put(v, k)
                }
            }
            return bindingMap;
        }
    }

}