package dev.topping.kotlin.resource

import android.graphics.drawable.Drawable

actual class TDrawable {
    val drawable: Drawable
    actual constructor(native: Any) {
        this.drawable = native as Drawable
    }
}