package dev.topping.kotlin

expect open class LuaContext {
    companion object {
        /**
         * Creates LuaContext Object From Lua.
         * @return LuaContext
         */
        fun createLuaContext(context: Any): LuaContext
    }

    /**
     * Gets binded form.
     * @return LuaForm
     */
    fun getForm(): LuaForm

    /**
     * Starts form from created form intent
     * @see dev.topping.android.LuaForm Create
     */
    fun startForm(luaFormIntent: LuaFormIntent)
}