package dev.topping.kotlin.widgets

import dev.topping.kotlin.libs.LuaTab

/**
 * Tab layout
 */
expect open class LGTabLayout : LGFrameLayout {
    companion object {
    }

    /**
     * Set tab selected listener
     * @param ltTabSelectedListener
     */
    fun setTabSelectedListener(func: ((LGTabLayout, LuaTab) -> Unit)?)
}