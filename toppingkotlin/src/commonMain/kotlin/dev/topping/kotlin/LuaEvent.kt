package dev.topping.kotlin

/**
 * Event handler
 */
expect open class LuaEvent {
    companion object {
        /**
         * Fires when form or fragment is created
         */
        val UI_EVENT_CREATE: Int

        /**
         * Fires when user interface view is created
         */
        val UI_EVENT_VIEW_CREATE: Int

        /**
         * Fires when user interface create view called
         */
        val UI_EVENT_FRAGMENT_CREATE_VIEW: Int

        /**
         * Fires when user interface view created
         */
        val UI_EVENT_FRAGMENT_VIEW_CREATED: Int

        /**
         * Fires when user interface resumed
         */
        val UI_EVENT_RESUME: Int

        /**
         * Fires when user interface paused
         */
        val UI_EVENT_PAUSE: Int

        /**
         * Fires when user interface destroyed
         */
        val UI_EVENT_DESTROY: Int

        /**
         * Fires when user interfaces updated
         */
        val UI_EVENT_UPDATE: Int

        /**
         * Fires when user interface paint called
         */
        val UI_EVENT_PAINT: Int

        /**
         * Fires when user interface tapped
         */
        val UI_EVENT_MOUSEDOWN: Int

        /**
         * Fires when user interface tap dropped
         */
        val UI_EVENT_MOUSEUP: Int

        /**
         * Fires when user touches and moves
         */
        val UI_EVENT_MOUSEMOVE: Int

        /**
         * Fires when keystroke happened
         */
        val UI_EVENT_KEYDOWN: Int

        /**
         * Fires when keystoke dropped
         */
        val UI_EVENT_KEYUP: Int

        /**
         * Fires when nfc event happened
         */
        val UI_EVENT_NFC: Int

        /**
         * Registers UI event
         * @param luaId
         * @param event +"LuaFragment.FRAGMENT_EVENT_CREATE" | "LuaFragment.FRAGMENT_EVENT_CREATE_VIEW" | "LuaFragment.FRAGMENT_EVENT_VIEW_CREATED" | "LuaFragment.FRAGMENT_EVENT_RESUME" | "LuaFragment.FRAGMENT_EVENT_PAUSE" | "LuaFragment.FRAGMENT_EVENT_DESTROY"
         * @param lt +fun(fragment: LuaFragment, context: LuaContext):void
         */
        fun registerUIEvent(luaId: LuaRef, event: Int, func: Function<Any?>)

        /**
         * Register From class
         * @param clsName
         * @param func ILuaForm
         */
        fun registerForm(clsName: String, func: (Any) -> ILuaForm)

        /**
         * Register From class
         * @param clsName
         * @param func ILuaFragment
         */
        fun registerFragment(clsName: String, func: (Any) -> ILuaFragment)
    }
}