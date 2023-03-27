package dev.topping.kotlin

/**
 * ComboBox
 */
expect open class LGComboBox : LGEditText {
    companion object {
        /**
         * Creates LGComboBox Object From Lua.
         * @param lc
         * @return LGComboBox
         */
        fun create(lc: LuaContext): LGComboBox
    }

    /**
     * Add combo item to combobox
     * @param id of combobox
     * @param tag
     */
    fun addItem(id: String, tag: Any)

    /**
     * Set items
     * @param values
     */
    fun setItems(map: Map<String, Any>)

    /**
     * Sets the selected value
     * @param index
     */
    fun setSelectedIndex(index: Int)

    /**
     * Gets the selected name
     */
    fun getSelectedName(): String?

    /**
     * Gets the selected tag
     * @return tag value
     */
    fun getSelectedTag(): Any?

    /**
     * Sets combo changed listener
     * @param lt +fun(comboBox: LGComboBox, context: LuaContext, name: string, tag: userdata):void
     */
    fun setOnComboChangedListener(func: ((LGComboBox, LuaContext, String, Any) -> Unit)?)
}