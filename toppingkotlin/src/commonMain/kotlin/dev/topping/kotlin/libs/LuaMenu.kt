package dev.topping.kotlin.libs

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaRef

/**
 * Menu Item for menu resources
 */
expect open class LuaMenu {
    companion object {
        /**
         * Create menu item
         * @param context
         * @param idVal
         * @return
         */
        fun create(lc: LuaContext, id: LuaRef): LuaMenu
    }

    /**
     * Get item id
     * @return id
     */
    fun getItemId(): LuaRef

    /**
     * Set title
     * @param text
     */
    fun setTitle(text: String)

    /**
     * Set title
     * @param text LuaRef
     */
    fun setTitle(text: LuaRef)

    /**
     * Set Icon
     * @param icon
     */
    fun setIcon(icon: LuaRef)
}