package dev.topping.kotlin

expect open class LuaEvent
{
   companion object {
        val UI_EVENT_CREATE: Int
        val UI_EVENT_VIEW_CREATE: Int
        val UI_EVENT_FRAGMENT_CREATE_VIEW: Int
        val UI_EVENT_FRAGMENT_VIEW_CREATED: Int
        val UI_EVENT_RESUME: Int
        val UI_EVENT_PAUSE: Int
        val UI_EVENT_DESTROY: Int
        val UI_EVENT_UPDATE: Int
        val UI_EVENT_PAINT: Int
        val UI_EVENT_MOUSEDOWN: Int
        val UI_EVENT_MOUSEUP: Int
        val UI_EVENT_MOUSEMOVE: Int
        val UI_EVENT_KEYDOWN: Int
        val UI_EVENT_KEYUP: Int
        val UI_EVENT_NFC: Int
        fun registerUIEvent(luaId: LuaRef, event: Int, func: Function<Any?>)
        fun registerForm(clsName: String, func: (Any) -> ILuaForm)
        fun registerFragment(clsName: String, func: (Any) -> ILuaFragment)
   }
}