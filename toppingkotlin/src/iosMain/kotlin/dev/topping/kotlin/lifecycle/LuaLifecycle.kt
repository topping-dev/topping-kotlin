package dev.topping.kotlin.lifecycle

import dev.topping.kotlin.KTInterface
import dev.topping.kotlin.KTWrap
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LuaLifecycle : KTInterface {
    var luaLifecycle: cocoapods.Topping.LuaLifecycle? = null

    actual fun addObserver(luaLifecycleObserver: LuaLifecycleObserver) {
        luaLifecycle?.addObserver(KTWrap.Wrap(luaLifecycleObserver) as cocoapods.Topping.LuaLifecycleObserver)
    }

    actual fun removeObserver(luaLifecycleObserver: LuaLifecycleObserver) {
        luaLifecycle?.removeObserver(KTWrap.Wrap(luaLifecycleObserver) as cocoapods.Topping.LuaLifecycleObserver)
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun launch(func: () -> Unit) {
        luaLifecycle?.launch(func.toLuaTranslator(null))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun launch(dispatcher: Int, func: () -> Unit) {
        luaLifecycle?.launchDispatcher(dispatcher, func.toLuaTranslator(null))
    }

    open override fun GetNativeObject(): Any? {
        return luaLifecycle
    }

    open override fun SetNativeObject(par: Any?) {
        luaLifecycle = par as cocoapods.Topping.LuaLifecycle?
    }


}