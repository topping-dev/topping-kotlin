package dev.topping.kotlin

/**
 * Mutable live data
 */
expect open class LuaMutableLiveData : LuaLiveData {
    companion object {
        /**
         * Create mutable live data
         */
        fun create(): LuaMutableLiveData
    }

    /**
     * set value
     * @param value
     */
    fun setValue(value: Any?)

    /**
     * post value
     * @param value
     */
    fun postValue(value: Any?)
}