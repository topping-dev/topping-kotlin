package dev.topping.kotlin

expect open class LuaLog {
    companion object {
        /**
         * Logs verbose
         * @param tag
         * @param message
         */
        fun v(tag: String, message: String)

        /**
         * Logs debug
         * @param tag
         * @param message
         */
        fun d(tag: String, message: String)

        /**
         * Logs info
         * @param tag
         * @param message
         */
        fun i(tag: String, message: String)

        /**
         * Logs warn
         * @param tag
         * @param message
         */
        fun w(tag: String, message: String)

        /**
         * Logs error
         * @param tag
         * @param message
         */
        fun e(tag: String, message: String)
    }
}