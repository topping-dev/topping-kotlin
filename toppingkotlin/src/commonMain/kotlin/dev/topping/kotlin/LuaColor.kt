package dev.topping.kotlin

expect open class LuaColor {
    companion object {
        val BLACK: Int
        val BLUE: Int
        val CYAN: Int
        val DKGRAY: Int
        val GRAY: Int
        val GREEN: Int
        val LTGRAY: Int
        val MAGENTA: Int
        val RED: Int
        val TRANSPARENT: Int
        val WHITE: Int
        val YELLOW: Int

        /**
         * Returns LuaColor from string value.
         * Example #ffffffff or #ffffff
         * @param colorStr
         * @return LuaColor
         */
        fun fromString(colorStr: String): LuaColor?

        /**
         * Returns LuaColor from argb.
         * @param alpha
         * @param red
         * @param green
         * @param blue
         * @return LuaColor
         */
        fun createFromARGB(alpha: Int, red: Int, green: Int, blue: Int): LuaColor?

        /**
         * Returns LuaColor from rgb.
         * @param red
         * @param green
         * @param blue
         * @return LuaColor
         */
        fun createFromRGB(red: Int, green: Int, blue: Int): LuaColor?
    }

    /**
     * Returns the integer color value
     * @return int
     */
    fun getColorValue(): Int?
}