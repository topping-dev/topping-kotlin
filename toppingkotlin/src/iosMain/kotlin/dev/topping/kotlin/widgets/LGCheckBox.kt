package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LGCheckBox : LGCompoundButton() {
    var lgCheckBox: cocoapods.Topping.LGCheckBox? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGCheckBox {
            val pobj = dev.topping.kotlin.widgets.LGCheckBox()
            val pres = cocoapods.Topping.LGCheckBox.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setOnCheckedChangedListener(func: ((LGCheckBox, LuaContext, Boolean) -> Unit)?) {
        lgCheckBox?.setOnCheckedChangedListener(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any? {
        return lgCheckBox
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgCheckBox = par as cocoapods.Topping.LGCheckBox?
    }
}