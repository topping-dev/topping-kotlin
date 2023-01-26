package dev.topping.kotlin

actual open class LuaPoint : KTInterface
{
   var luaPoint: cocoapods.Topping.LuaPoint? = null
   actual companion object {
        actual fun createPoint(): LuaPoint {
            val pobj = LuaPoint()
            val pres = cocoapods.Topping.LuaPoint.createPoint()
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun createPointPar(x: Float, y: Float): LuaPoint {
            val pobj = LuaPoint()
            val pres = cocoapods.Topping.LuaPoint.createPointPar(x, y)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun set(x: Float, y: Float)
   {
       luaPoint?.set(x, y)
   }
   actual fun getX(): Float {
       return luaPoint?.getX()!!
   }
   actual fun getY(): Float {
       return luaPoint?.getY()!!
   }
    open override fun GetNativeObject(): Any?
   {
       return luaPoint
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaPoint = par as cocoapods.Topping.LuaPoint?
   }
}