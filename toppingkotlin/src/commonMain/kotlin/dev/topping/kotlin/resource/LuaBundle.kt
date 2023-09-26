package dev.topping.kotlin.resource

/**
 * Lua Bundle
 */
expect class LuaBundle {
    /**
     * Get String
     * @param key
     * @return
     */
    fun getString(key: String): String?

    /**
     * Get String
     * @param key
     * @param def
     * @return
     */
    fun getString(key: String, def: String): String?

    /**
     * Put String
     * @param key
     * @param value
     */
    fun putString(key: String, value: String)

    /**
     * Get byte
     * @param key
     * @return
     */
    fun getByte(key: String): Byte

    /**
     * Get byte
     * @param key
     * @param def
     * @return
     */
    fun getByte(key: String, def: Byte): Byte

    /**
     * Put byte
     * @param key
     * @param value
     */
    fun putByte(key: String, value: Byte)

    /**
     * Get char
     * @param key
     * @return
     */
    fun getChar(key: String): Byte

    /**
     * Get char
     * @param key
     * @param def
     * @return
     */
    fun getChar(key: String, def: Byte): Byte

    /**
     * Put char
     * @param key
     * @param value
     */
    fun putChar(key: String, value: Byte)

    /**
     * Get short
     * @param key
     * @return
     */
    fun getShort(key: String): Short

    /**
     * Get short
     * @param key
     * @param def
     * @return
     */
    fun getShort(key: String, def: Short): Short

    /**
     * Put short
     * @param key
     * @param value
     */
    fun putShort(key: String, value: Short)

    /**
     * Get int
     * @param key
     * @return
     */
    fun getInt(key: String): Int

    /**
     * Get int
     * @param key
     * @param def
     * @return
     */
    fun getInt(key: String, def: Int): Int

    /**
     * Put int
     * @param key
     * @param value
     */
    fun putInt(key: String, value: Int)

    /**
     * Get long
     * @param key
     * @return
     */
    fun getLong(key: String): Long

    /**
     * Get long
     * @param key
     * @param def
     * @return
     */
    fun getLong(key: String, def: Long): Long

    /**
     * Put long
     * @param key
     * @param value
     */
    fun putLong(key: String, value: Long)

    /**
     * Get float
     * @param key
     * @return
     */
    fun getFloat(key: String): Float

    /**
     * Get float
     * @param key
     * @param def
     * @return
     */
    fun getFloat(key: String, def: Float): Float

    /**
     * Put float
     * @param key
     * @param value
     */
    fun putFloat(key: String, value: Float)

    /**
     * Get double
     * @param key
     * @return
     */
    fun getDouble(key: String): Double

    /**
     * Get double
     * @param key
     * @param def
     * @return
     */
    fun getDouble(key: String, def: Double): Double

    /**
     * Put double
     * @param key
     * @param value
     */
    fun putDouble(key: String, value: Double)
}