package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * RecyclerView adapter
 */
expect open class LGRecyclerViewAdapter {
    companion object {
        /**
         * Creates LGRecyclerViewAdapter Object From Lua.
         * @return LGRecyclerViewAdapter
         */
        fun create(lc: LuaContext, id: String): LGRecyclerViewAdapter
    }

    /**
     * Add Value to adapter
     * @param value
     */
    fun addValue(value: Any)

    /**
     * Remove Value from adapter
     * @param value
     */
    fun removeValue(value: Any)

    /**
     * Remove all values from adapter
     */
    fun clear()

    /**
     * Notify data change
     */
    fun notifyData()

    /**
     * Set OnItemSelected
     * Used to set item selected
     * @param lt +fun(adapter: LGRecyclerViewAdapter, parent: LGView, view: LGView, position: number, object: userdata):void
     */
    fun setOnItemSelected(func: ((LGRecyclerViewAdapter, LGView, LGView, Int, Any) -> Unit)?)

    /**
     * Set OnCreateViewHolder
     * Used to create view holder
     * @param lt +fun(adapter: LGRecyclerViewAdapter, parent: LGView, viewType: number, context: LuaContext):LGView
     */
    fun setOnCreateViewHolder(func: ((LGRecyclerViewAdapter, LGView, Int, LuaContext) -> LGView)?)

    /**
     * Set OnBindViewHolder
     * Used to bind view holder
     * @param lt +fun(adapter: LGRecyclerViewAdapter, view: LGView, position: number, object: userdata):void
     */
    fun setOnBindViewHolder(func: ((LGRecyclerViewAdapter, LGView, Int, Any) -> Unit)?)

    /**
     * Set GetItemViewType
     * Used to get type of view holder
     * @param lt +fun(adapter: LGRecyclerViewAdapter, position: number):number
     */
    fun setGetItemViewType(func: ((LGRecyclerViewAdapter, Int) -> Int)?)
}