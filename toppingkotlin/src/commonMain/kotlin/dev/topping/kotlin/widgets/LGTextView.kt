package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaRef

/**
 * TextView
 */
expect open class LGTextView : LGView {
    companion object {
        /**
         * Creates LGTextView Object From Lua.
         * @param lc
         * @return LGTextView
         */
        fun create(lc: LuaContext): LGTextView
    }

    /**
     * Sets the text
     * @param val
     */
    fun setText(v: LuaRef?)

    /**
     * Sets the text from ref
     * @param ref
     */
    fun setTextInternal(str: String?)

    /**
     * Gets the text
     * @return String
     */
    fun getText(): String?

    /**
     * Sets the text color
     * @param colorRef
     */
    fun setTextColor(ref: LuaRef?)
}