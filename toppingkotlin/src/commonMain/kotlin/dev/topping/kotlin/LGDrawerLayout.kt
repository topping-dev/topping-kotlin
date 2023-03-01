package dev.topping.kotlin

expect open class LGDrawerLayout : LGViewGroup
{
    companion object {
       fun create(lc: LuaContext): LGDrawerLayout
    }

    fun addOnDrawerSlide(func: ((LGDrawerLayout, Int) -> Unit)?)
    fun addOnDrawerOpened(func: ((LGDrawerLayout) -> Unit)?)
    fun addOnDrawerClosed(func: ((LGDrawerLayout) -> Unit)?)
    fun addOnDrawerStateChanged(func: ((LGDrawerLayout, Int) -> Unit)?)
    fun removeOnDrawerSlide(func: ((LGDrawerLayout, Int) -> Unit)?)
    fun removeOnDrawerOpened(func: ((LGDrawerLayout) -> Unit)?)
    fun removeOnDrawerClosed(func: ((LGDrawerLayout) -> Unit)?)
    fun removeOnDrawerStateChanged(func: ((LGDrawerLayout, Int) -> Unit)?)
}