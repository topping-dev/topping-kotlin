package dev.topping.kotlin.resource

import cocoapods.Topping.LGFontReturn

actual class TFont {
    val font: LGFontReturn

    actual constructor(native: Any) {
        this.font = native as LGFontReturn
    }
}