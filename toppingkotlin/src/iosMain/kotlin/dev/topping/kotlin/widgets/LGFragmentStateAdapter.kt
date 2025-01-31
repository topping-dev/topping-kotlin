package dev.topping.kotlin.widgets

import dev.topping.kotlin.*
import dev.topping.kotlin.lifecycle.LuaLifecycle
import kotlinx.cinterop.ExperimentalForeignApi

actual open class LGFragmentStateAdapter : KTInterface {
    var lgFragmentStateAdapter: cocoapods.Topping.LGFragmentStateAdapter? = null

    actual companion object {
        actual fun createFromForm(form: LuaForm): LGFragmentStateAdapter? {

            val pobj = dev.topping.kotlin.widgets.LGFragmentStateAdapter()
            val pres = cocoapods.Topping.LGFragmentStateAdapter.createFromForm(form.luaForm)
            pobj.SetNativeObject(pres)
            return pobj
        }

        actual fun createFromFragment(fragment: LuaFragment): LGFragmentStateAdapter? {
            val pobj = dev.topping.kotlin.widgets.LGFragmentStateAdapter()
            val pres =
                cocoapods.Topping.LGFragmentStateAdapter.createFromFragment(fragment.luaFragment)
            pobj.SetNativeObject(pres)
            return pobj
        }

        actual fun create(
            lc: LuaContext,
            fragmentManager: LuaFragmentManager,
            lifecycle: LuaLifecycle
        ): LGFragmentStateAdapter? {
            val pobj = dev.topping.kotlin.widgets.LGFragmentStateAdapter()
            val pres = cocoapods.Topping.LGFragmentStateAdapter.create(
                lc.luaContext,
                fragmentManager.luaFragmentManager,
                lifecycle.luaLifecycle
            )
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setCreateFragment(func: (Int) -> LuaFragment) {
        lgFragmentStateAdapter?.setCreateFragment(func.toLuaTranslator(null))
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setGetItemCount(func: () -> Int) {
        lgFragmentStateAdapter?.setGetItemCount(func.toLuaTranslator(null))
    }

    open override fun GetNativeObject(): Any? {
        return lgFragmentStateAdapter
    }

    open override fun SetNativeObject(par: Any?) {
        lgFragmentStateAdapter = par as cocoapods.Topping.LGFragmentStateAdapter?
    }
}