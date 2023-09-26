package dev.topping.kotlin.widgets

import android.widget.ImageView
import dev.topping.kotlin.LuaContext
import dev.topping.kotlin.LuaRef
import dev.topping.kotlin.resource.LuaStream
import dev.topping.kotlin.resource.TDrawable

actual open class LGImageView : LGView() {
    var lgImageView: android.widget.LGImageView? = null

    actual companion object {
        actual fun create(lc: LuaContext, luaId: String): LGImageView {
            val pobj = dev.topping.kotlin.widgets.LGImageView()
            val pres = android.widget.LGImageView.create(lc.luaContext, luaId)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }

    actual fun setImage(stream: LuaStream?) {
        lgImageView?.setImage(stream?.luaStream)
    }

    actual fun setImage(drawable: TDrawable?) {
        (lgImageView!!.view as ImageView).setImageDrawable(drawable?.drawable)
    }

    actual fun setImageRef(ref: LuaRef?) {
        lgImageView?.setImageRef(ref?.luaRef)
    }

    open override fun GetNativeObject(): Any? {
        return lgImageView
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgImageView = par as android.widget.LGImageView?
    }
}