package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGScrollView : LGFrameLayout() {
    var lgScrollView: cocoapods.Topping.LGScrollView? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGScrollView {
            val pobj = dev.topping.kotlin.widgets.LGScrollView()
            val pres = cocoapods.Topping.LGScrollView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgScrollView
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgScrollView = par as cocoapods.Topping.LGScrollView?
    }
}