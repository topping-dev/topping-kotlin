package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * Material EditText
 */
expect open class LGTextInputEditText : LGEditText {
    companion object {
        /**
         * Creates LGTextInputEditText Object From Lua.
         * @param lc
         * @return LGTextInputEditText
         */
        fun create(lc: LuaContext): LGTextInputEditText
    }
}