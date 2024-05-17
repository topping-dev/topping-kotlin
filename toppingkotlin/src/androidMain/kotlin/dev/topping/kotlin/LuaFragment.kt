package dev.topping.kotlin

import dev.topping.kotlin.lifecycle.LuaLifecycleOwner
import dev.topping.kotlin.navigation.LuaNavController
import dev.topping.kotlin.resource.LuaBundle
import dev.topping.kotlin.widgets.LGView

actual open class LuaFragment : KTInterface {
    var luaFragment: dev.topping.android.LuaFragment? = null

    actual companion object {
        actual fun create(lc: LuaContext, luaId: LuaRef): LuaFragment {
            val pobj = LuaFragment()
            val pres = dev.topping.android.LuaFragment.create(lc.luaContext!!, luaId.luaRef)
            pobj.SetNativeObject(pres)
            return pobj
        }

        actual fun create(
            lc: LuaContext,
            luaId: LuaRef,
            args: LuaBundle
        ): LuaFragment {
            val pobj = LuaFragment()
            val pres = dev.topping.android.LuaFragment.create(lc.luaContext!!, luaId.luaRef, null)
            pobj.SetNativeObject(pres)
            return pobj
        }

        actual fun createWithUI(
            lc: LuaContext,
            luaId: LuaRef,
            ui: LuaRef,
            args: LuaBundle
        ): LuaFragment {
            val pobj = LuaFragment()
            val pres = dev.topping.android.LuaFragment.createWithUI(
                lc.luaContext!!,
                luaId.luaRef,
                ui.luaRef,
                null //TODO
            )
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual open fun getContext(): LuaContext {
        val pobj = LuaContext()
        val obj = luaFragment?.getContext()
        pobj.SetNativeObject(obj)
        return pobj
    }

    actual open fun isInitialized(): Boolean {
        return luaFragment?.isInitialized()!!
    }

    actual open fun <T> getViewById(lId: LuaRef): T? {
        return KTWrap.Wrap(luaFragment?.getViewById(lId.luaRef!!)) as T?
    }

    actual open fun getView(): LGView? {
        return KTWrap.Wrap(luaFragment?.getView()) as LGView?
    }

    actual open fun setView(v: LGView?) {
        luaFragment?.setLGView(v?.lgView!!)
    }

    actual open fun setViewXML(xml: LuaRef) {
        luaFragment?.setViewXML(xml.luaRef)
    }

    actual open fun setViewId(luaId: String) {
        luaFragment?.setViewId(luaId)
    }

    actual open fun setTitle(str: String) {
        luaFragment?.setTitle(str)
    }

    actual open fun close() {
        luaFragment?.close()
    }

    actual open fun getArguments(): LuaBundle {
        return KTWrap.Wrap(luaFragment?.getArgumentsBundle()) as LuaBundle
    }

    actual open fun getNavController(): LuaNavController {
        return KTWrap.Wrap(luaFragment?.getNavController()) as LuaNavController
    }

    actual open fun getViewLifecycleOwner(): LuaLifecycleOwner {
        return KTWrap.Wrap(luaFragment?.getLifecycleOwner()) as LuaLifecycleOwner
    }

    open override fun GetNativeObject(): Any? {
        return luaFragment
    }

    open override fun SetNativeObject(par: Any?) {
        luaFragment = par as dev.topping.android.LuaFragment?
    }
}