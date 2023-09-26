package dev.topping.kotlin.resource

import cocoapods.Topping.LGColorState

actual class TColorStateList {
    val colorStateList: LGColorState

    actual constructor(native: Any) {
        this.colorStateList = native as LGColorState
    }
}