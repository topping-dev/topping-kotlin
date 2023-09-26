package dev.topping.kotlin.resource

import android.graphics.fonts.Font

actual class TFont {
    val font: Font

    actual constructor(native: Any) {
        this.font = native as Font
    }
}