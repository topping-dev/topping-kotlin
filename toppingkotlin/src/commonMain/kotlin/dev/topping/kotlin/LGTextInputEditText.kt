package dev.topping.kotlin

expect open class LGTextInputEditText : LGEditText
{
   companion object {
       fun create(lc: LuaContext): LGTextInputEditText
   }
}