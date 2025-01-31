package dev.topping.kotlin.widgets

import dev.topping.kotlin.KTWrap
import dev.topping.kotlin.LuaContext
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.StableRef

actual open class LGRadioGroup : LGLinearLayout() {
    var lgRadioGroup: cocoapods.Topping.LGRadioGroup? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGRadioGroup {
            val pobj = dev.topping.kotlin.widgets.LGRadioGroup()
            val pres = cocoapods.Topping.LGRadioGroup.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setOnCheckedChangedListener(func: ((Int, Boolean) -> Unit)?) {
        val kt: KTWrap = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        lgRadioGroup?.setOnCheckedChangedListener(lt)
    }

    override open fun GetNativeObject(): cocoapods.Topping.LGRadioGroup? {
        return lgRadioGroup
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgRadioGroup = par as cocoapods.Topping.LGRadioGroup?
    }
}