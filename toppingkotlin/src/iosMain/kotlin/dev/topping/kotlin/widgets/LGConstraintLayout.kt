package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGConstraintLayout : LGViewGroup() {
    var lgConstraintLayout: cocoapods.Topping.LGConstraintLayout? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGConstraintLayout {
            val pobj = dev.topping.kotlin.widgets.LGConstraintLayout()
            val pres = cocoapods.Topping.LGConstraintLayout.create(lc.luaContext!!)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgConstraintLayout
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintLayout = par as cocoapods.Topping.LGConstraintLayout?
    }
}

actual open class LGConstraintBarrier : LGView() {
    var lgConstraintBarrier: cocoapods.Topping.LGConstraintBarrier? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintBarrier
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintBarrier = par as cocoapods.Topping.LGConstraintBarrier?
    }
}

actual open class LGConstraintCarousel : LGView() {
    var lgConstraintCarousel: cocoapods.Topping.LGConstraintCarousel? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintCarousel
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintCarousel = par as cocoapods.Topping.LGConstraintCarousel?
    }
}

actual open class LGConstraintCircularFlow : LGView() {
    var lgConstraintCircularFlow: cocoapods.Topping.LGConstraintCircularFlow? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintCircularFlow
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintCircularFlow = par as cocoapods.Topping.LGConstraintCircularFlow?
    }
}

actual open class LGConstraintFlow : LGView() {
    var lgConstraintFlow: cocoapods.Topping.LGConstraintFlow? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintFlow
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintFlow = par as cocoapods.Topping.LGConstraintFlow?
    }
}

actual open class LGConstraintGrid : LGView() {
    var lgConstraintGrid: cocoapods.Topping.LGConstraintGrid? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintGrid
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintGrid = par as cocoapods.Topping.LGConstraintGrid?
    }
}

actual open class LGConstraintGroup : LGView() {
    var lgConstraintGroup: cocoapods.Topping.LGConstraintGroup? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintGroup
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintGroup = par as cocoapods.Topping.LGConstraintGroup?
    }
}

actual open class LGConstraintGuideline : LGView() {
    var lgConstraintGuideline: cocoapods.Topping.LGConstraintGuideline? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintGuideline
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintGuideline = par as cocoapods.Topping.LGConstraintGuideline?
    }
}

actual open class LGConstraintImageFilterButton : LGImageView() {
    var lgConstraintImageFilterButton: cocoapods.Topping.LGConstraintImageFilterButton? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintImageFilterButton
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintImageFilterButton = par as cocoapods.Topping.LGConstraintImageFilterButton?
    }
}

actual open class LGConstraintImageFilterView : LGImageView() {
    var lgConstraintImageFilterView: cocoapods.Topping.LGConstraintImageFilterView? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintImageFilterView
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintImageFilterView = par as cocoapods.Topping.LGConstraintImageFilterView?
    }
}

actual open class LGConstraintLayer : LGView() {
    var lgConstraintLayer: cocoapods.Topping.LGConstraintLayer? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintLayer
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintLayer = par as cocoapods.Topping.LGConstraintLayer?
    }
}

actual open class LGConstraintMotionButton : LGButton() {
    var lgConstraintMotionButton: cocoapods.Topping.LGConstraintMotionButton? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintMotionButton
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintMotionButton = par as cocoapods.Topping.LGConstraintMotionButton?
    }
}

actual open class LGConstraintMotionEffect : LGView() {
    var lgConstraintMotionEffect: cocoapods.Topping.LGConstraintMotionEffect? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintMotionEffect
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintMotionEffect = par as cocoapods.Topping.LGConstraintMotionEffect?
    }
}

actual open class LGConstraintMotionPlaceholder : LGView() {
    var lgConstraintMotionPlaceholder: cocoapods.Topping.LGConstraintMotionPlaceholder? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintMotionPlaceholder
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintMotionPlaceholder = par as cocoapods.Topping.LGConstraintMotionPlaceholder?
    }
}

actual open class LGConstraintPlaceholder : LGView() {
    var lgConstraintPlaceholder: cocoapods.Topping.LGConstraintPlaceholder? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintPlaceholder
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintPlaceholder = par as cocoapods.Topping.LGConstraintPlaceholder?
    }
}

actual open class LGConstraintReactiveGuide : LGView() {
    var lgConstraintReactiveGuide: cocoapods.Topping.LGConstraintReactiveGuide? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintReactiveGuide
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintReactiveGuide = par as cocoapods.Topping.LGConstraintReactiveGuide?
    }
}

actual open class LGConstraintMotionLayout : LGConstraintLayout() {
    var lgConstraintMotionLayout: cocoapods.Topping.LGConstraintMotionLayout? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintMotionLayout
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintMotionLayout = par as cocoapods.Topping.LGConstraintMotionLayout?
    }
}