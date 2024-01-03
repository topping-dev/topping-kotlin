package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.libs.LuaMenu
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LGNavigationView : LGLinearLayout() {
    var lgNavigationView: cocoapods.Topping.LGNavigationView? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGNavigationView {
            val pobj = dev.topping.kotlin.widgets.LGNavigationView()
            val pres = cocoapods.Topping.LGNavigationView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setNavigationItemSelectListener(func: ((LGNavigationView, LuaMenu) -> Unit)?) {
        lgNavigationView?.setNavigationItemSelectListener(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any? {
        return lgNavigationView
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgNavigationView = par as cocoapods.Topping.LGNavigationView?
    }
}