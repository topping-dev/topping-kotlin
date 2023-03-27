package dev.topping.kotlin

/**
 * View model
 */
expect open class LuaViewModel() {
    /**
     * Set LuaViewModel object
     * @param key
     * @param obj
     */
    fun setObject(key: String, obj: Any?)

    /**
     * Get LuaViewModel object
     * @param key
     * @return object
     */
    fun getObject(key: String): Any?
    protected val viewModelScope: LuaCoroutineScope
}