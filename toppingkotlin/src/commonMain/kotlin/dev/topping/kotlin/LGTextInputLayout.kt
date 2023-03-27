package dev.topping.kotlin

/**
 * Material Text Input Layout
 */
expect open class LGTextInputLayout : LGViewGroup
{
   companion object {
       fun create(lc: LuaContext): LGTextInputLayout
   }
}