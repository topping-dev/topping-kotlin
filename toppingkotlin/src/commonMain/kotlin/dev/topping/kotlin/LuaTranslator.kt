package dev.topping.kotlin

/**
 * Translates Lua Functions to native functions
 */
expect open class LuaTranslator {
    companion object {
        /**
         * Creates LuaTranslator Object From Lua.
         * @param obj
         * @param functionName
         * @return LuaTranslator
         */
        fun register(obj: Any?, functionName: String?): LuaTranslator?
    }
}