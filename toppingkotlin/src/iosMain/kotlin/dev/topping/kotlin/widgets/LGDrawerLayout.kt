package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.toLuaTranslator
import kotlinx.cinterop.ExperimentalForeignApi

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

    @OptIn(ExperimentalForeignApi::class)
    actual fun addOnDrawerSlide(func: ((LGDrawerLayout, Int) -> Unit)?) {
        lgDrawerLayout?.addOnDrawerSlide(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun addOnDrawerOpened(func: ((LGDrawerLayout) -> Unit)?) {
        lgDrawerLayout?.addOnDrawerOpened(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun addOnDrawerClosed(func: ((LGDrawerLayout) -> Unit)?) {
        lgDrawerLayout?.addOnDrawerClosed(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun addOnDrawerStateChanged(func: ((LGDrawerLayout, Int) -> Unit)?) {
        lgDrawerLayout?.addOnDrawerStateChanged(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun removeOnDrawerSlide(func: ((LGDrawerLayout, Int) -> Unit)?) {
        lgDrawerLayout?.removeOnDrawerSlide(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun removeOnDrawerOpened(func: ((LGDrawerLayout) -> Unit)?) {
        lgDrawerLayout?.removeOnDrawerOpened(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun removeOnDrawerClosed(func: ((LGDrawerLayout) -> Unit)?) {
        lgDrawerLayout?.removeOnDrawerClosed(func.toLuaTranslator(this))
    }

    @OptIn(ExperimentalForeignApi::class)
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