package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGHorizontalScrollView : LGFrameLayout() {
    var lgHorizontalScrollView: cocoapods.Topping.LGHorizontalScrollView? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGHorizontalScrollView {
            val pobj = dev.topping.kotlin.widgets.LGHorizontalScrollView()
            val pres = cocoapods.Topping.LGHorizontalScrollView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgHorizontalScrollView
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgHorizontalScrollView = par as cocoapods.Topping.LGHorizontalScrollView?
    }
}