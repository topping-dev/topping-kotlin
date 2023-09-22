package dev.topping.kotlin

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
     * @param backgroundRef
     */
    fun setBackground(background: LuaRef?)

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