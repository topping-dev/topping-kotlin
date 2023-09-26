package dev.topping.kotlin.libs

import dev.topping.kotlin.KTInterface
import dev.topping.kotlin.LuaRef
import dev.topping.kotlin.resource.LuaStream
import dev.topping.kotlin.widgets.LGView

actual open class LuaTab : KTInterface {
    var luaTab: cocoapods.Topping.LuaTab? = null

    actual companion object {
        actual fun create(): LuaTab {
            val pobj = LuaTab()
            val pres = cocoapods.Topping.LuaTab.create()
            pobj.SetNativeObject(pres as cocoapods.Topping.LuaTab)
            return pobj
        }
    }

    actual fun setText(text: String) {
        luaTab?.setText(text)
    }

    actual fun setText(text: LuaRef) {
        luaTab?.setTextRef(text.luaRef)
    }

    actual fun setIcon(icon: LuaRef) {
        luaTab?.setIcon(icon.luaRef)
    }

    actual fun setIcon(icon: LuaStream) {
        luaTab?.setIconStream(icon.luaStream)
    }

    actual fun setCustomView(view: LGView) {
        luaTab?.setCustomView(view.lgView)
    }

    open override fun GetNativeObject(): Any? {
        return luaTab
    }

    open override fun SetNativeObject(par: Any?) {
        luaTab = par as cocoapods.Topping.LuaTab?
    }
}