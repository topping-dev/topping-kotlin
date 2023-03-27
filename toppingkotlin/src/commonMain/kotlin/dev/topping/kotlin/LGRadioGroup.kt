package dev.topping.kotlin

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