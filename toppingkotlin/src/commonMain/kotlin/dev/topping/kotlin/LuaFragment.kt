package dev.topping.kotlin

import dev.topping.kotlin.lifecycle.LuaLifecycleOwner
import dev.topping.kotlin.navigation.LuaNavController
import dev.topping.kotlin.resource.LuaBundle
import dev.topping.kotlin.widgets.LGView

/**
 * User interface fragment
 */
expect open class LuaFragment() {
    companion object {
        /**
         * Creates LuaFragment Object From Lua.
         * Fragment that created will be sent on FRAGMENT_EVENT_CREATE event.
         * @param lc
         * @param luaId
         * @return LuaFragment
         */
        fun create(lc: LuaContext, luaId: LuaRef): LuaFragment

        /**
         * Creates LuaFragment Object From Lua.
         * Fragment that created will be sent on FRAGMENT_EVENT_CREATE event.
         * @param lc
         * @param luaId
         * @param args
         * @return LuaFragment
         */
        fun create(lc: LuaContext, luaId: LuaRef, args: LuaBundle): LuaFragment

        /**
         * Creates LuaFragment Object From Lua with ui.
         * Fragment that created will be sent on FRAGMENT_EVENT_CREATE event.
         * @param lc
         * @param luaId
         * @param ui
         * @return LuaFragment
         */
        fun createWithUI(
            lc: LuaContext,
            luaId: LuaRef,
            ui: LuaRef,
            args: LuaBundle
        ): LuaFragment
    }

    /**
     * Gets LuaContext value of fragment
     * @return LuaContext
     */
    fun getContext(): LuaContext

    /**
     * Checks that fragment is initialized or not.
     * @return boolean
     */
    fun isInitialized(): Boolean

    /**
     * Gets the view by id
     * @param lId
     * @return LGView
     */
    fun <T> getViewById(lId: LuaRef): T?

    /**
     * Gets the view of fragment.
     * @return LGView
     */
    fun getView(): LGView?

    /**
     * Sets the view to render.
     * @param v
     */
    fun setView(v: LGView?)

    /**
     * Sets the xml file of the view to render.
     * @param xml
     */
    fun setViewXML(xml: LuaRef)

    /**
     * Sets the luaid of the view to render.
     * @param luaId
     */
    fun setViewId(luaId: String)

    /**
     * Sets the title of the screen.
     * @param str
     */
    fun setTitle(str: String)

    /**
     * Closes the form
     */
    fun close()

    /**
     * Get Arguments
     */
    fun getArguments(): LuaBundle

    /**
     * Get Nav Controller
     */
    fun getNavController(): LuaNavController

    /**
     * Get View Lifecycle Owner
     */
    fun getViewLifecycleOwner(): LuaLifecycleOwner
}