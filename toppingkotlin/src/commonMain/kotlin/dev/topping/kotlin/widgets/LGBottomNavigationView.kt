package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * Bottom navigation view
 */
expect open class LGBottomNavigationView : LGFrameLayout {
    companion object {
        /**
         * Create bottom navigation view
         * @param context
         * @return LGBottomNavigationView
         */
        fun create(lc: LuaContext): LGBottomNavigationView
    }

    /**
     * Set tab selected listener
     * @param ltTabSelectedListener
     */
    fun setTabSelectedListener(func: ((LGBottomNavigationView, Int) -> Unit)?)

    /**
     * Set can tab select listener
     * @param ltCanSelectTab
     */
    fun setCanSelectTab(func: ((LGBottomNavigationView, Int) -> Boolean)?)
}