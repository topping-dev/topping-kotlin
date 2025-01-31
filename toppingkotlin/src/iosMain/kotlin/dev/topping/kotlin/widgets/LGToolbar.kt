package dev.topping.kotlin.widgets

import dev.topping.kotlin.KTWrap
import dev.topping.kotlin.LuaRef
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.StableRef

actual open class LGToolbar : LGView() {
    var lgToolbar: cocoapods.Topping.LGToolbar? = null
    actual fun setMenu(ref: LuaRef?) {
        lgToolbar?.setMenu(ref?.luaRef)
    }

    actual fun setLogo(logo: LuaRef?) {
        lgToolbar?.setLogo(logo?.luaRef)
    }

    actual fun setNavigationIcon(icon: LuaRef?) {
        lgToolbar?.setNavigationIcon(icon?.luaRef)
    }

    actual fun setOverflowIcon(icon: LuaRef?) {
        lgToolbar?.setOverflowIcon(icon?.luaRef)
    }

    actual fun getTitle(): String? {
        return lgToolbar?.getTitle()
    }

    actual fun setTitleInternal(text: String?) {
        lgToolbar?.setTitleInternal(text)
    }

    actual fun setTitle(ref: LuaRef?) {
        lgToolbar?.setTitle(ref?.luaRef)
    }

    actual fun setTitleTextColor(ref: LuaRef?) {
        lgToolbar?.setTitleTextColor(ref?.luaRef)
    }

    actual fun setTitleTextApperance(ref: LuaRef?) {
        lgToolbar?.setTitleTextApperance(ref?.luaRef)
    }

    actual fun getSubtitle(): String? {
        return lgToolbar?.getSubtitle()
    }

    actual fun setSubtitleInternal(text: String?) {
        lgToolbar?.setSubtitleInternal(text)
    }

    actual fun setSubtitle(ref: LuaRef?) {
        lgToolbar?.setSubtitle(ref?.luaRef)
    }

    actual fun setSubtitleTextColor(ref: LuaRef?) {
        lgToolbar?.setSubtitleTextColor(ref?.luaRef)
    }

    actual fun setSubtitleTextApperance(ref: LuaRef?) {
        lgToolbar?.setSubtitleTextApperance(ref?.luaRef)
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setNavigationOnClickListener(func: ((LGToolbar) -> Unit)?) {
        val kt: KTWrap = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        lgToolbar?.setNavigationOnClickListener(lt)
    }

    @OptIn(ExperimentalForeignApi::class)
    actual fun setMenuItemClickListener(func: ((LGToolbar) -> Unit)?) {
        val kt: KTWrap = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        lgToolbar?.setMenuItemClickListener(lt)
    }

    open override fun GetNativeObject(): Any? {
        return lgToolbar
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgToolbar = par as cocoapods.Topping.LGToolbar?
    }
}