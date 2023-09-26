package dev.topping.kotlin.navigation

import dev.topping.kotlin.KTWrap
import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaFragment
import dev.topping.kotlin.LuaRef
import dev.topping.kotlin.widgets.LGView

actual open class LuaNavHostFragment : LuaFragment() {
    var luaNavHostFragment: dev.topping.android.LuaNavHostFragment? = null
    actual override fun getContext(): LuaContext {
        val pobj = LuaContext()
        val obj = luaNavHostFragment?.getContext()
        pobj.SetNativeObject(obj)
        return pobj
    }

    actual override fun isInitialized(): Boolean {
        return luaNavHostFragment?.isInitialized()!!
    }

    actual override fun <T> getViewById(lId: LuaRef): T? {
        return KTWrap.Wrap(luaNavHostFragment?.getViewById(lId.luaRef!!)) as T?
    }

    actual override fun getView(): LGView? {
        return KTWrap.Wrap(luaNavHostFragment?.getView()) as LGView?
    }

    actual override fun setView(v: LGView?) {
        luaNavHostFragment?.setLGView(v?.lgView!!)
    }

    actual override fun setViewXML(xml: LuaRef) {
        luaNavHostFragment?.setViewXML(xml.luaRef)
    }

    actual override fun setViewId(luaId: String) {
        luaNavHostFragment?.setViewId(luaId)
    }

    actual override fun setTitle(str: String) {
        luaNavHostFragment?.setTitle(str)
    }

    actual override fun close() {
        luaNavHostFragment?.close()
    }

    actual override fun getNavController(): LuaNavController {
        return KTWrap.Wrap(luaNavHostFragment?.getNavControllerInternal()) as LuaNavController
    }

    open override fun GetNativeObject(): Any? {
        return luaNavHostFragment
    }

    open override fun SetNativeObject(par: Any?) {
        luaNavHostFragment = par as dev.topping.android.LuaNavHostFragment?
    }
}