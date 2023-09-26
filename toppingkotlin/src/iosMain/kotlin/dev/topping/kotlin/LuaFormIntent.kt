package dev.topping.kotlin

import dev.topping.kotlin.resource.LuaBundle

actual class LuaFormIntent : KTInterface {
    var luaFormIntent: cocoapods.Topping.LuaFormIntent? = null

    actual fun getBundle(): LuaBundle {
        return KTWrap.Wrap(luaFormIntent?.getBundle()) as LuaBundle
    }

    actual fun setFlags(flags: Int) {
        luaFormIntent?.setFlags(flags)
    }

    open override fun GetNativeObject(): Any? {
        return luaFormIntent
    }

    open override fun SetNativeObject(par: Any?) {
        luaFormIntent = par as cocoapods.Topping.LuaFormIntent?
    }
}