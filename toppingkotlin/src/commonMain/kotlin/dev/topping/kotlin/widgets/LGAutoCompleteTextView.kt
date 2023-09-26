package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * AutoCompleteTextView
 */
expect open class LGAutoCompleteTextView : LGEditText {
    companion object {
        /**
         * Creates LGAutoCompleteTextView Object From Lua.
         * @param lc
         * @return LGAutoCompleteTextView
         */
        fun create(lc: LuaContext): LGAutoCompleteTextView
    }
}