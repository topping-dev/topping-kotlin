package dev.topping.kotlin

expect open class LGAutoCompleteTextView : LGEditText
{
   companion object {
        fun create(lc: LuaContext): LGAutoCompleteTextView
   }
}