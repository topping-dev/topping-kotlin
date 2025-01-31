package dev.topping.kotlin

import dev.topping.kotlin.widgets.LGRecyclerViewAdapter
import dev.topping.kotlin.widgets.LGView

actual open class ILGRecyclerViewAdapter actual constructor(adapter: Any) : KTInterface {
    var iLgRecyclerViewAdapter: dev.topping.android.ILGRecyclerViewAdapter? = null
    private var adapter: LGRecyclerViewAdapter

    init {
        this.adapter = KTWrap.Wrap(adapter) as LGRecyclerViewAdapter
        iLgRecyclerViewAdapter = dev.topping.android.ILGRecyclerViewAdapter()
        iLgRecyclerViewAdapter?.ltOnCreateViewHolder = ::onCreateViewHolder.toLuaTranslator(null)
        iLgRecyclerViewAdapter?.ltOnBindViewHolder = ::onBindViewHolder.toLuaTranslator(null)
        iLgRecyclerViewAdapter?.ltGetItemViewType = ::getItemViewType.toLuaTranslator(null)
        iLgRecyclerViewAdapter?.ltGetItemCount = ::getItemCount.toLuaTranslator(null)
    }

    actual open fun onCreateViewHolder(parent: LGView, viewType: Int, context: LuaContext) {}
    actual open fun onBindViewHolder(view: LGView, position: Int) {}
    actual open fun getItemViewType(position: Int): Int {
        return 0
    }

    actual open fun getItemCount(): Int {
        return 0
    }

    actual fun getAdapter(): LGRecyclerViewAdapter {
        return adapter
    }

    open override fun GetNativeObject(): Any? {
        return iLgRecyclerViewAdapter
    }

    open override fun SetNativeObject(par: Any?) {
        iLgRecyclerViewAdapter = par as dev.topping.android.ILGRecyclerViewAdapter?
    }
}