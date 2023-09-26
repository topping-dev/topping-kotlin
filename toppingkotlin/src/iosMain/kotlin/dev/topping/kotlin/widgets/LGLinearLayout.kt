package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGLinearLayout : LGViewGroup() {
    var lgLinearLayout: cocoapods.Topping.LGLinearLayout? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGLinearLayout {
            val pobj = dev.topping.kotlin.widgets.LGLinearLayout()
            val pres = cocoapods.Topping.LGLinearLayout.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgLinearLayout
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgLinearLayout = par as cocoapods.Topping.LGLinearLayout?
    }
}