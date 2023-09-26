package dev.topping.kotlin.navigation

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaRef
import dev.topping.kotlin.widgets.LGView

/**
 * User interface fragment
 */
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