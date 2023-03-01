package dev.topping.kotlin

actual open class LGTextInputEditText : LGEditText()
{
   var lgTextInputEditText: cocoapods.Topping.LGTextInputEditText? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGTextInputEditText {
            val pobj = LGTextInputEditText()
            val pres = cocoapods.Topping.LGTextInputEditText.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }

    open override fun GetNativeObject(): Any?
   {
       return lgTextInputEditText
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgTextInputEditText = par as cocoapods.Topping.LGTextInputEditText?
   }
}