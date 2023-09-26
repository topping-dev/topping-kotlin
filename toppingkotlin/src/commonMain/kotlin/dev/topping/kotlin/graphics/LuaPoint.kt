package dev.topping.kotlin.graphics

/**
 * Class used to store point
 */
expect open class LuaPoint {
    companion object {
        /**
         * Creates LuaPoint
         * @return LuaPoint
         */
        fun create(): LuaPoint

        /**
         * Creates LuaPoint with parameters
         * @param x
         * @param y
         * @return LuaPoint
         */
        fun create(x: Float, y: Float): LuaPoint
    }

    /**
     * Sets the parameters of point
     * @param x
     * @param y
     */
    fun set(x: Float, y: Float)

    /**
     * Gets the x value
     * @return float
     */
    fun getX(): Float

    /**
     * Gets the y value
     * @return float
     */
    fun getY(): Float
}