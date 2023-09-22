package dev.topping.kotlin

/**
 * Constraint Layout
 */
expect open class LGConstraintLayout : LGViewGroup {
    companion object {
        /**
         * Creates LGConstraintLayout Object From Lua.
         * @param lc
         * @return LGConstraintLayout
         */
        fun create(lc: LuaContext): LGConstraintLayout
    }
}

expect open class LGConstraintBarrier : LGView
expect open class LGConstraintCarousel : LGView
expect open class LGConstraintCircularFlow : LGView
expect open class LGConstraintFlow : LGView
expect open class LGConstraintGrid : LGView
expect open class LGConstraintGroup : LGView
expect open class LGConstraintGuideline : LGView
expect open class LGConstraintImageFilterButton : LGImageView
expect open class LGConstraintImageFilterView : LGImageView
expect open class LGConstraintLayer : LGView
expect open class LGConstraintMotionButton : LGButton
expect open class LGConstraintMotionEffect : LGView
expect open class LGConstraintMotionPlaceholder : LGView
expect open class LGConstraintPlaceholder : LGView
expect open class LGConstraintReactiveGuide : LGView
expect open class LGConstraintMotionLayout : LGConstraintLayout