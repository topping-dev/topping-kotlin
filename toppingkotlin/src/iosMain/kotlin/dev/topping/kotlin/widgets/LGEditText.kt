package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LGEditText : LGTextView() {
    var lgEditText: cocoapods.Topping.LGEditText? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGEditText {
            val pobj = dev.topping.kotlin.widgets.LGEditText()
            val pres = cocoapods.Topping.LGEditText.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setTextChangedListener(func: ((LGEditText, String) -> Unit)?) {
        lgEditText?.setTextChangedListener(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setBeforeTextChangedListener(func: ((LGEditText, String) -> Unit)?) {
        lgEditText?.setBeforeTextChangedListener(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setAfterTextChangedListener(func: ((LGEditText, String) -> Unit)?) {
        lgEditText?.setAfterTextChangedListener(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any? {
        return lgEditText
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgEditText = par as cocoapods.Topping.LGEditText?
    }
}