package dev.topping.kotlin

/**
 * Class that is used in buffer operations
 */
expect open class LuaBuffer {
    companion object {
        /**
         * Creates a buffer
         * @param capacity
         * @return LuaBuffer
         */
        fun create(capacity: Int): LuaBuffer
    }

    /**
     * Gets byte from index
     * @param index
     * @return int
     */
    fun getByte(index: Int): Int?

    /**
     * Set Byte at index
     * @param index
     * @param value
     */
    fun setByte(index: Int, value: Int)
}