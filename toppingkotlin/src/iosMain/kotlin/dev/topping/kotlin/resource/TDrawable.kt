package dev.topping.kotlin.resource

import cocoapods.Topping.LGDrawableReturn

actual class TDrawable {
    val drawable: LGDrawableReturn

    actual constructor(native: Any) {
        this.drawable = native as LGDrawableReturn
    }
}