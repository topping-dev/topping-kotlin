package dev.topping.kotlin

/**
 * Threading implementation
 */
expect open class LuaThread {
    companion object {
        /**
         * Run function on ui thread
         * @param lt +fun():void
         */
        fun runOnUIThread(func: () -> Unit)

        /**
         * Run function on background thread
         * @param lt +fun(thread: LuaThread):void
         */
        fun runOnBackground(func: () -> Unit)

        /**
         * Create new thread
         * @param lt +fun(thread: LuaThread):void
         * @return LuaThread
         */
        fun create(func: () -> Unit): LuaThread
    }

    /**
     * Run the thread
     */
    fun start()

    /**
     * Interrupt thread
     */
    fun interrupt()

    /**
     * Sleep thread
     * @param milliseconds
     */
    fun sleep(milliseconds: Long)
}