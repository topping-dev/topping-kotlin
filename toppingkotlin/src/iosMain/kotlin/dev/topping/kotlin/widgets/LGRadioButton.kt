package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGRadioButton : LGCompoundButton() {
    var lgRadioButton: cocoapods.Topping.LGRadioButton? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGRadioButton {
            val pobj = dev.topping.kotlin.widgets.LGRadioButton()
            val pres = cocoapods.Topping.LGRadioButton.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgRadioButton
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgRadioButton = par as cocoapods.Topping.LGRadioButton?
    }
}