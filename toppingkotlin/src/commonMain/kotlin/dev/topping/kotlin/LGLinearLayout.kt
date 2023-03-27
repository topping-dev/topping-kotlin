package dev.topping.kotlin

/**
 * Linear Layout
 */
expect open class LGLinearLayout : LGViewGroup {
    companion object {
        /**
         * Creates LGLinearLayout Object From Lua.
         * @param lc
         * @return LGLinearLayout
         */
        fun create(lc: LuaContext): LGLinearLayout
    }
}