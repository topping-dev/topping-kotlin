package dev.topping.kotlin

expect open class LGViewGroup : LGView {
    companion object {
        /**
         * Creates LGViewGroup Object From Lua.
         * Do not create this class directly.
         * @param lc
         * @return LGViewGroup
         */
        fun create(lc: LuaContext): LGViewGroup
    }
}