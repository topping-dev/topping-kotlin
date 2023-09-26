package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaRef
import dev.topping.kotlin.resource.LuaStream
import dev.topping.kotlin.resource.TDrawable

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
     * Set image drawable
     * @param drawable
     */
    fun setImage(drawable: TDrawable?)

    /**
     * Sets the image view from ref
     * @param ref
     */
    fun setImageRef(ref: LuaRef?)
}