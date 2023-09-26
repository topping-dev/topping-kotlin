package dev.topping.kotlin

import dev.topping.kotlin.widgets.LGView

/**
 * Fragment manager
 */
expect open class LuaFragmentManager {
    companion object {
        /**
         * Find LuaFragment with view
         * @param view
         */
        fun findFragment(view: LGView): LuaFragment?
    }

    /**
     * Find LuaFragment by id
     * @param id
     */
    fun findFragmentById(id: Any): LuaFragment?

    /**
     * Find LuaFragment by tag
     * @param tag
     */
    fun findFragmentByTag(tag: String): LuaFragment?
}