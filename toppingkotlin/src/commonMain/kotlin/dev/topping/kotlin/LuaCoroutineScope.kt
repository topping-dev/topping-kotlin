package dev.topping.kotlin

/**
 * Coroutine scope
 */
expect open class LuaCoroutineScope {
    /**
     * Launch coroutine
     * @param lt +fun():void
     */
    fun launch(func: () -> Unit): LuaJob

    /**
     * Launch coroutine
     * @param event +"LuaDispatchers.DEFAULT" | "LuaDispatchers.UNCONFINED" | "LuaDispatchers.MAIN" | "LuaDispatchers.IO"
     * @param lt +fun():void
     */
    fun launch(dispatcher: Int, func: () -> Unit): LuaJob
}