package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * ListView
 */
expect open class LGListView : LGAbsListView {
    companion object {
        /**
         * Create list view
         * @param lc
         * @return LGListView
         */
        fun create(lc: LuaContext): LGAbsListView
    }

    /**
     * Gets the LGAdapterView of listview
     * @return LGAdapterView
     */
    fun getAdapter(): LGAdapterView?

    /**
     * Sets the LGAdapterView of listview
     * @param adapter
     */
    fun setAdapter(adapter: LGAdapterView?)
}