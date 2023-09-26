package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaRef

actual open class LGTextView : LGView() {
    var lgTextView: android.widget.LGTextView? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGTextView {
            val pobj = dev.topping.kotlin.widgets.LGTextView()
            val pres = android.widget.LGTextView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun setText(v: LuaRef?) {
        lgTextView?.setText(v?.luaRef)
    }

    actual fun setTextInternal(str: String?) {
        lgTextView?.setTextInternal(str)
    }

    actual fun getText(): String? {
        return lgTextView?.getText()
    }

    actual fun setTextColor(ref: LuaRef?) {
        lgTextView?.setTextColor(ref?.luaRef)
    }

    open override fun GetNativeObject(): Any? {
        return lgTextView
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgTextView = par as android.widget.LGTextView?
    }
}