package dev.topping.kotlin.widgets

import dev.topping.kotlin.LuaContext

actual open class LGConstraintLayout : LGViewGroup() {
    var lgConstraintLayout: android.widget.LGConstraintLayout? = null

    actual companion object {
        actual fun create(lc: LuaContext): LGConstraintLayout {
            val pobj = dev.topping.kotlin.widgets.LGConstraintLayout()
            val pres = android.widget.LGConstraintLayout.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    open override fun GetNativeObject(): Any? {
        return lgConstraintLayout
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintLayout = par as android.widget.LGConstraintLayout?
    }
}

actual open class LGConstraintBarrier : LGView() {
    var lgConstraintBarrier: android.widget.LGConstraintBarrier? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintBarrier
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintBarrier = par as android.widget.LGConstraintBarrier?
    }
}

actual open class LGConstraintCarousel : LGView() {
    var lgConstraintCarousel: android.widget.LGConstraintCarousel? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintCarousel
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintCarousel = par as android.widget.LGConstraintCarousel?
    }
}

actual open class LGConstraintCircularFlow : LGView() {
    var lgConstraintCircularFlow: android.widget.LGConstraintCircularFlow? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintCircularFlow
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintCircularFlow = par as android.widget.LGConstraintCircularFlow?
    }
}

actual open class LGConstraintFlow : LGView() {
    var lgConstraintFlow: android.widget.LGConstraintFlow? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintFlow
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintFlow = par as android.widget.LGConstraintFlow?
    }
}

actual open class LGConstraintGrid : LGView() {
    var lgConstraintGrid: android.widget.LGConstraintGrid? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintGrid
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintGrid = par as android.widget.LGConstraintGrid?
    }
}

actual open class LGConstraintGroup : LGView() {
    var lgConstraintGroup: android.widget.LGConstraintGroup? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintGroup
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintGroup = par as android.widget.LGConstraintGroup?
    }
}

actual open class LGConstraintGuideline : LGView() {
    var lgConstraintGuideline: android.widget.LGConstraintGuideline? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintGuideline
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintGuideline = par as android.widget.LGConstraintGuideline?
    }
}

actual open class LGConstraintImageFilterButton : LGImageView() {
    var lgConstraintImageFilterButton: android.widget.LGConstraintImageFilterButton? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintImageFilterButton
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintImageFilterButton = par as android.widget.LGConstraintImageFilterButton?
    }
}

actual open class LGConstraintImageFilterView : LGImageView() {
    var lgConstraintImageFilterView: android.widget.LGConstraintImageFilterView? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintImageFilterView
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintImageFilterView = par as android.widget.LGConstraintImageFilterView?
    }
}

actual open class LGConstraintLayer : LGView() {
    var lgConstraintLayer: android.widget.LGConstraintLayer? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintLayer
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintLayer = par as android.widget.LGConstraintLayer?
    }
}

actual open class LGConstraintMotionButton : LGButton() {
    var lgConstraintMotionButton: android.widget.LGConstraintMotionButton? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintMotionButton
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintMotionButton = par as android.widget.LGConstraintMotionButton?
    }
}

actual open class LGConstraintMotionEffect : LGView() {
    var lgConstraintMotionEffect: android.widget.LGConstraintMotionEffect? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintMotionEffect
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintMotionEffect = par as android.widget.LGConstraintMotionEffect?
    }
}

actual open class LGConstraintMotionPlaceholder : LGView() {
    var lgConstraintMotionPlaceholder: android.widget.LGConstraintMotionPlaceholder? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintMotionPlaceholder
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintMotionPlaceholder = par as android.widget.LGConstraintMotionPlaceholder?
    }
}

actual open class LGConstraintPlaceholder : LGView() {
    var lgConstraintPlaceholder: android.widget.LGConstraintPlaceholder? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintPlaceholder
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintPlaceholder = par as android.widget.LGConstraintPlaceholder?
    }
}

actual open class LGConstraintReactiveGuide : LGView() {
    var lgConstraintReactiveGuide: android.widget.LGConstraintReactiveGuide? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintReactiveGuide
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintReactiveGuide = par as android.widget.LGConstraintReactiveGuide?
    }
}

actual open class LGConstraintMotionLayout : LGConstraintLayout() {
    var lgConstraintMotionLayout: android.widget.LGConstraintMotionLayout? = null

    open override fun GetNativeObject(): Any? {
        return lgConstraintMotionLayout
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgConstraintMotionLayout = par as android.widget.LGConstraintMotionLayout?
    }
}