package dev.topping.kotlin.widgets

import dev.topping.kotlin.*
import dev.topping.kotlin.navigation.LuaNavController
import dev.topping.kotlin.resource.TDrawable

actual open class LGView : KTInterface {
    var lgView: android.widget.LGView? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGView {
            val pobj = dev.topping.kotlin.widgets.LGView()
            val pres = android.widget.LGView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun setEnabled(value: Boolean) {
        lgView?.setEnabled(value)
    }

    actual fun setFocusable(value: Boolean) {
        lgView?.setFocusable(value)
    }

    actual fun setBackground(background: LuaRef) {
        lgView?.setBackground(background.luaRef)
    }

    actual fun setOnClickListener(func: ((LGView, LuaContext) -> Unit)?) {
        lgView?.setOnClickListener(func.toLuaTranslator(this))
    }

    actual open fun findNavController(): LuaNavController {
        return KTWrap.Wrap(lgView?.findNavController()) as LuaNavController
    }

    open override fun GetNativeObject(): Any? {
        return lgView
    }

    open override fun SetNativeObject(par: Any?) {
        lgView = par as android.widget.LGView?
    }
}