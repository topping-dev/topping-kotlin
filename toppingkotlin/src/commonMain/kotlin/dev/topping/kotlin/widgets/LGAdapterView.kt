package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

/**
 * AdapterView
 */
expect open class LGAdapterView {
    companion object {
        /**
         * Creates LGAdapterView Object From Lua.
         * @param lc
         * @param id
         * @return LGAdapterView
         */
        fun create(lc: LuaContext, id: String): LGAdapterView
    }

    /**
     * Add section
     * @param header of section
     * @param id of LGAdapterView
     */
    fun addSection(header: String, id: String): LGAdapterView

    /**
     * Remove section
     * @param header value
     */
    fun removeSection(header: String)

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
     * Used to set adapterview function
     * @param lt +fun(adapter: LGAdapterView, parent: LGView, position: number, object: userdata):void
     */
    fun setOnAdapterView(func: (LGAdapterView, LGView, Int, Any, LGView, LuaContext) -> LGView)
}