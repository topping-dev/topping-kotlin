package dev.topping.kotlin.resource

import android.content.res.Resources
import androidx.core.graphics.alpha
import androidx.core.graphics.blue
import androidx.core.graphics.green
import androidx.core.graphics.red
import dev.topping.kotlin.LuaRef

actual class TResources {
    val resources: Resources
    actual constructor(native: Any) {
        this.resources = native as Resources
    }

    actual fun getBoolean(id: LuaRef): Boolean {
        resources.getBoolean(id.luaRef!!.ref)
    }

    actual fun getColor(id: LuaRef): LuaColor {
        val color = resources.getColor(id.luaRef!!.ref)
        return LuaColor.createFromARGB(color.alpha, color.red, color.green, color.blue)
    }

    actual fun getColorStateList(id: LuaRef): TColorStateList {
        return TColorStateList(resources.getColorStateList(id.luaRef!!.ref))
    }

    actual fun getDimension(id: LuaRef): Float {
        resources.getDimension(id.luaRef!!.ref)
    }

    actual fun getDimensionPixelSize(id: LuaRef): Float {
        resources.getDimensionPixelSize(id.luaRef!!.ref)
    }

    actual fun getDrawable(id: LuaRef): TDrawable {
        TODO("Not yet implemented")
    }

    actual fun getFloat(id: LuaRef): Float {
        return resources.getFloat(id.luaRef!!.ref)
    }

    actual fun getFont(id: LuaRef): TFont {
        return TFont(resources.getFont(id.luaRef!!.ref))
    }

    actual fun getIdentifier(
        id: String,
        defType: String,
        pkg: String
    ): LuaRef {
        return LuaRef.withValue(id, resources.getIdentifier(id, defType, pkg))
    }

    actual fun getIntArray(id: LuaRef): IntArray {
        return resources.getIntArray(id.luaRef!!.ref)
    }

    actual fun getString(id: LuaRef): String {
        return resources.getString(id.luaRef!!.ref)
    }
}