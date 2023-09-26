package dev.topping.kotlin.lifecycle

import dev.topping.kotlin.LuaForm
import dev.topping.kotlin.LuaFragment

/**
 * View model provider
 */
expect open class LuaViewModelProvider {
    companion object {
        /**
         * Get LuaViewModelProvider of LuaFragment
         * @param fragment
         * @return LuaViewModelProvider
         */
        fun of(fragment: LuaFragment): LuaViewModelProvider

        /**
         * Get LuaViewModelProvider of LuaForm
         * @param form
         * @return LuaViewModelProvider
         */
        fun of(form: LuaForm): LuaViewModelProvider
    }

    /**
     * Get view model
     * @param tag
     * @return LuaViewModel
     */
    fun get(key: String): LuaViewModel

    /**
     * Get view model
     * @param tag
     * @return LuaViewModel
     */
    inline fun <reified T : Any> get(key: String, obj: T): T
}