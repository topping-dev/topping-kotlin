package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * EditText
 */
expect open class LGEditText : LGTextView {
    companion object {
        /**
         * Creates LGEditText Object From Lua.
         * @param lc
         * @return LGEditText
         */
        fun create(lc: LuaContext): LGEditText
    }

    /**
     * Sets text changed listener
     * @param lt +fun(textView: LGTextView, view: LGView, s: string):void
     */
    fun setTextChangedListener(func: ((LGEditText, String) -> Unit)?)

    /**
     * Sets before text changed listener
     * @param lt +fun(textView: LGTextView, view: LGView, s: string):void
     */
    fun setBeforeTextChangedListener(func: ((LGEditText, String) -> Unit)?)

    /**
     * Sets after text changed listener
     * @param lt +fun(textView: LGTextView, view: LGView, s: string):void
     */
    fun setAfterTextChangedListener(func: ((LGEditText, String) -> Unit)?)
}