package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.libs.LuaTab

/**
 * ViewPager
 */
expect open class LGViewPager : LGViewGroup {
    companion object {
        fun create(lc: LuaContext): LGViewPager
    }

    /**
     * Set pager adapter
     * @param adapter
     */
    fun setAdapter(lgFragmentStateAdapter: LGFragmentStateAdapter)

    /**
     * Set tab layout
     * @param tabLayout
     * @param ltTab +fun(viewPager: LGViewPager, position: number):LuaTab
     */
    fun setTabLayout(lgTabLayout: LGTabLayout, func: (Int) -> LuaTab)
}