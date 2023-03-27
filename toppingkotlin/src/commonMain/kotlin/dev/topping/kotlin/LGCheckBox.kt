package dev.topping.kotlin

/**
 * Checkbox
 */
expect open class LGCheckBox : LGCompoundButton {
    companion object {
        /**
         * Creates LGCheckbox Object From Lua.
         * @param lc
         * @return LGCheckBox
         */
        fun create(lc: LuaContext): LGCheckBox
    }

    /**
     * Sets on checked changed listener
     * @param lt +fun(checkbox: LGCheckBox, context: LuaContext, isChecked: bool):void
     */
    fun setOnCheckedChangedListener(func: ((LGCheckBox, LuaContext, Boolean) -> Unit)?)
}