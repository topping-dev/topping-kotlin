package dev.topping.kotlin.libs

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaRef
import dev.topping.kotlin.LuaTranslator

/**
 * Lua dialog class.
 * This class is used to create dialogs and manupilate it from lua.
 * There are five types of dialogs.
 * DIALOG_TYPE_NORMAL
 * DIALOG_TYPE_PROGRESS
 * DIALOG_TYPE_PROGRESS_INDETERMINATE
 * DIALOG_TYPE_DATEPICKER
 * DIALOG_TYPE_TIMEPICKER
 */
expect open class LuaDialog {
    companion object {
        /**
         * for creating normal dialog
         */
        val DIALOG_TYPE_NORMAL: Int

        /**
         * for creating progress dialog
         */
        val DIALOG_TYPE_PROGRESS: Int

        /**
         * for creating indeterminate progress dialog
         */
        val DIALOG_TYPE_PROGRESS_INDETERMINATE: Int

        /**
         * for creating date picker dialog
         */
        val DIALOG_TYPE_DATEPICKER: Int

        /**
         * for creating time picker dialog
         */
        val DIALOG_TYPE_TIMEPICKER: Int

        /**
         * Shows a messagebox
         * @param context lua context value
         * @param title title text
         * @param content content text
         */
        fun messageBox(context: LuaContext, title: LuaRef, content: LuaRef)

        /**
         * Shows a messagebox
         * @param context lua context value
         * @param title title text
         * @param content content text
         */
        fun messageBoxInternal(context: LuaContext, title: String, content: String)

        /**
         * Creates LuaDialog for build
         * @param context
         * @param dialogType +"LuaDialog.DIALOG_TYPE_NORMAL" | "LuaDialog.DIALOG_TYPE_PROGRESS" | "LuaDialog.DIALOG_TYPE_NORMAL" | "LuaDialog.DIALOG_TYPE_PROGRESS_INDETERMINATE" | "LuaDialog.DIALOG_TYPE_DATEPICKER" | "LuaDialog.DIALOG_TYPE_TIMEPICKER"
         * @return LuaDialog
         */
        fun create(context: LuaContext, dialogType: Int): LuaDialog
    }

    /**
     * Sets the positive button of LuaDialog
     * @param title title of the button
     * @param action action to do when button is pressed
     */
    fun setPositiveButton(title: LuaRef, action: LuaTranslator?)

    /**
     * Sets the positive button of LuaDialog
     * @param title title of the button
     * @param action action to do when button is pressed
     */
    fun setPositiveButtonInternal(title: String, action: LuaTranslator?)

    /**
     * Sets the negative button of LuaDialog
     * @param title title of the button
     * @param action action to do when button is pressed
     */
    fun setNegativeButton(title: LuaRef, action: LuaTranslator?)

    /**
     * Sets the negative button of LuaDialog
     * @param title title of the button
     * @param action action to do when button is pressed
     */
    fun setNegativeButtonInternal(title: String, action: LuaTranslator?)

    /**
     * Sets the title of the LuaDialog
     * @param title
     */
    fun setTitle(title: String)

    /**
     * Sets the title of the LuaDialog
     * @param titleRef
     */
    fun setTitle(titleRef: LuaRef)

    /**
     * Sets the message of the LuaDialog
     * @param message
     */
    fun setMessage(message: String)

    /**
     * Sets the message of the LuaDialog
     * @param messageRef
     */
    fun setMessage(messageRef: LuaRef)

    /**
     * Sets the value of the progress bar
     * (progress bar is needed otherwise it wont effect anything)
     * @param value
     */
    fun setProgress(value: Int)

    /**
     * Sets the maximum value of the progress bar
     * (progress bar is needed otherwise it wont effect anything)
     * @param value
     */
    fun setMax(value: Int)

    /**
     * Sets the date of the date picker
     * (date picker dialog is needed otherwise it wort effect anything)
     * @param date
     */
    fun setDate(date: LuaDate)

    /**
     * Sets the date of the date picker
     * (date picker dialog is needed otherwise it wort effect anything)
     * @param day
     * @param month
     * @param year
     */
    fun setDateManual(day: Int, month: Int, year: Int)

    /**
     * Sets the time of the time picker
     * (time picker dialog is needed otherwise it wort effect anything)
     * @param date
     */
    fun setTime(date: LuaDate)

    /**
     * Sets the time of the time picker
     * (time picker dialog is needed otherwise it wort effect anything)
     * @param hour
     * @param minute
     */
    fun setTimeManual(hour: Int, minute: Int)

    /**
     * Shows the created dialog of LuaDialog
     */
    fun show()

    /**
     * Dismiss the created dialog
     */
    fun dismiss()

    /**
     * Sets combo changed listener
     * @param lt +fun(datePicker: LuaDialog, context: LuaContext, day: number, month: number, year: number):void
     */
    fun setDateSelectedListener(func: ((LuaDialog, Int, Int, Int) -> Unit)?)

    /**
     * Sets combo changed listener
     * @param lt +fun(timePicker: LuaDialog, context: LuaContext, hour: number, minute: number):void
     */
    fun setTimeSelectedListener(func: ((LuaDialog, Int, Int, Int) -> Unit)?)
}