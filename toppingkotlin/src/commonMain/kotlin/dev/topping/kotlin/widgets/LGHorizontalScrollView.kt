package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * HorizontalScrollView
 */
expect open class LGHorizontalScrollView : LGFrameLayout {
    companion object {
        /**
         * Creates LGHorizontalScrollView Object From Lua.
         * @param lc
         * @return LGHorizontalScrollView
         */
        fun create(lc: LuaContext): LGHorizontalScrollView
    }
}