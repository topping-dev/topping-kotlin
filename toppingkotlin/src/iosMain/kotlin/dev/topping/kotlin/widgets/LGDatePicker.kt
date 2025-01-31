package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LGDatePicker : LGFrameLayout() {
    var lgDatePicker: cocoapods.Topping.LGDatePicker? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGDatePicker {
            val pobj = dev.topping.kotlin.widgets.LGDatePicker()
            val pres = cocoapods.Topping.LGDatePicker.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun getDay(): Int {
        return lgDatePicker?.getDay()!!
    }

    actual fun getMonth(): Int {
        return lgDatePicker?.getMonth()!!
    }

    actual fun getYear(): Int {
        return lgDatePicker?.getYear()!!
    }

    actual fun updateDate(day: Int, month: Int, year: Int) {
        lgDatePicker?.updateDate(day, month, year)
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setOnDateChangedListener(func: ((LGDatePicker, Int, Int, Int) -> Unit)?) {
        lgDatePicker?.setOnDateChangedListener(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any? {
        return lgDatePicker
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgDatePicker = par as cocoapods.Topping.LGDatePicker?
    }
}