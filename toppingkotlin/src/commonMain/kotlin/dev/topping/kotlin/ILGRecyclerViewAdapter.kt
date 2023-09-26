package dev.topping.kotlin

import dev.topping.kotlin.widgets.LGRecyclerViewAdapter
import dev.topping.kotlin.widgets.LGView

expect open class ILGRecyclerViewAdapter(adapter: Any) {
    open fun onCreateViewHolder(parent: LGView, viewType: Int, context: LuaContext)
    open fun onBindViewHolder(view: LGView, position: Int)
    open fun getItemViewType(position: Int) : Int
    open fun getItemCount() : Int
    fun getAdapter(): LGRecyclerViewAdapter
}