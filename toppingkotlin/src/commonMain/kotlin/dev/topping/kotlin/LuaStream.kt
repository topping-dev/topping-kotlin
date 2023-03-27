package dev.topping.kotlin

/**
 * Lua stream interface.
 * This class is used to manupulate streams.
 */
expect open class LuaStream {
    /**
     * Get stream.
     * @return LuaObjectStore InputStream or OutputStream value.
     */
    fun getStream(): LuaObjectStore?

    /**
     * Set stream.
     * @param stream LuaObjectStore InputStream or OutputStream value.
     */
    fun setStream(stream: LuaObjectStore?)

    /**
     * Reads a single byte from this stream and returns it as an integer in the range from 0 to 255. Returns -1 if the end of the stream has been reached. Blocks until one byte has been read, the end of the source stream is detected or an exception is thrown.
     * @return int value of byte.
     */
    fun readOne(): Int?

    /**
     * Reads at most length bytes from this stream and stores them in the byte array b starting at offset.
     * @param bufferO buffer object.
     * @param offset offset to start.
     * @param length length to read.
     */
    fun read(bufferO: LuaBuffer, offset: Int, length: Int)

    /**
     * Writes a single byte to this stream. Only the least significant byte of the integer oneByte is written to the stream.
     * @param oneByte byte value.
     */
    fun writeOne(oneByte: Int)

    /**
     * Writes count bytes from the byte array buffer starting at position offset to this stream.
     * @param bufferO buffer object.
     * @param offset offset to start.
     * @param length length to write.
     */
    fun write(bufferO: LuaBuffer, offset: Int, length: Int)
}