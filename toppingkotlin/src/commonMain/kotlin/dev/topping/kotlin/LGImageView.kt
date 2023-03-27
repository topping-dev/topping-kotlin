package dev.topping.kotlin

/**
 * ImageView
 */
expect open class LGImageView : LGView {
    companion object {
        /**
         * Creates LGImageView Object From Lua.
         * @param lc LuaContext
         * @param luaId String
         * @return LGImageView
         */
        fun create(lc: LuaContext, luaId: String): LGImageView
    }

    /**
     * Sets the image view from LuaStream stream
     * @param stream
     */
    fun setImage(stream: LuaStream?)

    /**
     * Sets the image view from ref
     * @param ref
     */
    fun setImageRef(ref: LuaRef?)
}