package dev.topping.kotlin

/**
 * Nav Controller
 */
expect open class LuaNavController {
    /**
     * Navigate to target
     * @param target
     */
    fun navigate(target: LuaRef)

    /**
     * Navigate to target with arguments
     * @param target
     * @param arguments
     */
    fun navigate(target: LuaRef, args: Map<String, Any>)

    /**
     * Navigate to target with arguments and nav options
     * @param target
     * @param arguments
     * @param navOptions
     */
    fun navigate(target: LuaRef, args: Map<String, Any>, navOptions: LuaNavOptions)

    /**
     * Navigate to previous
     */
    fun navigateUp()
}