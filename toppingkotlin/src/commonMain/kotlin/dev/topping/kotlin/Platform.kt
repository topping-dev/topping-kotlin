package dev.topping.kotlin

interface OnComplete {
    fun onComplete()
}

interface OnBeforeInit {
    fun onBeforeInit()
}

expect class Platform() {
    companion object
    {
        fun getBindings() : HashMap<Any, Any>?
        fun getRetBindings() : HashMap<Any, Any>?
        fun init(activityOrWindow: Any, onBeforeInit: OnBeforeInit, onComplete: OnComplete)
    }
}