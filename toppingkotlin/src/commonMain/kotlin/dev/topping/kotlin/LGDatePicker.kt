package dev.topping.kotlin

/**
 * DatePicker
 */
expect open class LGDatePicker : LGFrameLayout {
    companion object {
        /**
         * Creates LGDatePicker Object From Lua.
         * @param lc
         * @return LGDatePicker
         */
        fun create(lc: LuaContext): LGDatePicker
    }

    /**
     * Gets the day value
     * @return int day
     */
    fun getDay(): Int

    /**
     * Gets the month value
     * @return int month
     */
    fun getMonth(): Int

    /**
     * Gets the year value
     * @return int year
     */
    fun getYear(): Int

    /**
     * Update the date value of picker
     * @param day
     * @param month
     * @param year
     */
    fun updateDate(day: Int, month: Int, year: Int)

    /**
     * Sets on date changed listener
     * @param lt +fun(datePicker: LGDatePicker, day: number, month: number, year: number):void
     */
    fun setOnDateChangedListener(func: ((LGDatePicker, Int, Int, Int) -> Unit)?)
}