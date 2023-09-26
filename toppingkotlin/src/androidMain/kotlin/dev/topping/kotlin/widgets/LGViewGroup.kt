package dev.topping.kotlin.widgets

import dev.topping.kotlin.KTWrap
import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaRef

actual open class LGViewGroup : LGView() {
    var lgViewGroup: android.widget.LGViewGroup? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGViewGroup {
            val pobj = dev.topping.kotlin.widgets.LGViewGroup()
            val pres = android.widget.LGViewGroup.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun getViewById(lId: LuaRef): LGView? {
        return KTWrap.Wrap(lgViewGroup?.getViewById(lId.luaRef)) as LGView?
    }

    actual fun addView(view: LGView) {
        lgViewGroup?.addSubview(view.lgView)
    }

    actual fun removeView(view: LGView) {
        lgViewGroup?.removeSubview(view.lgView)
    }

    open override fun GetNativeObject(): Any? {
        return lgViewGroup
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgViewGroup = par as android.widget.LGViewGroup?
    }
}