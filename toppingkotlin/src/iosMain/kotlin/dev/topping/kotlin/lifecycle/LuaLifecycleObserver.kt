package dev.topping.kotlin.lifecycle

import dev.topping.kotlin.KTInterface
import dev.topping.kotlin.libs.LuaNativeObject
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LuaLifecycleObserver : KTInterface {
    var luaLifecycleObserver: cocoapods.Topping.LuaLifecycleObserver? = null

    actual companion object {
        actual val ON_CREATE: Int = 0
        actual val ON_DESTROY: Int = 1
        actual val ON_RESUME: Int = 2
        actual val ON_PAUSE: Int = 3
        actual val ON_START: Int = 4
        actual val ON_STOP: Int = 5

        @OptIn(ExperimentalForeignApi::class)
        actual fun create(func: (LuaNativeObject, Int) -> Unit): LuaLifecycleObserver {
            val pobj = LuaLifecycleObserver()
            val pres = cocoapods.Topping.LuaLifecycleObserver.create(func.toLuaTranslator(null))
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return luaLifecycleObserver
    }

    open override fun SetNativeObject(par: Any?) {
        luaLifecycleObserver = par as cocoapods.Topping.LuaLifecycleObserver?
    }


}