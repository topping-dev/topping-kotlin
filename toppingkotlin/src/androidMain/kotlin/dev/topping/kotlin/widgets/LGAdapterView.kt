package dev.topping.kotlin.widgets

import dev.topping.kotlin.KTInterface
import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.toLuaTranslator

actual open class LGAdapterView : KTInterface {
    var lgAdapterView: android.widget.LGAdapterView? = null

    actual companion object {
        actual fun create(lc: LuaContext, id: String): LGAdapterView {
            val pobj = dev.topping.kotlin.widgets.LGAdapterView()
            val pres = android.widget.LGAdapterView.create(lc.luaContext, id)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun addSection(header: String, id: String): LGAdapterView {
        val pobj = dev.topping.kotlin.widgets.LGAdapterView()
        val obj = lgAdapterView?.addSection(header, id)
        pobj.SetNativeObject(obj)
        return pobj
    }

    actual fun removeSection(header: String) {
        lgAdapterView?.removeSection(header)
    }

    actual fun addValue(value: Any) {
        lgAdapterView?.addValue(value)
    }

    actual fun removeValue(value: Any) {
        lgAdapterView?.removeValue(value)
    }

    actual fun clear() {
        lgAdapterView?.clear()
    }

    actual fun setOnAdapterView(func: (LGAdapterView, LGView, Int, Any, LGView, LuaContext) -> LGView) {
        lgAdapterView?.setOnAdapterView(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any? {
        return lgAdapterView
    }

    open override fun SetNativeObject(par: Any?) {
        lgAdapterView = par as android.widget.LGAdapterView?
    }
}