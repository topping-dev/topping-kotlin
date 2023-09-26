package dev.topping.kotlin.lifecycle

import dev.topping.kotlin.libs.LuaNativeObject

/**
 * Lifecycle observer
 */
expect open class LuaLifecycleObserver {
    companion object {
        val ON_CREATE: Int
        val ON_DESTROY: Int
        val ON_RESUME: Int
        val ON_PAUSE: Int
        val ON_START: Int
        val ON_STOP: Int

        /**
         * Create observer
         * lt +fun(obj: LuaNativeObject, event: number):void
         */
        fun create(func: (LuaNativeObject, Int) -> Unit): LuaLifecycleObserver
    }
}