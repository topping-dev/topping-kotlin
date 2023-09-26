package dev.topping.kotlin.graphics

expect open class LuaRect {
    companion object {
        /**
         * Creates LuaRect
         * @return LuaRect
         */
        fun create(): LuaRect

        /**
         * Create LuaRect with parameters
         * @param left
         * @param top
         * @param right
         * @param bottom
         * @return LuaRect
         */
        fun create(left: Float, top: Float, right: Float, bottom: Float): LuaRect
    }

    /**
     * Sets the parameters of rectangle
     * @param left
     * @param top
     * @param right
     * @param bottom
     */
    fun set(left: Float, top: Float, right: Float, bottom: Float)

    /**
     * Gets Left value
     * @return float
     */
    fun getLeft(): Float

    /**
     * Gets Right value
     * @return float
     */
    fun getRight(): Float

    /**
     * Gets Top value
     * @return float
     */
    fun getTop(): Float

    /**
     * Gets Bottom value
     * @return float
     */
    fun getBottom(): Float
}