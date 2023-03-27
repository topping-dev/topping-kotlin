package dev.topping.kotlin

/**
 * RelativeLayout
 */
expect open class LGRelativeLayout : LGViewGroup {
    companion object {
        /**
         * Creates LGRelativeLayout Object From Lua.
         * @param lc
         * @return LGRelativeLayout
         */
        fun create(lc: LuaContext): LGRelativeLayout
    }
}