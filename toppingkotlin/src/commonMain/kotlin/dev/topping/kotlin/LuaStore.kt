package dev.topping.kotlin

/**
 * General store for storing string and numbers in dictionary
 * Keys must be string value
 */
expect open class LuaStore {
    companion object {
        /**
         * Sets the string value to store
         * @param key
         * @param value
         */
        fun setString(key: String, value: String?)

        /**
         * Sets the number value to store
         * @param key
         * @param value
         */
        fun setNumber(key: String, value: Double)

        /**
         * Gets value stored at key
         * @param key
         * @return
         */
        fun get(key: String): Any?

        /**
         * Gets string value stored at key
         * @param key
         * @return String
         */
        fun getString(key: String): String?

        /**
         * Gets number value stored at key
         * @param key
         * @return double
         */
        fun getNumber(key: String): Double?
    }
}