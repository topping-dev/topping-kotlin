package dev.topping.kotlin

import dev.topping.kotlin.graphics.LuaGraphics
import dev.topping.kotlin.graphics.LuaPoint
import dev.topping.kotlin.graphics.LuaRect
import dev.topping.kotlin.libs.*
import dev.topping.kotlin.lifecycle.*
import dev.topping.kotlin.resource.*
import dev.topping.kotlin.widgets.LGAbsListView
import dev.topping.kotlin.widgets.LGAdapterView
import dev.topping.kotlin.widgets.LGAutoCompleteTextView
import dev.topping.kotlin.widgets.LGBottomNavigationView
import dev.topping.kotlin.widgets.LGButton
import dev.topping.kotlin.widgets.LGCheckBox
import dev.topping.kotlin.widgets.LGComboBox
import dev.topping.kotlin.widgets.LGCompoundButton
import dev.topping.kotlin.widgets.LGConstraintLayout
import dev.topping.kotlin.widgets.LGDatePicker
import dev.topping.kotlin.widgets.LGDrawerLayout
import dev.topping.kotlin.widgets.LGEditText
import dev.topping.kotlin.widgets.LGFragmentContainerView
import dev.topping.kotlin.widgets.LGFragmentStateAdapter
import dev.topping.kotlin.widgets.LGFrameLayout
import dev.topping.kotlin.widgets.LGHorizontalScrollView
import dev.topping.kotlin.widgets.LGImageView
import dev.topping.kotlin.widgets.LGLinearLayout
import dev.topping.kotlin.widgets.LGListView
import dev.topping.kotlin.widgets.LGNavigationView
import dev.topping.kotlin.widgets.LGProgressBar
import dev.topping.kotlin.widgets.LGRadioButton
import dev.topping.kotlin.widgets.LGRecyclerView
import dev.topping.kotlin.widgets.LGRecyclerViewAdapter
import dev.topping.kotlin.widgets.LGRelativeLayout
import dev.topping.kotlin.widgets.LGScrollView
import dev.topping.kotlin.widgets.LGTabLayout
import dev.topping.kotlin.widgets.LGTextInputEditText
import dev.topping.kotlin.widgets.LGTextInputLayout
import dev.topping.kotlin.widgets.LGTextView
import dev.topping.kotlin.widgets.LGToolbar
import dev.topping.kotlin.widgets.LGView
import dev.topping.kotlin.widgets.LGViewGroup
import dev.topping.kotlin.widgets.LGViewPager
import platform.UIKit.UIWindow

