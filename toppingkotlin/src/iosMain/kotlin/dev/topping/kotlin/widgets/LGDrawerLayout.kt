package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.toLuaTranslator

actual open class LGDrawerLayout : LGViewGroup() {
    var lgDrawerLayout: cocoapods.Topping.LGDrawerLayout? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGDrawerLayout {
            val pobj = dev.topping.kotlin.widgets.LGDrawerLayout()
            val pres = cocoapods.Topping.LGDrawerLayout.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun addOnDrawerSlide(func: ((LGDrawerLayout, Int) -> Unit)?) {
        lgDrawerLayout?.addOnDrawerSlide(func.toLuaTranslator(this))
    }

    actual fun addOnDrawerOpened(func: ((LGDrawerLayout) -> Unit)?) {
        lgDrawerLayout?.addOnDrawerOpened(func.toLuaTranslator(this))
    }

    actual fun addOnDrawerClosed(func: ((LGDrawerLayout) -> Unit)?) {
        lgDrawerLayout?.addOnDrawerClosed(func.toLuaTranslator(this))
    }

    actual fun addOnDrawerStateChanged(func: ((LGDrawerLayout, Int) -> Unit)?) {
        lgDrawerLayout?.addOnDrawerStateChanged(func.toLuaTranslator(this))
    }

    actual fun removeOnDrawerSlide(func: ((LGDrawerLayout, Int) -> Unit)?) {
        lgDrawerLayout?.removeOnDrawerSlide(func.toLuaTranslator(this))
    }

    actual fun removeOnDrawerOpened(func: ((LGDrawerLayout) -> Unit)?) {
        lgDrawerLayout?.removeOnDrawerOpened(func.toLuaTranslator(this))
    }

    actual fun removeOnDrawerClosed(func: ((LGDrawerLayout) -> Unit)?) {
        lgDrawerLayout?.removeOnDrawerClosed(func.toLuaTranslator(this))
    }

    actual fun removeOnDrawerStateChanged(func: ((LGDrawerLayout, Int) -> Unit)?) {
        lgDrawerLayout?.removeOnDrawerStateChanged(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any? {
        return lgDrawerLayout
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgDrawerLayout = par as cocoapods.Topping.LGDrawerLayout?
    }
}