package dev.topping.kotlin

expect open class LuaRef
{
    val compose: Any
   companion object {
        fun withValue(key: String, obj: Any): LuaRef
        fun WithValue(key: String, obj: Any): LuaRef
        fun getRef(ctx: LuaContext?, id: String?): LuaRef?
   }
}