package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.libs.LuaMenu

/**
 * Navigation View
 */
expect open class LGNavigationView : LGLinearLayout {
    companion object {
        /**
         * Creates LGNavigationView Object From Lua.
         * @param lc
         * @return LGNavigationView
         */
        fun create(lc: LuaContext): LGNavigationView
    }

    /**
     * Set navigation item select listener
     * @param lt +fun(navigationView: LGNavigationView, item: LuaMenu):bool
     */
    fun setNavigationItemSelectListener(func: ((LGNavigationView, LuaMenu) -> Unit)?)
}