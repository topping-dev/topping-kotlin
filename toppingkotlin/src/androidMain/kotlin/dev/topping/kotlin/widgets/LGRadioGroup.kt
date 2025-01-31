package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.toLuaTranslator

actual open class LGRadioGroup : LGLinearLayout() {
    var lgRadioGroup: android.widget.LGRadioGroup? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGRadioGroup {
            val pobj = dev.topping.kotlin.widgets.LGRadioGroup()
            val pres = android.widget.LGRadioGroup.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun setOnCheckedChangedListener(func: ((Int, Boolean) -> Unit)?) {
        lgRadioGroup?.setOnCheckedChangedListener(func.toLuaTranslator(this))
    }

    override open fun GetNativeObject(): android.widget.LGRadioGroup? {
        return lgRadioGroup
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgRadioGroup = par as android.widget.LGRadioGroup?
    }
}