package dev.topping.kotlin.lifecycle

expect open class LuaDispatchers {
    companion object {
        /**
         * Dispatchers Default
         */
        val DEFAULT: Int

        /**
         * Dispatchers Main
         */
        val MAIN: Int

        /**
         * Dispatchers Unconfined
         */
        val UNCONFINED: Int

        /**
         * Dispatchers Io
         */
        val IO: Int
    }
}