package dev.topping.kotlin

/**
 * Navigation options
 */
expect open class LuaNavOptions {
    companion object {
        /**
         * Create Nav Options
         * @param singleTop
         * @param popUpTo
         * @param popUpToInclusive
         * @param enterAnim
         * @param exitAnim
         * @param popEnterAnim
         * @param popExitAnim
         * @return LuaNavOptions
         */
        fun create(
            singleTop: Boolean, popUpTo: LuaRef, popUpToInclusive: Boolean,
            enterAnim: LuaRef, exitAnim: LuaRef,
            popEnterAnim: LuaRef, popExitAnim: LuaRef
        ): LuaNavOptions
    }
}