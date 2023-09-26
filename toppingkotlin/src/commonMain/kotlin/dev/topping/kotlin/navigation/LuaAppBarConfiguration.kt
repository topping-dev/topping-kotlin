package dev.topping.kotlin.navigation

import dev.topping.kotlin.LuaRef

/**
 * App Bar Configuration
 */
expect open class LuaAppBarConfiguration {
    companion object {
        /**
         * Create app bar configuration
         * @param singleTop boolean
         * @param popUpTo LuaRef
         * @param popUpToInclusive LuaRef
         * @param enterAnim LuaRef
         * @param exitAnim LuaRef
         * @param popEnterAnim LuaRef
         * @param popExitAnim LuaRef
         * @return LuaAppBarConfiguration
         */
        fun create(
            singleTop: Boolean, popUpTo: LuaRef, popUpToInclusive: Boolean,
            enterAnim: LuaRef, exitAnim: LuaRef,
            popEnterAnim: LuaRef, popExitAnim: LuaRef
        ): LuaAppBarConfiguration
    }

    /**
     * Set top level destinations
     * @param ids array
     */
    fun setTopLevelDestinations(ids: Array<LuaRef>)
}