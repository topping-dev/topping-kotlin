package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGTextInputLayout : LGViewGroup() {
    var lgTextInputLayout: android.widget.LGTextInputLayout? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGTextInputLayout {
            val pobj = dev.topping.kotlin.widgets.LGTextInputLayout()
            val pres = android.widget.LGTextInputLayout.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgTextInputLayout
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgTextInputLayout = par as android.widget.LGTextInputLayout?
    }
}