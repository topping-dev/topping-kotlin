package dev.topping.kotlin

import kotlin.reflect.KClass

actual class KTClass {
    actual companion object
    {
        actual fun createInstance(cls: KClass<*>): Any?
        {
            //TODO:No createInstance on ios for now
            when(cls.simpleName)
            {
                "LGAbsListView" -> return LGAbsListView()
                "LGAdapterView" -> return LGAdapterView()
                "LGAutoCompleteTextView" -> return LGAutoCompleteTextView()
                "LGBottomNavigationView" -> return LGBottomNavigationView()
                "LGButton" -> return LGButton()
                "LGCheckBox" -> return LGCheckBox()
                "LGComboBox" -> return LGComboBox()
                "LGCompoundButton" -> return LGCompoundButton()
                "LGConstraintLayout" -> return LGConstraintLayout()
                "LGDatePicker" -> return LGDatePicker()
                "LGDrawerLayout" -> return LGDrawerLayout()
                "LGEditText" -> return LGEditText()
                "LGFragmentContainerView" -> return LGFragmentContainerView()
                "LGFragmentStateAdapter" -> return LGFragmentStateAdapter()
                "LGFrameLayout" -> return LGFrameLayout()
                "LGHorizontalScrollView" -> return LGHorizontalScrollView()
                "LGImageView" -> return LGImageView()
                "LGLinearLayout" -> return LGLinearLayout()
                "LGListView" -> return LGListView()
                "LGNavigationView" -> return LGNavigationView()
                "LGProgressBar" -> return LGProgressBar()
                "LGRadioButton" -> return LGRadioButton()
                "LGRecyclerView" -> return LGRecyclerView()
                "LGRecyclerViewAdapter" -> return LGRecyclerViewAdapter()
                "LGRelativeLayout" -> return LGRelativeLayout()
                "LGScrollView" -> return LGScrollView()
                "LGTextInputLayout" -> return LGTextInputLayout()
                "LGTextInputEditText" -> return LGTextInputEditText()
                "LGTextView" -> return LGTextView()
                "LGToolbar" -> return LGToolbar()
                "LGView" -> return LGView()
                "LGViewGroup" -> return LGViewGroup()
                "LGViewPager" -> return LGViewPager()
                "LuaAppBarConfiguration" -> return LuaAppBarConfiguration()
                "LuaBundle" -> return LuaBundle()
                "LuaBuffer" -> return LuaBuffer()
                "LuaColor" -> return LuaColor()
                "LuaContext" -> return LuaContext()
                "LuaCoroutineScope" -> return LuaCoroutineScope()
                "LuaDatabase" -> return LuaDatabase()
                "LuaDate" -> return LuaDate()
                "LuaDefines" -> return LuaDefines()
                "LuaDialog" -> return LuaDialog()
                "LuaDispatchers" -> return LuaDispatchers()
                "LuaEvent" -> return LuaEvent()
                "LuaForm" -> return LuaForm()
                "LuaFragment" -> return LuaFragment()
                "LuaFragmentManager" -> return LuaFragmentManager()
                "LuaGraphics" -> return LuaGraphics()
                "LuaJob" -> return LuaJob()
                "LuaHttpClient" -> return LuaHttpClient()
                "LuaJSONArray" -> return LuaJSONArray()
                "LuaJSONObject" -> return LuaJSONObject()
                "LuaLifecycle" -> return LuaLifecycle()
                "LuaLifecycleObserver" -> return LuaLifecycleObserver()
                "LuaLifecycleOwner" -> return LuaLifecycleOwner()
                "LuaLiveData" -> return LuaLiveData()
                "LuaLog" -> return LuaLog()
                "LuaMutableLiveData" -> return LuaMutableLiveData()
                "LuaNativeCall" -> return LuaNativeCall()
                "LuaNativeObject" -> return LuaNativeObject()
                "LuaNavController" -> return LuaNavController()
                "LuaNavHostFragment" -> return LuaNavHostFragment()
                "LuaNavigationUI" -> return LuaNavigationUI()
                "LuaNavOptions" -> return LuaNavOptions()
                "LuaObjectStore" -> return LuaObjectStore()
                "LuaPoint" -> return LuaPoint()
                "LuaRect" -> return LuaRect()
                "LuaRef" -> return LuaRef()
                "LuaResource" -> return LuaResource()
                "LuaStore" -> return LuaStore()
                "LuaStream" -> return LuaStream()
                "LuaTab" -> return LuaTab()
                "LuaThread" -> return LuaThread()
                "LuaToast" -> return LuaToast()
                "LuaTranslator" -> return LuaTranslator()
                "LuaViewInflator" -> return LuaViewInflator()
                "LuaViewModel" -> return LuaViewModel()
                "LuaViewModelProvider" -> return LuaViewModelProvider()
            }
            return null
        }
    }
}