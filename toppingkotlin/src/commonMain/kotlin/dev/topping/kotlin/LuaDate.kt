package dev.topping.kotlin

/**
 * LuaDate class.
 * LuaDate class is used to manipulate date values.
 */
expect open class LuaDate {
    companion object {
        /**
         * Returns the current LuaDate
         * @return LuaDate
         */
        fun now(): LuaDate

        /**
         * Creates LuaDate with given parameters
         * @param day
         * @param month
         * @param year
         * @return LuaDate
         */
        fun createDate(day: Int, month: Int, year: Int): LuaDate

        /**
         * Creates LuaDate with given parameters
         * @param day
         * @param month
         * @param year
         * @param hour
         * @param minute
         * @param second
         * @return LuaDate
         */
        fun createDateWithTime(
            day: Int,
            month: Int,
            year: Int,
            hour: Int,
            minute: Int,
            second: Int
        ): LuaDate
    }

    /**
     * Gets the day of month
     * @return int
     */
    fun getDay(): Int

    /**
     * Sets the day of month
     * @param val
     */
    fun setDay(v: Int)

    /**
     * Gets the month
     * @return int
     */
    fun getMonth(): Int

    /**
     * Sets the month
     * @param val
     */
    fun setMonth(v: Int)

    /**
     * Gets the year
     * @return int
     */
    fun getYear(): Int

    /**
     * Sets the year
     * @param val
     */
    fun setYear(v: Int)

    /**
     * Gets the hour of the day (24)
     * @return int
     */
    fun getHour(): Int

    /**
     * Sets the hour of the day (24)
     * @param val
     */
    fun setHour(v: Int)

    /**
     * Gets the minute
     * @return int
     */
    fun getMinute(): Int

    /**
     * Set the minute
     * @param val
     */
    fun setMinute(v: Int)

    /**
     * Gets the Second
     * @return int
     */
    fun getSecond(): Int

    /**
     * Sets the second
     * @param val
     */
    fun setSecond(v: Int)

    /**
     * Gets the millisecond
     * @return int
     */
    fun getMilliSecond(): Int

    /**
     * Sets the millisecond
     * @param val
     */
    fun setMilliSecond(v: Int)

    /**
     * Gets the string representation of date
     *
     * D 	day in year 	(Number) 	189
     * E 	day of week 	(Text) 	Tuesday
     * F 	day of week in month 	(Number) 	2 (2nd Wed in July)
     * G 	era designator 	(Text) 	AD
     * H 	hour in day (0-23) 	(Number) 	0
     * K 	hour in am/pm (0-11) 	(Number) 	0
     * L 	stand-alone month 	(Text/Number) 	July / 07
     * M 	month in year 	(Text/Number) 	July / 07
     * S 	fractional seconds 	(Number) 	978
     * W 	week in month 	(Number) 	2
     * Z 	time zone (RFC 822) 	(Timezone) 	-0800
     * a 	am/pm marker 	(Text) 	PM
     * c 	stand-alone day of week 	(Text/Number) 	Tuesday / 2
     * d 	day in month 	(Number) 	10
     * h 	hour in am/pm (1-12) 	(Number) 	12
     * k 	hour in day (1-24) 	(Number) 	24
     * m 	minute in hour 	(Number) 	30
     * s 	second in minute 	(Number) 	55
     * w 	week in year 	(Number) 	27
     * y 	year 	(Number) 	2010
     * z 	time zone 	(Timezone) 	Pacific Standard Time
     * ' 	escape for text 	(Delimiter) 	'Date='
     * '' 	single quote 	(Literal) 	'o''clock'
     * @param frmt
     * @return String
     */
    fun toString(frmt: String): String?
}