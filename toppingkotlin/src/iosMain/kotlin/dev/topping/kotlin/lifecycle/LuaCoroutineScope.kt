package dev.topping.kotlin.lifecycle

import dev.topping.kotlin.KTInterface
import dev.topping.kotlin.KTWrap
import dev.topping.kotlin.lifecycle.LuaJob
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LuaCoroutineScope : KTInterface {
    var luaCoroutineScope: cocoapods.Topping.LuaCoroutineScope? = null

    @OptIn(ExperimentalForeignApi::class)
    actual fun launch(func: () -> Unit): LuaJob {
        return KTWrap.Wrap(luaCoroutineScope?.launch(func.toLuaTranslator(null))) as LuaJob
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun launch(dispatcher: Int, func: () -> Unit): LuaJob {
        return KTWrap.Wrap(
            luaCoroutineScope?.launchDispatcher(
                dispatcher,
                func.toLuaTranslator(null)
            )
        ) as LuaJob
    }

    open override fun GetNativeObject(): Any? {
        return luaCoroutineScope
    }

    open override fun SetNativeObject(par: Any?) {
        luaCoroutineScope = par as cocoapods.Topping.LuaCoroutineScope?
    }
}