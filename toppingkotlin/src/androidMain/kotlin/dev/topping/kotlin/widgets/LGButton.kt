package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGButton : LGTextView() {
    var lgButton: android.widget.LGButton? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGButton {
            val pobj = dev.topping.kotlin.widgets.LGButton()
            val pres = android.widget.LGButton.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgButton
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgButton = par as android.widget.LGButton?
    }
}