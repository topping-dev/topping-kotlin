package dev.topping.kotlin.widgets

import dev.topping.kotlin.*
import dev.topping.kotlin.lifecycle.LuaLifecycle

/**
 * Fragment state adapter
 */
expect open class LGFragmentStateAdapter : KTInterface {
    companion object {
        /**
         * Creates LGFragmentStateAdapter Object From Lua.
         * @param form
         * @return LGFragmentStateAdapter
         */
        fun createFromForm(form: LuaForm): LGFragmentStateAdapter?

        /**
         * Creates LGFragmentStateAdapter Object From Lua.
         * @param fragment
         * @return LGFragmentStateAdapter
         */
        fun createFromFragment(fragment: LuaFragment): LGFragmentStateAdapter?

        /**
         * Creates LGFragmentStateAdapter Object From Lua.
         * @param lc
         * @param fragmentManager
         * @param lifecycle
         * @return LGFragmentStateAdapter
         */
        fun create(
            lc: LuaContext,
            fragmentManager: LuaFragmentManager,
            lifecycle: LuaLifecycle
        ): LGFragmentStateAdapter?
    }

    /**
     * Set CreateFragment
     * Used to create fragment
     * @param lt +fun(adapter: LGFragmentStateAdapter, position: number):LuaFragment
     */
    fun setCreateFragment(func: (Int) -> LuaFragment)

    /**
     * Set GetItemCount
     * Used to return item count
     * @param lt +fun(adapter: LGFragmentStateAdapter):number
     */
    fun setGetItemCount(func: () -> Int)
}