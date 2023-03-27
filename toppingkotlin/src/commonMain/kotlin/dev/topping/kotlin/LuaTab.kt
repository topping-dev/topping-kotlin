package dev.topping.kotlin

expect open class LuaTab {
    companion object {
        /**
         * Create LuaTab
         * @return LuaTab
         */
        fun create(): LuaTab
    }

    /**
     * Set tab title
     * @param text
     */
    fun setText(text: String)

    /**
     * Set tab title
     * @param text
     */
    fun setText(text: LuaRef)

    /**
     * Set tab icon
     * @param icon
     */
    fun setIcon(icon: LuaRef)

    /**
     * Set tab icon
     * @param icon
     */
    fun setIcon(icon: LuaStream)

    /**
     * Set tab custom view
     * @param view
     */
    fun setCustomView(view: LGView)
}