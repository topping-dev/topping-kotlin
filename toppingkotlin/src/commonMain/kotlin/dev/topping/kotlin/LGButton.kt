package dev.topping.kotlin

/**
 * Button
 */
expect open class LGButton : LGTextView {
    companion object {
        /**
         * Creates LGButton Object From Lua.
         * @param lc
         * @return LGButton
         */
        fun create(lc: LuaContext): LGButton
    }
}