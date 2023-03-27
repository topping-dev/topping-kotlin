package dev.topping.kotlin

/**
 * Compound Button
 */
expect open class LGCompoundButton : LGButton {
    companion object {
        /**
         * Creates LGCompoundButton Object From Lua.
         * @param lc
         * @return LGCompoundButton
         */
        fun create(lc: LuaContext): LGCompoundButton
    }
}