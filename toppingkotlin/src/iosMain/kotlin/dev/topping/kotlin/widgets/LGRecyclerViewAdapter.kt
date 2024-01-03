package dev.topping.kotlin.widgets

import dev.topping.kotlin.KTInterface
import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi
import platform.darwin.NSObject

actual open class LGRecyclerViewAdapter : KTInterface {
    var lgRecyclerViewAdapter: cocoapods.Topping.LGRecyclerViewAdapter? = null

    actual companion object {
        actual fun create(lc: LuaContext, id: String): LGRecyclerViewAdapter {
            val pobj = dev.topping.kotlin.widgets.LGRecyclerViewAdapter()
            val pres = cocoapods.Topping.LGRecyclerViewAdapter.create(lc.luaContext, id)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun addValue(value: Any) {
        lgRecyclerViewAdapter?.addValue(value as NSObject)
    }

    actual fun removeValue(value: Any) {
        lgRecyclerViewAdapter?.removeValue(value as NSObject)
    }

    actual fun clear() {
        lgRecyclerViewAdapter?.clear()
    }

    actual fun notifyData() {
        lgRecyclerViewAdapter?.notify()
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setOnItemSelected(func: ((LGRecyclerViewAdapter, LGView, LGView, Int, Any) -> Unit)?) {
        lgRecyclerViewAdapter?.setOnItemSelected(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setOnCreateViewHolder(func: ((LGRecyclerViewAdapter, LGView, Int, LuaContext) -> LGView)?) {
        lgRecyclerViewAdapter?.setOnCreateViewHolder(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setOnBindViewHolder(func: ((LGRecyclerViewAdapter, LGView, Int, Any) -> Unit)?) {
        lgRecyclerViewAdapter?.setOnBindViewHolder(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setGetItemViewType(func: ((LGRecyclerViewAdapter, Int) -> Int)?) {
        lgRecyclerViewAdapter?.setGetItemViewType(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any? {
        return lgRecyclerViewAdapter
    }

    open override fun SetNativeObject(par: Any?) {
        lgRecyclerViewAdapter = par as cocoapods.Topping.LGRecyclerViewAdapter?
    }
}