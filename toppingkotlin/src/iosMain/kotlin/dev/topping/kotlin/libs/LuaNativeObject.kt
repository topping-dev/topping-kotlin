package dev.topping.kotlin.libs

import dev.topping.kotlin.KTInterface

actual open class LuaNativeObject : KTInterface {
    var luaNativeObject: cocoapods.Topping.LuaNativeObject? = null
    open override fun GetNativeObject(): Any? {
        return luaNativeObject
    }

    open override fun SetNativeObject(par: Any?) {
        luaNativeObject = par as cocoapods.Topping.LuaNativeObject?
    }
}