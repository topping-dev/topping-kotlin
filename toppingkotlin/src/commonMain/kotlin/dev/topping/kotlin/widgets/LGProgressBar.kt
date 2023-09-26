package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * ProgressBar
 */
expect open class LGProgressBar : LGView {
    companion object {
        /**
         * Creates LGProgressBar Object From Lua.
         * @param lc
         * @return LGProgressBar
         */
        fun create(lc: LuaContext): LGProgressBar
    }

    /**
     * Sets the progress
     * @param val
     */
    fun setProgress(v: Int)

    /**
     * Sets the max progress
     * @param val
     */
    fun setMax(v: Int)

    /**
     * Sets the indeterminate
     * @param val
     */
    fun setIndeterminate(v: Boolean)
}