actual class Platform actual constructor() {
    actual companion object {
        private val bindingMap: HashMap<Any, Any> = hashMapOf(
            cocoapods.Topping.LGAbsListView.className().toString() to LGAbsListView::class,
            cocoapods.Topping.LGAdapterView.className().toString() to LGAdapterView::class,
            cocoapods.Topping.LGAutoCompleteTextView.className()
                .toString() to LGAutoCompleteTextView::class,
            cocoapods.Topping.LGBottomNavigationView.className()
                .toString() to LGBottomNavigationView::class,
            cocoapods.Topping.LGButton.className().toString() to LGButton::class,
            cocoapods.Topping.LGCheckBox.className().toString() to LGCheckBox::class,
            cocoapods.Topping.LGComboBox.className().toString() to LGComboBox::class,
            cocoapods.Topping.LGCompoundButton.className().toString() to LGCompoundButton::class,
            cocoapods.Topping.LGConstraintLayout.className()
                .toString() to LGConstraintLayout::class,
            cocoapods.Topping.LGDatePicker.className().toString() to LGDatePicker::class,
            cocoapods.Topping.LGDrawerLayout.className().toString() to LGDrawerLayout::class,
            cocoapods.Topping.LGEditText.className().toString() to LGEditText::class,
            cocoapods.Topping.LGFragmentContainerView.className()
                .toString() to LGFragmentContainerView::class,
            cocoapods.Topping.LGFragmentStateAdapter.className()
                .toString() to LGFragmentStateAdapter::class,
            cocoapods.Topping.LGFrameLayout.className().toString() to LGFrameLayout::class,
            cocoapods.Topping.LGHorizontalScrollView.className()
                .toString() to LGHorizontalScrollView::class,
            cocoapods.Topping.LGImageView.className().toString() to LGImageView::class,
            cocoapods.Topping.LGLinearLayout.className().toString() to LGLinearLayout::class,
            cocoapods.Topping.LGListView.className().toString() to LGListView::class,
            cocoapods.Topping.LGNavigationView.className().toString() to LGNavigationView::class,
            cocoapods.Topping.LGProgressBar.className().toString() to LGProgressBar::class,
            cocoapods.Topping.LGRadioButton.className().toString() to LGRadioButton::class,
            cocoapods.Topping.LGRecyclerView.className().toString() to LGRecyclerView::class,
            cocoapods.Topping.LGRecyclerViewAdapter.className()
                .toString() to LGRecyclerViewAdapter::class,
            cocoapods.Topping.ILGRecyclerViewAdapter.className()
                .toString() to ILGRecyclerViewAdapter::class,
            cocoapods.Topping.LGRelativeLayout.className().toString() to LGRelativeLayout::class,
            cocoapods.Topping.LGScrollView.className().toString() to LGScrollView::class,
            cocoapods.Topping.LGTabLayout.className().toString() to LGTabLayout::class,
            cocoapods.Topping.LGTextView.className().toString() to LGTextView::class,
            cocoapods.Topping.LGTextInputEditText.className()
                .toString() to LGTextInputEditText::class,
            cocoapods.Topping.LGTextInputLayout.className().toString() to LGTextInputLayout::class,
            cocoapods.Topping.LGToolbar.className().toString() to LGToolbar::class,
            cocoapods.Topping.LGView.className().toString() to LGView::class,
            cocoapods.Topping.LGViewGroup.className().toString() to LGViewGroup::class,
            cocoapods.Topping.LGViewPager.className().toString() to LGViewPager::class,
            cocoapods.Topping.LuaAppBarConfiguration.className()
                .toString() to LuaAppBarConfiguration::class,
            cocoapods.Topping.LuaBundle.className().toString() to LuaBundle::class,
            cocoapods.Topping.LuaBuffer.className().toString() to LuaBuffer::class,
            cocoapods.Topping.LuaColor.className().toString() to LuaColor::class,
            cocoapods.Topping.LuaContext.className().toString() to LuaContext::class,
            cocoapods.Topping.LuaCoroutineScope.className().toString() to LuaCoroutineScope::class,
            cocoapods.Topping.LuaDatabase.className().toString() to LuaDatabase::class,
            cocoapods.Topping.LuaDate.className().toString() to LuaDate::class,
            cocoapods.Topping.LuaDefines.className().toString() to LuaDefines::class,
            cocoapods.Topping.LuaDialog.className().toString() to LuaDialog::class,
            cocoapods.Topping.LuaDispatchers.className().toString() to LuaDispatchers::class,
            cocoapods.Topping.LuaEvent.className().toString() to LuaEvent::class,
            cocoapods.Topping.LuaForm.className().toString() to LuaForm::class,
            cocoapods.Topping.ILuaForm.className().toString() to ILuaForm::class,
            cocoapods.Topping.LuaFragment.className().toString() to LuaFragment::class,
            cocoapods.Topping.ILuaFragment.className().toString() to ILuaFragment::class,
            cocoapods.Topping.FragmentManager.className().toString() to LuaFragmentManager::class,
            cocoapods.Topping.LuaGraphics.className().toString() to LuaGraphics::class,
            cocoapods.Topping.LuaHttpClient.className().toString() to LuaHttpClient::class,
            cocoapods.Topping.LuaJob.className().toString() to LuaJob::class,
            cocoapods.Topping.LuaJSONArray.className().toString() to LuaJSONArray::class,
            cocoapods.Topping.LuaJSONObject.className().toString() to LuaJSONObject::class,
            cocoapods.Topping.LuaLifecycle.className().toString() to LuaLifecycle::class,
            cocoapods.Topping.LuaLifecycleObserver.className()
                .toString() to cocoapods.Topping.LuaLifecycleObserver::class,
            cocoapods.Topping.LuaLifecycleOwner.className().toString() to LuaLifecycleOwner::class,
            cocoapods.Topping.LuaLiveData.className().toString() to LuaLiveData::class,
            cocoapods.Topping.LuaLog.className().toString() to LuaLog::class,
            cocoapods.Topping.LuaMutableLiveData.className()
                .toString() to LuaMutableLiveData::class,
            cocoapods.Topping.LuaNativeCall.className().toString() to LuaNativeCall::class,
            cocoapods.Topping.LuaNativeObject.className().toString() to LuaNativeObject::class,
            cocoapods.Topping.LuaNavController.className().toString() to LuaNavController::class,
            cocoapods.Topping.LuaNavHostFragment.className()
                .toString() to LuaNavHostFragment::class,
            cocoapods.Topping.NavOptions.className().toString() to LuaNavOptions::class,
            cocoapods.Topping.LuaObjectStore.className().toString() to LuaObjectStore::class,
            cocoapods.Topping.LuaPoint.className().toString() to LuaPoint::class,
            cocoapods.Topping.LuaRect.className().toString() to LuaRect::class,
            cocoapods.Topping.LuaRef.className().toString() to LuaRef::class,
            cocoapods.Topping.LuaResource.className().toString() to LuaResource::class,
            cocoapods.Topping.LuaStore.className().toString() to LuaStore::class,
            cocoapods.Topping.LuaStream.className().toString() to LuaStream::class,
            cocoapods.Topping.LuaTab.className().toString() to LuaTab::class,
            cocoapods.Topping.LuaThread.className().toString() to LuaThread::class,
            cocoapods.Topping.LuaToast.className().toString() to LuaToast::class,
            cocoapods.Topping.LuaTranslator.className().toString() to LuaTranslator::class,
            cocoapods.Topping.LuaViewInflator.className().toString() to LuaViewInflator::class,
            cocoapods.Topping.LuaViewModel.className().toString() to LuaViewModel::class,
            cocoapods.Topping.LuaViewModelProvider.className()
                .toString() to LuaViewModelProvider::class,
        )
        private val retBindingMap: HashMap<Any, Any>? = null

        actual fun init(activityOrWindow: Any, onBeforeInit: OnBeforeInit, onComplete: OnComplete) {
            onBeforeInit.onBeforeInit()
            cocoapods.Topping.CommonDelegate.getInstance()
                ?.initMain(activityOrWindow as UIWindow, null)
        }

        actual fun getRetBindings(): HashMap<Any, Any>? {
            return retBindingMap
        }

        actual fun getBindings(): HashMap<Any, Any>? {
            /*if(bindingMap == null)
            {
                retBindingMap = HashMap<Any, Any>()
                for ((k, v) in bindingMap!!) {
                    retBindingMap?.put(v, k)
                }
            }*/
            return bindingMap;
        }
    }

}