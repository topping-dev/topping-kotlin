package dev.topping.kotlin.graphics

import dev.topping.kotlin.KTInterface

actual open class LuaRect : KTInterface {
    var luaRect: cocoapods.Topping.LuaRect? = null

    actual companion object {
        actual fun create(): LuaRect {
            val pobj = LuaRect()
            val pres = cocoapods.Topping.LuaRect.create()
            pobj.SetNativeObject(pres)
            return pobj
        }

        actual fun create(left: Float, top: Float, right: Float, bottom: Float): LuaRect {
            val pobj = LuaRect()
            val pres = cocoapods.Topping.LuaRect.createPar(left, top, right, bottom!!)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun set(left: Float, top: Float, right: Float, bottom: Float) {
        luaRect?.set(left, top, right, bottom)
    }

    actual fun getLeft(): Float {
        return luaRect?.getLeft()!!
    }

    actual fun getRight(): Float {
        return luaRect?.getRight()!!
    }

    actual fun getTop(): Float {
        return luaRect?.getTop()!!
    }

    actual fun getBottom(): Float {
        return luaRect?.getBottom()!!
    }

    open override fun GetNativeObject(): Any? {
        return luaRect
    }

    open override fun SetNativeObject(par: Any?) {
        luaRect = par as cocoapods.Topping.LuaRect?
    }
}