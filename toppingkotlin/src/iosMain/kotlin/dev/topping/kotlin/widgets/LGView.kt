package dev.topping.kotlin.widgets

import dev.topping.kotlin.*
import dev.topping.kotlin.navigation.LuaNavController
import dev.topping.kotlin.resource.TDrawable
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LGView : KTInterface {
    var lgView: cocoapods.Topping.LGView? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGView {
            val pobj = dev.topping.kotlin.widgets.LGView()
            val pres = cocoapods.Topping.LGView.create(lc.luaContext)
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

    @OptIn(ExperimentalForeignApi::class)
    actual fun setOnClickListener(func: ((LGView, LuaContext) -> Unit)?) {
        if (SetOnClickListenerInternal(func))
            return
        lgView?.setOnClickListener(func.toLuaTranslator(this))
    }

    open fun SetOnClickListenerInternal(func: ((LGView, LuaContext) -> Unit)?): Boolean {
        return false;
    }

    actual open fun findNavController(): LuaNavController {
        return KTWrap.Wrap(lgView?.findNavControllerInternal()) as LuaNavController
    }

    open override fun GetNativeObject(): Any? {
        return lgView
    }

    open override fun SetNativeObject(par: Any?) {
        lgView = par as cocoapods.Topping.LGView?
    }
}