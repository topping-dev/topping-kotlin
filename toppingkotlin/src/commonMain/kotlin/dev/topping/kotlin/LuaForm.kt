package dev.topping.kotlin

import dev.topping.kotlin.lifecycle.LuaLifecycle
import dev.topping.kotlin.widgets.LGView

/**
 * User interface controller
 */
expect open class LuaForm {
    companion object {
        /**
         * Creates LuaForm Object From Lua.
         * Form that created will be sent on FORM_EVENT_CREATE event.
         * @param lc
         * @param luaId
         * @return LuaNativeObject
         */
        fun create(lc: LuaContext, luaId: LuaRef)

        /**
         * Creates LuaForm Object From Lua with ui.
         * Form that created will be sent on FORM_EVENT_CREATE event.
         * @param lc
         * @param luaId
         * @param ui
         * @return LuaNativeObject
         */
        fun createWithUI(lc: LuaContext, luaId: LuaRef, ui: LuaRef)

        /**
         * Gets Active LuaForm
         * Try to get active from context when possible
         * @return LuaForm
         */
        fun getActiveForm(): LuaForm?
    }

    /**
     * Gets LuaContext value of form
     * @return LuaContext
     */
    fun getContext(): LuaContext?

    /**
     * Gets the view of form.
     * @return LGView
     */
    fun <T> getViewById(lId: LuaRef?): T?

    /**
     * Gets the view bindings
     * @return HashMap
     */
    fun getBindings(): Map<String, LGView>?

    /**
     * Gets the view.
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
     * Sets the title of the screen.
     * @param str
     */
    fun setTitle(str: String)

    /**
     * Closes the form
     */
    fun close()

    /**
     * Get lifecycle
     */
    fun getLifecycle(): LuaLifecycle?

    /**
     * Get Fragment Manager
     */
    fun getFragmentManager(): LuaFragmentManager?

    /**
     * Get Native Form
     */
    fun getNativeForm(): Any
}