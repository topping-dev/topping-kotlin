package dev.topping.kotlin

actual open class LuaMenu : KTInterface
{
   var luaMenu: cocoapods.Topping.LuaMenu? = null

    actual companion object {
        actual fun create(lc: LuaContext, id: LuaRef): LuaMenu {
            val pobj = LuaMenu()
            val pres = cocoapods.Topping.LuaMenu.create(lc.luaContext, id.luaRef)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun getItemId(): LuaRef {
        return KTWrap.Wrap(luaMenu?.getItemId()) as LuaRef
    }

    actual fun setTitle(text: String) {
        luaMenu?.setTitle(text)
    }

    actual fun setTitle(text: LuaRef)
    {
        luaMenu?.setTitleRef(text.luaRef)
    }

    actual fun setIcon(icon: LuaRef) {
        luaMenu?.setIcon(icon.luaRef)
    }

    open override fun GetNativeObject(): Any?
    {
        return luaMenu
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaMenu = par as cocoapods.Topping.LuaMenu?
    }
}