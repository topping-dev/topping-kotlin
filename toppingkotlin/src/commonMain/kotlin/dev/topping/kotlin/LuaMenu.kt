package dev.topping.kotlin

expect open class LuaMenu
{
   companion object {
       fun create(lc: LuaContext, id: LuaRef): LuaMenu
   }

    fun getItemId() : LuaRef
    fun setTitle(text: String)
    fun setTitle(text: LuaRef)
    fun setIcon(icon: LuaRef)
}