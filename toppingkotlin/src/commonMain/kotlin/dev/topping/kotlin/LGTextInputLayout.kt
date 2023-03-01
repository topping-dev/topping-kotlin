package dev.topping.kotlin

expect open class LGTextInputLayout : LGViewGroup
{
   companion object {
       fun create(lc: LuaContext): LGTextInputLayout
   }
}