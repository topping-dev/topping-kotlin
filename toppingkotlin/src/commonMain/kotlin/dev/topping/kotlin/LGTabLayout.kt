package dev.topping.kotlin

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