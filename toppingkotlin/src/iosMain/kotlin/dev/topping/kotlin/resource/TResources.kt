package dev.topping.kotlin.resource

import cocoapods.Topping.*
import dev.topping.kotlin.LuaRef
import kotlinx.cinterop.*

actual class TResources {
    val resources: ToppingResources

    actual constructor(native: Any) {
        this.resources = native as ToppingResources
    }

    actual fun getBoolean(id: LuaRef): Boolean {
        return resources.getBooleanValue(id.luaRef!!.idRef!!, false)
    }

    actual fun getColor(id: LuaRef): LuaColor {
        //TODO: Tidy this up?
        val c = LGColorParser.getInstance()!!.parseColor(id.luaRef!!.idRef!!)!!
        memScoped {
            val a = alloc<DoubleVar>()
            val r = alloc<DoubleVar>()
            val g = alloc<DoubleVar>()
            val b = alloc<DoubleVar>()
            c.getRed(r.ptr, g.ptr, b.ptr, a.ptr)
            return LuaColor.createFromARGB(
                (a.value * 255).toInt(), (r.value * 255).toInt(),
                (g.value * 255).toInt(), (b.value * 255).toInt()
            )
        }
    }

    actual fun getColorStateList(id: LuaRef): TColorStateList {
        return TColorStateList(LGColorParser.getInstance()!!.getColorState(id.luaRef!!.idRef!!)!!)
    }

    actual fun getDimension(id: LuaRef): Float {
        return resources.getDimensionValue(id.luaRef!!.idRef!!, 0f)
    }

    actual fun getDimensionPixelSize(id: LuaRef): Float {
        return resources.getDimensionPixelSizeValue(id.luaRef!!.idRef!!, 0).toFloat()
    }

    actual fun getDrawable(id: LuaRef): TDrawable {
        return TDrawable(LGDrawableParser.getInstance()!!.parseDrawableRef(id.luaRef!!)!!)
    }

    actual fun getFloat(id: LuaRef): Float {
        return resources.getFloatKey(null, id.luaRef!!.idRef!!, 0f)
    }

    actual fun getFont(id: LuaRef): TFont {
        return TFont(LGFontParser.getInstance()!!.getFont(id.luaRef!!.idRef!!)!!)
    }

    actual fun getIdentifier(
        id: String,
        defType: String,
        pkg: String
    ): LuaRef {
        return LuaRef.withValue(id, id)
    }

    actual fun getIntArray(id: LuaRef): IntArray {
        return LGValueParser.getInstance()!!.getValue(id.luaRef!!.idRef!!)!! as IntArray
    }

    actual fun getString(id: LuaRef): String {
        return LGStringParser.getInstance()!!.getString(id.luaRef!!.idRef!!)!!
    }
}