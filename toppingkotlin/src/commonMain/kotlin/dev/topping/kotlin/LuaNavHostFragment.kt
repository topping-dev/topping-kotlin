package dev.topping.kotlin

expect open class LuaNavHostFragment
{
   fun getContext(): LuaContext
   fun isInitialized(): Boolean
   fun <T> getViewById(lId: LuaRef): T?
   fun getView(): LGView?
   fun setView(v: LGView?)
   fun setViewXML(xml: LuaRef)
   fun setViewId(luaId: String)
   fun setTitle(str: String)
   fun close()
   fun getNavController(): LuaNavController
}