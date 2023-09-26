package dev.topping.kotlin.resource

import dev.topping.kotlin.LuaRef

expect class TResources(native: Any) {
    fun getBoolean(id: LuaRef) : Boolean
    fun getColor(id: LuaRef) : LuaColor
    fun getColorStateList(id: LuaRef) : TColorStateList
    fun getDimension(id: LuaRef) : Float
    fun getDimensionPixelSize(id: LuaRef) : Float
    fun getDrawable(id: LuaRef) : TDrawable
    fun getFloat(id: LuaRef) : Float
    fun getFont(id: LuaRef) : TFont
    fun getIdentifier(id: String, defType: String, pkg: String) : LuaRef
    fun getIntArray(id: LuaRef) : IntArray
    fun getString(id: LuaRef) : String
}