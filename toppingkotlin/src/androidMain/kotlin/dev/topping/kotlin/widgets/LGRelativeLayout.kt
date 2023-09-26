package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGRelativeLayout : LGViewGroup() {
    var lgRelativeLayout: android.widget.LGRelativeLayout? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGRelativeLayout {
            val pobj = dev.topping.kotlin.widgets.LGRelativeLayout()
            val pres = android.widget.LGRelativeLayout.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgRelativeLayout
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgRelativeLayout = par as android.widget.LGRelativeLayout?
    }
}