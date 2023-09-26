package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaTranslator

/**
 * RecyclerView
 */
expect open class LGRecyclerView : LGView {
    /**
     * Gets the LGRecyclerViewAdapter of recyclerview
     * @return LGRecyclerViewAdapter
     */
    fun getAdapter(): LGRecyclerViewAdapter?

    /**
     * Sets the LGRecyclerViewAdapter of listview
     * @param adapter
     */
    fun setAdapter(adapter: LGRecyclerViewAdapter?)

    /**
     * Sets the LGRecyclerViewAdapter of listview
     * @param ltInit
     */
    fun setAdapter(ltInit: LuaTranslator)
}