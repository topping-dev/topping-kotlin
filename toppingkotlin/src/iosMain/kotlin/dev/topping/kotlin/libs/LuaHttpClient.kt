package dev.topping.kotlin.libs

import dev.topping.kotlin.KTInterface
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi
import platform.darwin.NSObject

actual open class LuaHttpClient : KTInterface {
    var luaHttpClient: cocoapods.Topping.LuaHttpClient? = null

    actual companion object {
        actual fun create(tag: String): LuaHttpClient {
            val pobj = LuaHttpClient()
            val pres = cocoapods.Topping.LuaHttpClient.create(tag)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun setContentType(type: String) {
        luaHttpClient?.setContentType(type)
    }

    actual fun startForm(): LuaObjectStore? {
        val pobj = LuaObjectStore()
        val obj = luaHttpClient?.startForm()
        pobj.SetNativeObject(obj)
        return pobj
    }

    actual fun appendPostData(formData: Any?, name: String?, value: String?) {
        luaHttpClient?.appendPostData(formData as cocoapods.Topping.LuaNativeObject, name, value)
    }

    actual fun appendFileData(formData: Any?, name: String?, file: Any?) {
        luaHttpClient?.appendFileData(formData as cocoapods.Topping.LuaNativeObject, name, file as NSObject)
    }

    actual fun endForm(formData: Any?) {
        luaHttpClient?.endForm(formData as cocoapods.Topping.LuaNativeObject)
    }

    actual fun startAsyncLoadForm(url: String?, formData: Any?, tag: String?) {
        luaHttpClient?.startAsyncLoadForm(url, formData as cocoapods.Topping.LuaNativeObject, tag)
    }

    actual fun startAsyncLoad(url: String?, data: String?, tag: String?) {
        luaHttpClient?.startAsyncLoad(url, data, tag)
    }

    actual fun startAsyncLoadGet(url: String?, tag: String?) {
        luaHttpClient?.startAsyncLoadGet(url, tag)
    }

    actual fun startLoad(url: String?, data: String?): String? {
        return luaHttpClient?.startLoad(url, data)
    }

    actual fun startLoadGet(url: String?): String? {
        return luaHttpClient?.startLoadGet(url)
    }

    actual fun setTimeout(timeout: Int?) {
        luaHttpClient?.setTimeout(timeout!!)
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setOnFinishListener(func: ((LuaHttpClient, String) -> Unit)?) {
        luaHttpClient?.setOnFinishListener(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setOnFailListener(func: ((LuaHttpClient, String) -> Unit)?) {
        luaHttpClient?.setOnFailListener(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any? {
        return luaHttpClient
    }

    open override fun SetNativeObject(par: Any?) {
        luaHttpClient = par as cocoapods.Topping.LuaHttpClient?
    }
}