package dev.topping.kotlin

/**
 * Scroll view
 */
expect open class LGScrollView : LGFrameLayout {
    companion object {
        /**
         * Creates LGScrollView Object From Lua.
         * @param lc
         * @return LGScrollView
         */
        fun create(lc: LuaContext): LGScrollView
    }
}