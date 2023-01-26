package dev.topping.kotlin

actual open class LGHorizontalScrollView : LGFrameLayout()
{
   var lgHorizontalScrollView: android.widget.LGHorizontalScrollView? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGHorizontalScrollView {
            val pobj = LGHorizontalScrollView()
            val pres = android.widget.LGHorizontalScrollView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgHorizontalScrollView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgHorizontalScrollView = par as android.widget.LGHorizontalScrollView?
   }
}