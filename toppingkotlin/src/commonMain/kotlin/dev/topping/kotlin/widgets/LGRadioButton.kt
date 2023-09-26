package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

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