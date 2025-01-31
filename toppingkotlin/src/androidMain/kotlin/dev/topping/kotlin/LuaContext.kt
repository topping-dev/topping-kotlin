package dev.topping.kotlin

import android.content.Context
import dev.topping.kotlin.resource.TResources

actual open class LuaContext : KTInterface {
    var luaContext: dev.topping.android.luagui.LuaContext? = null

    actual companion object {
        actual fun createLuaContext(context: Any): LuaContext {
            val pobj = LuaContext()
            val pres = dev.topping.android.luagui.LuaContext.createLuaContext(context as Context)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun getForm(): LuaForm {
        return KTWrap.Wrap(luaContext?.getForm()) as LuaForm
    }

    actual fun startForm(luaFormIntent: LuaFormIntent) {
        luaContext?.startForm(luaFormIntent?.luaFormIntent)
    }

    actual fun getResources(): TResources {
        return TResources(luaContext?.context!!.resources)
    }

    actual fun getNativeContext(): Any {
        return luaContext?.context!!
    }

    open override fun GetNativeObject(): Any? {
        return luaContext
    }

    open override fun SetNativeObject(par: Any?) {
        luaContext = par as dev.topping.android.luagui.LuaContext?
    }
}