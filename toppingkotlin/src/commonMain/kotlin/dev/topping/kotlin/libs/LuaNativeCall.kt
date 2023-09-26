package dev.topping.kotlin.libs

/**
 * Call native functions from lua
 */
expect open class LuaNativeCall {
    companion object {
        /**
         * Call native function on underlying system
         * @param obj
         * @param func
         * @param params
         * @return LuaObjectStore
         */
        fun call(obj: LuaNativeObject, func: String, params: ArrayList<Any?>): LuaObjectStore?

        /**
         * Call native function on underlying system
         * @param cls
         * @param func
         * @param params
         * @return LuaObjectStore
         */
        fun callClass(cls: String, func: String, params: ArrayList<Any?>): LuaObjectStore?
    }
}