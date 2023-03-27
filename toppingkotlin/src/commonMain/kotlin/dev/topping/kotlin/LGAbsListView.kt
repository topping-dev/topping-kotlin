package dev.topping.kotlin

/**
 * AbsListView
 */
expect open class LGAbsListView : LGViewGroup {
    companion object {
        /**
         * Creates LGAbsListView Object From Lua.
         * Do not use this class directly
         * @param lc
         * @return LGAbsListView
         */
        fun create(lc: LuaContext): LGAbsListView?
    }
}