package dev.topping.kotlin

expect open class LuaLiveData {
    companion object {
        /**
         * Create live data
         */
        fun create(): LuaLiveData
    }

    /**
     * observe value
     * @param lt +fun(livedata:LuaMutableLiveData obj: userdata):void
     */
    fun observe(owner: LuaLifecycleOwner, func: (LuaLiveData, Any) -> Unit)

    /**
     * remove observer
     * @param lt +fun(obj: userdata):void
     */
    fun removeObserver(func: (LuaLiveData, Any) -> Unit)

    /**
     * get value
     * @return value
     */
    fun getValue(): Any?
}