package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * RadioGroup
 */
expect open class LGRadioGroup : LGLinearLayout {
    companion object {
        /**
         * Creates LGRadioGroup Object From Lua.
         * @param lc
         * @return LGRadioGroup
         */
        fun create(lc: LuaContext): LGRadioGroup
    }

    /**
     * Sets group checked changed listener
     * @param lt +fun(radioGroup: LGRadioGroup, context: LuaContext, isChecked: bool):void
     */
    fun setOnCheckedChangedListener(func: ((Int, Boolean) -> Unit)?)
}