package dev.topping.kotlin

/**
 * RadioButton
 */
expect open class LGRadioButton : LGCompoundButton {
    companion object {
        /**
         * Creates LGRadioButton Object From Lua.
         * @param lc
         * @return LGRadioButton
         */
        fun create(lc: LuaContext): LGRadioButton
    }
}