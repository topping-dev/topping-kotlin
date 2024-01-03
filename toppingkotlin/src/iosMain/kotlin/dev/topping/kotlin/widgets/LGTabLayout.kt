package dev.topping.kotlin.widgets

import dev.topping.kotlin.libs.LuaTab
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LGTabLayout : LGFrameLayout() {
    var lgTabLayout: cocoapods.Topping.LGTabLayout? = null

    actual companion object {
        /*actual fun create(lc: LuaContext?): LGTabLayout?
        {
            val pobj = LGTabLayout()
            val pres = cocoapods.ToppingLGTabLayout(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }*/
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setTabSelectedListener(func: ((LGTabLayout, LuaTab) -> Unit)?) {
        lgTabLayout?.setTabSelectedListener(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any? {
        return lgTabLayout
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgTabLayout = par as cocoapods.Topping.LGTabLayout?
    }
}