package dev.topping.kotlin.libs

import dev.topping.kotlin.KTInterface

actual open class LuaObjectStore : KTInterface {
    var luaObjectStore: dev.topping.android.LuaObjectStore? = null
    open override fun GetNativeObject(): Any? {
        return luaObjectStore
    }

    open override fun SetNativeObject(par: Any?) {
        luaObjectStore = par as dev.topping.android.LuaObjectStore?
    }
}