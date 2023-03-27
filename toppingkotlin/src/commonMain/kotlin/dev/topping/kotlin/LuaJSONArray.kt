package dev.topping.kotlin

/**
 * Class that handles JSON Object.
 */
expect open class LuaJSONArray {
    /**
     * Get array count.
     * @return int count of array.
     */
    fun count(): Int

    /**
     * Get object value at index.
     * @param index value.
     * @return LuaJSONObject
     */
    fun getJSONObject(index: Int): LuaJSONObject?

    /**
     * Get array value at index.
     * @param index value.
     * @return LuaJSONArray
     */
    fun getJSONArray(index: Int): LuaJSONArray?

    /**
     * Get string value at name.
     * @param index value.
     * @return String value.
     */
    fun getString(index: Int): String?

    /**
     * Get int value at name.
     * @param index value.
     * @return int value.
     */
    fun getInt(index: Int): Int?

    /**
     * Get double value at name.
     * @param index value.
     * @return double value.
     */
    fun getDouble(index: Int): Double?

    /**
     * Get float value at name.
     * @param index value.
     * @return float value.
     */
    fun getFloat(index: Int): Float?

    /**
     * Get boolean value at name.
     * @param index value.
     * @return boolean value.
     */
    fun getBool(index: Int): Boolean?
}