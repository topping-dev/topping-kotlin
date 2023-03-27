package dev.topping.kotlin

/**
 * Create toast messages with this class
 */
expect open class LuaToast {
    companion object {
        /**
         * short length duration
         */
        val TOAST_SHORT: Int

        /**
         * long length duration
         */
        val TOAST_LONG: Int

        /**
         * Show the toast
         * @param context
         * @param text text to show
         * @param duration +"LuaToast.TOAST_SHORT" | "LuaToast.TOAST_LONG" | number
         */
        fun show(context: LuaContext, text: LuaRef, duration: Int)

        /**
         * Show the toast
         * @param context
         * @param text text to show
         * @param duration +"LuaToast.TOAST_SHORT" | "LuaToast.TOAST_LONG" | number
         */
        fun show(context: LuaContext, text: String, duration: Int)
    }
}