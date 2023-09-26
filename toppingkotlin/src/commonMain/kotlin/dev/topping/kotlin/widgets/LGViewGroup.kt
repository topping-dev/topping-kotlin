package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaRef

expect open class LGViewGroup : LGView {
    companion object {
        /**
         * Creates LGViewGroup Object From Lua.
         * Do not create this class directly.
         * @param lc
         * @return LGViewGroup
         */
        fun create(lc: LuaContext): LGViewGroup
    }

    /**
     * Get view by id
     * @param lId
     * @return LGView
     */
    fun getViewById(lId: LuaRef): LGView?

    /**
     * Add view to group
     * @param view
     */
    fun addView(view: LGView)

    /**
     * Remove view from group
     * @param view
     */
    fun removeView(view: LGView)
}