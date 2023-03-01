package dev.topping.kotlin

expect open class LGNavigationView : LGLinearLayout
{
   companion object {
       fun create(lc: LuaContext): LGNavigationView
   }

    fun setNavigationItemSelectListener(func: ((LGNavigationView, LuaMenu) -> Unit)?)
}