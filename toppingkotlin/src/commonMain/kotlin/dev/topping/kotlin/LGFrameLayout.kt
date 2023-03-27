package dev.topping.kotlin

/**
 * Frame layout
 */
expect open class LGFrameLayout : LGViewGroup {
    companion object {
        /**
         * Creates LGFrameLayout Object From Lua.
         * @param lc
         * @return LGFrameLayout
         */
        fun create(lc: LuaContext): LGFrameLayout
    }
}