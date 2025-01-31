package dev.topping.kotlin.lifecycle

import dev.topping.kotlin.KTInterface

actual open class LuaLifecycleOwner : KTInterface {
    var luaLifecycleOwner: cocoapods.Topping.LuaLifecycleOwner? = null

    open override fun GetNativeObject(): Any? {
        return luaLifecycleOwner
    }

    open override fun SetNativeObject(par: Any?) {
        luaLifecycleOwner = par as cocoapods.Topping.LuaLifecycleOwner?
    }


}