package dev.topping.kotlin.lifecycle

import dev.topping.kotlin.KTInterface

actual class LuaJob : KTInterface {
    var luaJob: dev.topping.android.LuaJob? = null

    actual fun cancel() {
        luaJob?.cancel()
    }

    open override fun GetNativeObject(): Any? {
        return luaJob
    }

    open override fun SetNativeObject(par: Any?) {
        luaJob = par as dev.topping.android.LuaJob?
    }
}