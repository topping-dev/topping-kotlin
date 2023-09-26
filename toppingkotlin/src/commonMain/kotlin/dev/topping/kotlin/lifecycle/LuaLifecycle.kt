package dev.topping.kotlin.lifecycle

/**
 * Lifecycle class
 */
expect open class LuaLifecycle {
    /**
     * add lifecycle observer
     * @param luaLifecycleObserver
     */
    fun addObserver(luaLifecycleObserver: LuaLifecycleObserver)

    /**
     * remove lifecycle observer
     * @param luaLifecycleObserver
     */
    fun removeObserver(luaLifecycleObserver: LuaLifecycleObserver)

    /**
     * Launch coroutine
     * @param lt +fun():void
     */
    fun launch(func: () -> Unit)

    /**
     * Launch coroutine
     * @param event +"LuaDispatchers.DEFAULT" | "LuaDispatchers.UNCONFINED" | "LuaDispatchers.MAIN" | "LuaDispatchers.IO"
     * @param lt +fun():void
     */
    fun launch(dispatcher: Int, func: () -> Unit)
}