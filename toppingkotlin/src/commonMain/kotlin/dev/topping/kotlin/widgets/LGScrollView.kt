package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

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