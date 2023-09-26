package dev.topping.kotlin.libs

/**
 * Class that handles JSON Object.
 */
expect open class LuaJSONObject {
    companion object {
        /**
         * Creates LuaJSON from json string.
         * @param str
         * return LuaJSONObject
         */
        fun createJSOFromString(str: String): LuaJSONObject?
    }

    /**
     * Get object value at name.
     * @param name Name value.
     * @return LuaJSONObject
     */
    fun getJSONObject(name: String): LuaJSONObject?

    /**
     * Get array value at name.
     * @param name Name value.
     * @return LuaJSONArray
     */
    fun getJSONArray(name: String): LuaJSONArray?

    /**
     * Get string value at name.
     * @param name Name value.
     * @return String value.
     */
    fun getString(name: String): String?

    /**
     * Get int value at name.
     * @param name Name value.
     * @return int value.
     */
    fun getInt(name: String): Int?

    /**
     * Get double value at name.
     * @param name Name value.
     * @return double value.
     */
    fun getDouble(name: String): Double?

    /**
     * Get float value at name.
     * @param name Name value.
     * @return float value.
     */
    fun getFloat(name: String): Float?

    /**
     * Get boolean value at name.
     * @param name Name value.
     * @return boolean value.
     */
    fun getBool(name: String): Boolean?
}