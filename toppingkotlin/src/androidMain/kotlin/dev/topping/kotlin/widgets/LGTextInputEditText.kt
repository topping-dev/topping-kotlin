package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGTextInputEditText : LGEditText() {
    var lgTextInputEditText: android.widget.LGTextInputEditText? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGTextInputEditText {
            val pobj = dev.topping.kotlin.widgets.LGTextInputEditText()
            val pres = android.widget.LGTextInputEditText.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgTextInputEditText
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgTextInputEditText = par as android.widget.LGTextInputEditText?
    }
}