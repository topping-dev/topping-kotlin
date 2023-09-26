package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaRef
import dev.topping.kotlin.navigation.LuaNavController
import dev.topping.kotlin.resource.TDrawable

expect open class LGView {
    companion object {
        /**
         * Creates LGView Object From Lua.
         * @param lc
         * @return LGView
         */
        fun create(lc: LuaContext): LGView
    }

    /**
     * Set enabled
     * @param value
     */
    fun setEnabled(value: Boolean)

    /**
     * Set focusable
     * @param value
     */
    fun setFocusable(value: Boolean)

    /**
     * Set background ref
     * @param background
     */
    fun setBackground(background: LuaRef)

    /**
     * Adds click event to button
     * @param lt +fun(view: LGView, context: LuaContext):void
     */
    fun setOnClickListener(func: ((LGView, LuaContext) -> Unit)?)

    /**
     * Gets navigation controller of view
     * @return LuaNavController
     */
    fun findNavController(): LuaNavController
}