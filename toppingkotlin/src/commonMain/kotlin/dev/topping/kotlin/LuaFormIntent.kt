package dev.topping.kotlin

import dev.topping.kotlin.resource.LuaBundle

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