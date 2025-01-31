package dev.topping.kotlin.lifecycle

import dev.topping.kotlin.KTInterface
import dev.topping.kotlin.KTWrap
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LuaLiveData : KTInterface {
    var luaLiveData: cocoapods.Topping.LuaLiveData? = null
    var functionMap = mutableMapOf<(LuaLiveData, Any) -> Unit, cocoapods.Topping.LuaTranslator>()

    actual companion object {
        actual fun create(): LuaLiveData {
            val pobj = LuaLiveData()
            val pres = cocoapods.Topping.LuaLiveData.create()
            pobj.SetNativeObject(pres)
            return pobj
        }

    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun observe(owner: LuaLifecycleOwner, func: (LuaLiveData, Any) -> Unit) {
        val lt = func.toLuaTranslator(this)
        luaLiveData?.observeLua(owner.GetNativeObject() as cocoapods.Topping.LuaLifecycleOwner, lt)
        functionMap[func] = lt
    }

    actual fun removeObserver(func: (LuaLiveData, Any) -> Unit) {
        luaLiveData?.removeObserverLua(functionMap[func]!!)
    }

    actual fun getValue(): Any? {
        return KTWrap.Wrap(luaLiveData?.getValue())
    }

    open override fun GetNativeObject(): Any? {
        return LuaLiveData
    }

    open override fun SetNativeObject(par: Any?) {
        luaLiveData = par as cocoapods.Topping.LuaLiveData?
    }


}