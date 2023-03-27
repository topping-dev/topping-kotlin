package dev.topping.kotlin

/**
 * Constraint Layout
 */
expect open class LGConstraintLayout : LGViewGroup {
    companion object {
        /**
         * Creates LGConstraintLayout Object From Lua.
         * @param lc
         * @return LGConstraintLayout
         */
        fun create(lc: LuaContext): LGConstraintLayout
    }
}