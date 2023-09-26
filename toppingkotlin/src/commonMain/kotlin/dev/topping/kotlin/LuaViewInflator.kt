package dev.topping.kotlin

import dev.topping.kotlin.widgets.LGView

expect open class LuaViewInflator {
    companion object {
        /**
         * Creates LuaViewInflater Object From Lua.
         * @param lc
         * @return LuaViewInflator
         */
        fun create(lc: LuaContext): LuaViewInflator
    }

    /**
     * Parses xml file
     * @param filename
     * @param parent
     * @return LGView
     */
    fun parseFile(filename: String, parent: LGView?): LGView?

    /**
     * Parses xml file
     * @param id
     * @param parent
     * @return LGView
     */
    fun inflate(id: LuaRef, parent: LGView?): LGView?
}