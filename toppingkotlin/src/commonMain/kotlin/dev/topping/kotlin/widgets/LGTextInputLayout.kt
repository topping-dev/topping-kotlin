package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * Material Text Input Layout
 */
expect open class LGTextInputLayout : LGViewGroup
{
   companion object {
       fun create(lc: LuaContext): LGTextInputLayout
   }
}