package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LGButton : LGTextView() {
    var lgButton: cocoapods.Topping.LGButton? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGButton {
            val pobj = dev.topping.kotlin.widgets.LGButton()
            val pres = cocoapods.Topping.LGButton.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    @OptIn(ExperimentalForeignApi::class)
    override fun SetOnClickListenerInternal(func: ((LGView, LuaContext) -> Unit)?): Boolean {
        lgButton?.setOnClickListener(func.toLuaTranslator(this))
        return true
    }

    open override fun GetNativeObject(): Any? {
        return lgButton
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgButton = par as cocoapods.Topping.LGButton?
    }
}