package com.test.jasonchen.assemblydemo.draw

import android.graphics.Path
import android.graphics.Rect
import android.graphics.RectF

/**
 * Created by marti on 2018/3/14.
 */
/**
 * 五角星路径
 */
fun createStar(rect: Rect): Path {
    var xA = rect.left.toFloat()+((rect.right.toFloat() - rect.left)/2)
    var yA = rect.top.toFloat()
    var rFive = (rect.right.toFloat() - rect.left)

    var xB = 0f
    var xC = 0f
    var xD = 0f
    var xE = 0f
    var yB = 0f
    var yC = 0f
    var yD = 0f
    var yE = 0f
    xD = (xA - rFive * Math.sin(Math.toRadians(18.0))).toFloat()
    xC = (xA + rFive * Math.sin(Math.toRadians(18.0))).toFloat()
    yC = rect.bottom.toFloat()
    yD = yC
    yE = (yA + Math.sqrt(Math.pow((xC - xD).toDouble(), 2.0) - Math.pow((rFive / 2).toDouble(), 2.0))).toFloat()
    yB = yE
    xB = xA + rFive / 2
    xE = xA - rFive / 2
    var floats = floatArrayOf(xA, yA, xD, yD, xB, yB, xE, yE, xC, yC, xA, yA)
    var path = Path()

    (0 until floats.size - 1 step 2).forEach { i ->
        path.lineTo(floats[i], floats[i + 1])
    }
    return path
}

/**
 * 圆路径
 */
fun createCirlr(rect: Rect): Path {
    var path = Path()
    var x = (rect.right.toFloat() - rect.left) / 2 + rect.left
    var y = (rect.bottom.toFloat() - rect.top) / 2 + rect.top
    path.addCircle(x, y, (rect.right.toFloat() - rect.left) / 2, Path.Direction.CW)
    return path
}

/**
 * 矩形路径
 */
fun createRect(rect: Rect): Path {
    var path = Path()
    path.addRect(RectF(rect), Path.Direction.CW)
    return path
}

/**
 * 三角形路径
 */
fun createTrigon(rect: Rect): Path {
    var path = Path()
    var radius = (rect.right.toFloat() - rect.left) / 2
    path.moveTo(rect.left+radius, rect.top.toFloat())
    path.lineTo(rect.left.toFloat(), rect.bottom.toFloat())
    path.lineTo(rect.right.toFloat(), rect.bottom.toFloat())
    path.lineTo(rect.left+radius, rect.top.toFloat())
    return path
}

fun createHeart(rect:Rect):Path{
    var path = Path()
    var radiusX = ((rect.right.toFloat() - rect.left) /2)+rect.left
    var radiusY = ((rect.bottom.toFloat() - rect.top) /2)+rect.top
    var percentY = (rect.bottom.toFloat() - rect.top) /10

    path.addArc(rect.left.toFloat(), rect.top.toFloat()+percentY, radiusX, radiusY+percentY, -225f, 225f)
    path.arcTo(radiusX, rect.top.toFloat()+percentY, rect.right.toFloat(), radiusY+percentY, -180f, 225f, false)
    path.lineTo(radiusX, rect.bottom.toFloat() - percentY)

    return path
}