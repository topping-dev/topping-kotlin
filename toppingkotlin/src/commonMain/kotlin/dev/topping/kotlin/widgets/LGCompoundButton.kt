package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

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