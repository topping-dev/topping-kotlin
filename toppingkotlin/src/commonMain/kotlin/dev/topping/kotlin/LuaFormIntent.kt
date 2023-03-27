package dev.topping.kotlin

/**
 * Form configuration intent
 */
expect class LuaFormIntent {
    /**
     * Get package bundle
     * @return
     */
    fun getBundle(): LuaBundle

    /**
     * Set flags
     * @param flags
     */
    fun setFlags(flags: Int)
}