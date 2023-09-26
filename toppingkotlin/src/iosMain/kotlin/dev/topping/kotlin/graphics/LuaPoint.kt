package dev.topping.kotlin.graphics

import dev.topping.kotlin.KTInterface

actual open class LuaPoint : KTInterface {
    var luaPoint: cocoapods.Topping.LuaPoint? = null

    actual companion object {
        actual fun create(): LuaPoint {
            val pobj = LuaPoint()
            val pres = cocoapods.Topping.LuaPoint.create()
            pobj.SetNativeObject(pres)
            return pobj
        }

        actual fun create(x: Float, y: Float): LuaPoint {
            val pobj = LuaPoint()
            val pres = cocoapods.Topping.LuaPoint.createPar(x, y)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun set(x: Float, y: Float) {
        luaPoint?.set(x, y)
    }

    actual fun getX(): Float {
        return luaPoint?.getX()!!
    }

    actual fun getY(): Float {
        return luaPoint?.getY()!!
    }

    open override fun GetNativeObject(): Any? {
        return luaPoint
    }

    open override fun SetNativeObject(par: Any?) {
        luaPoint = par as cocoapods.Topping.LuaPoint?
    }
}