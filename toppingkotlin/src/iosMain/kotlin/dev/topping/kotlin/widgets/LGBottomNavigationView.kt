package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LGBottomNavigationView : LGFrameLayout() {
    var lgBottomNavigationView: cocoapods.Topping.LGBottomNavigationView? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGBottomNavigationView {
            val pobj = dev.topping.kotlin.widgets.LGBottomNavigationView()
            val pres = cocoapods.Topping.LGBottomNavigationView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setTabSelectedListener(func: ((LGBottomNavigationView, Int) -> Unit)?) {
        lgBottomNavigationView?.setTabSelectedListener(func.toLuaTranslator(this));
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setCanSelectTab(func: ((LGBottomNavigationView, Int) -> Boolean)?) {
        lgBottomNavigationView?.setCanSelectTab(func.toLuaTranslator(this));
    }

    open override fun GetNativeObject(): Any? {
        return lgBottomNavigationView
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgBottomNavigationView = par as cocoapods.Topping.LGBottomNavigationView?
    }
}