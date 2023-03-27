package dev.topping.kotlin

/**
 * Lua database interface for SQLite operations.
 * This class is used to create database file and manupilate it from lua.
 */
expect open class LuaDatabase {
    companion object {
        /**
         * Creates LuaDatabase Object From Lua.
         * @return LuaDatabase
         */
        fun create(context: LuaContext): LuaDatabase
    }

    /**
     * Checks and Creates Database File on Storage.
     */
    fun checkAndCreateDatabase()

    /**
     * Opens connection to database.
     * @return LuaObjectStore of connection.
     */
    fun open(): LuaObjectStore?

    /**
     * Send sql query to connection.
     * @param conn object store of connection
     * @param str sql statement string
     * @return LuaObjectStore of statement.
     */
    fun query(conn: LuaObjectStore?, str: String): LuaObjectStore?

    /**
     * Send sql query to connection for insert,update operations.
     * @param conn object store of connection
     * @param str sql statement string
     * @return LuaObjectStore of statement.
     */
    fun insert(conn: LuaObjectStore?, str: String): LuaObjectStore?

    /**
     * Finalize statement.
     * @param LuaObjectStore of statement.
     */
    fun finalize(stmt: LuaObjectStore?)

    /**
     * Finalize statement.
     * @param LuaObjectStore of connection.
     */
    fun close(conn: LuaObjectStore?)

    /**
     * Get Integer value at column
     * @param stmt statement object
     * @param column column
     * @return int value
     */
    fun getInt(stmt: LuaObjectStore?, column: Int): Int?

    /**
     * Get Float value at column
     * @param stmt statement object
     * @param column column
     * @return float value
     */
    fun getFloat(stmt: LuaObjectStore?, column: Int): Float?

    /**
     * Get String value at column
     * @param stmt statement object
     * @param column column
     * @return String value
     */
    fun getString(stmt: LuaObjectStore?, column: Int): String?

    /**
     * Get Double value at column
     * @param stmt statement object
     * @param column column
     * @return double value
     */
    fun getDouble(stmt: LuaObjectStore?, column: Int): Double?

    /**
     * Get Long value at column
     * @param stmt statement object
     * @param column column
     * @return long value
     */
    fun getLong(stmt: LuaObjectStore?, column: Int): Long?
}