package dev.topping.kotlin.resource

import android.content.res.ColorStateList

actual class TColorStateList {
    val colorStateList: ColorStateList

    actual constructor(native: Any) {
        this.colorStateList = native as ColorStateList
    }
}