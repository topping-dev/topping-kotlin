package dev.topping.kotlin

/**
 * Drawer Layout
 */
expect open class LGDrawerLayout : LGViewGroup {
    companion object {
        /**
         * Creates LGDrawerLayout Object From Lua.
         * @param lc
         * @return LGDrawerLayout
         */
        fun create(lc: LuaContext): LGDrawerLayout
    }

    /**
     * Add drawer slide changed listener
     * @param lt
     */
    fun addOnDrawerSlide(func: ((LGDrawerLayout, Int) -> Unit)?)

    /**
     * Add drawer opened listener
     * @param lt
     */
    fun addOnDrawerOpened(func: ((LGDrawerLayout) -> Unit)?)

    /**
     * Add drawer closed listener
     * @param lt
     */
    fun addOnDrawerClosed(func: ((LGDrawerLayout) -> Unit)?)

    /**
     * Add drawer state changed listener
     * @param lt
     */
    fun addOnDrawerStateChanged(func: ((LGDrawerLayout, Int) -> Unit)?)

    /**
     * Remove drawer slide changed listener
     * @param lt
     */
    fun removeOnDrawerSlide(func: ((LGDrawerLayout, Int) -> Unit)?)

    /**
     * Remove drawer opened listener
     * @param lt
     */
    fun removeOnDrawerOpened(func: ((LGDrawerLayout) -> Unit)?)

    /**
     * Remove drawer closed listener
     * @param lt
     */
    fun removeOnDrawerClosed(func: ((LGDrawerLayout) -> Unit)?)

    /**
     * Remove drawer state changed listener
     * @param lt
     */
    fun removeOnDrawerStateChanged(func: ((LGDrawerLayout, Int) -> Unit)?)
}