package dev.topping.kotlin

actual open class LGViewGroup : LGView()
{
   var lgViewGroup: cocoapods.Topping.LGViewGroup? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGViewGroup {
            val pobj = LGViewGroup()
            val pres = cocoapods.Topping.LGViewGroup.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun getViewById(lId: LuaRef): LGView?
    {
        return KTWrap.Wrap(lgView?.getViewById(lId.luaRef)) as LGView?
    }
    actual fun addView(view: LGView) {
        lgViewGroup?.addSubview(view.lgView)
    }
    actual fun removeView(view: LGView) {
        lgViewGroup?.removeSubview(view.lgView)
    }
   open override fun GetNativeObject(): Any?
   {
       return lgViewGroup
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgViewGroup = par as cocoapods.Topping.LGViewGroup?
   }
}