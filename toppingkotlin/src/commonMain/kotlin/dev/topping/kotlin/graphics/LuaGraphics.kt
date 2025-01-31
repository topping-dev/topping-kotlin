package dev.topping.kotlin.graphics

expect open class LuaGraphics {
    fun setPen(r: Int, g: Int, b: Int)
    fun setPenEx(r: Int, g: Int, b: Int, width: Float)
    fun setBrush(type: Int, r: Int, g: Int, b: Int)
    fun setRectStore(id: Int, x: Int, y: Int, width: Int, height: Int)
    fun drawEllipsePenRectCache()
    fun drawEllipseRectCache(r: Int, g: Int, b: Int)
    fun drawEllipseRectCacheEx(r: Int, g: Int, b: Int, width: Float)
    fun drawEllipsePenCache(x: Int, y: Int, width: Int, height: Int)
    fun drawEllipse(r: Int, g: Int, b: Int, x: Int, y: Int, width: Int, height: Int)
    fun drawEllipseEx(
        r: Int,
        g: Int,
        b: Int,
        penWidth: Float,
        x: Int,
        y: Int,
        width: Int,
        height: Int
    )

    fun drawCirclePenCache(x: Int, y: Int, radius: Int)
    fun drawCircle(r: Int, g: Int, b: Int, x: Int, y: Int, radius: Int)
    fun drawCircleEx(r: Int, g: Int, b: Int, width: Float, x: Int, y: Int, radius: Int)
    fun drawIcon(i: String?, x: Int, y: Int)
    fun drawImage(i: String?, x: Int, y: Int)
    fun drawImageRectCacheEx(
        i: String?,
        srcX: Int,
        srcY: Int,
        srcWidth: Int,
        srcHeight: Int,
        rL: Int,
        gL: Int,
        bL: Int,
        rH: Int,
        gH: Int,
        bH: Int
    )

    fun drawImageRectCache(i: String?)
    fun drawImageEx(i: String?, x: Int, y: Int, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    fun drawLine(r: Int, g: Int, b: Int, x1: Int, y1: Int, x2: Int, y2: Int)
    fun drawLineEx(r: Int, g: Int, b: Int, width: Float, x1: Int, y1: Int, x2: Int, y2: Int)
    fun drawLinePenCache(x1: Int, y1: Int, x2: Int, y2: Int)
    fun drawLines(r: Int, g: Int, b: Int, points: String?)
    fun drawLinesEx(r: Int, g: Int, b: Int, width: Float, points: String?)
    fun drawLinesPenCache(points: String?)
    fun drawPolygon(r: Int, g: Int, b: Int, points: String?)
    fun drawPolygonEx(r: Int, g: Int, b: Int, width: Float, points: String?)
    fun drawPolygonPenCache(points: String?)
    fun drawRectangle(r: Int, g: Int, b: Int, x: Int, y: Int, width: Int, height: Int)
    fun drawRectangleEx(
        r: Int,
        g: Int,
        b: Int,
        widthP: Float,
        x: Int,
        y: Int,
        width: Int,
        height: Int
    )

    fun drawRectangleRectCache(r: Int, g: Int, b: Int)
    fun drawRectangleRectCacheEx(r: Int, g: Int, b: Int, width: Float)
    fun drawRectanglePenCache(x: Int, y: Int, width: Int, height: Int)
    fun drawRectanglePenRectCache()
    fun drawString(
        s: String?,
        f: String?,
        size: Float,
        style: Int,
        x: Float,
        y: Float,
        valign: Int,
        halign: Int,
        flags: Int
    )

    fun fillEllipse(x: Int, y: Int, width: Int, height: Int)
    fun fillPolygon(points: String?)
    fun fillRectangle(x: Int, y: Int, width: Int, height: Int)
    fun fillRegion()
    fun clear(red: Int, green: Int, blue: Int)
    fun setClip(x: Int, y: Int, width: Int, height: Int)
}