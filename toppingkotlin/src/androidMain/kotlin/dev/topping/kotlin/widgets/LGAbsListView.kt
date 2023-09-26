package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGAbsListView : LGViewGroup() {
    var lgAbsListView: android.widget.LGAbsListView? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGAbsListView? {
            val pobj = LGAbsListView()
            val pres = android.widget.LGAbsListView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgAbsListView
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgAbsListView = par as android.widget.LGAbsListView?
    }
}