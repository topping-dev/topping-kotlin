package dev.topping.kotlin.libs

import dev.topping.kotlin.*
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LuaDialog : KTInterface {
    var luaDialog: cocoapods.Topping.LuaDialog? = null

    actual companion object {
        actual val DIALOG_TYPE_NORMAL: Int = 0x01
        actual val DIALOG_TYPE_PROGRESS: Int = 0x02
        actual val DIALOG_TYPE_PROGRESS_INDETERMINATE: Int = 0x6
        actual val DIALOG_TYPE_DATEPICKER: Int = 0x08
        actual val DIALOG_TYPE_TIMEPICKER: Int = 0x10
        actual fun messageBox(context: LuaContext, title: LuaRef, content: LuaRef) {
            cocoapods.Topping.LuaDialog.messageBox(context.luaContext, title.luaRef, content.luaRef)
        }

        actual fun messageBoxInternal(context: LuaContext, title: String, content: String) {
            cocoapods.Topping.LuaDialog.messageBoxInternal(context.luaContext, title, content)
        }

        actual fun create(context: LuaContext, dialogType: Int): LuaDialog {
            val pobj = LuaDialog()
            val pres = cocoapods.Topping.LuaDialog.create(context.luaContext, dialogType)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun setPositiveButton(title: LuaRef, action: LuaTranslator?) {
        luaDialog?.setPositiveButton(title.luaRef, action?.luaTranslator)
    }

    actual fun setPositiveButtonInternal(title: String, action: LuaTranslator?) {
        luaDialog?.setPositiveButtonInternal(title, action?.luaTranslator)
    }

    actual fun setNegativeButton(title: LuaRef, action: LuaTranslator?) {
        luaDialog?.setNegativeButton(title.luaRef, action?.luaTranslator)
    }

    actual fun setNegativeButtonInternal(title: String, action: LuaTranslator?) {
        luaDialog?.setNegativeButtonInternal(title, action?.luaTranslator)
    }

    actual fun setTitle(title: String) {
        luaDialog?.setTitle(title)
    }

    actual fun setTitle(titleRef: LuaRef) {
        luaDialog?.setTitleRef(titleRef.luaRef)
    }

    actual fun setMessage(message: String) {
        luaDialog?.setMessage(message)
    }

    actual fun setMessage(messageRef: LuaRef) {
        luaDialog?.setMessageRef(messageRef.luaRef)
    }

    actual fun setProgress(value: Int) {
        luaDialog?.setProgress(value)
    }

    actual fun setMax(value: Int) {
        luaDialog?.setMax(value)
    }

    actual fun setDate(date: LuaDate) {
        luaDialog?.setDate(date.luaDate)
    }

    actual fun setDateManual(day: Int, month: Int, year: Int) {
        luaDialog?.setDateManual(day, month, year)
    }

    actual fun setTime(date: LuaDate) {
        luaDialog?.setTime(date.luaDate)
    }

    actual fun setTimeManual(hour: Int, minute: Int) {
        luaDialog?.setTimeManual(hour, minute)
    }

    actual fun show() {
        luaDialog?.show()
    }

    actual fun dismiss() {
        luaDialog?.dismiss()
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setDateSelectedListener(func: ((LuaDialog, Int, Int, Int) -> Unit)?) {
        luaDialog?.setDateSelectedListener(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setTimeSelectedListener(func: ((LuaDialog, Int, Int, Int) -> Unit)?) {
        luaDialog?.setTimeSelectedListener(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any? {
        return luaDialog
    }

    open override fun SetNativeObject(par: Any?) {
        luaDialog = par as cocoapods.Topping.LuaDialog?
    }
}