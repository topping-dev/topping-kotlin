package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGTextInputLayout : LGViewGroup() {
    var lgTextInputLayout: cocoapods.Topping.LGTextInputLayout? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGTextInputLayout {
            val pobj = dev.topping.kotlin.widgets.LGTextInputLayout()
            val pres = cocoapods.Topping.LGTextInputLayout.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgTextInputLayout
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgTextInputLayout = par as cocoapods.Topping.LGTextInputLayout?
    }
}