package dev.topping.kotlin.lifecycle

/**
 * Lua Job
 */
expect class LuaJob {
    /**
     * cancel jobs
     */
    fun cancel()
}