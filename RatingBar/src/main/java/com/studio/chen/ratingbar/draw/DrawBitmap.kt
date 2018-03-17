package com.test.jasonchen.assemblydemo.draw

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

/**
 * Created by marti on 2018/3/14.
 */
class DrawBitmap(var selectBitmap: Bitmap, var unSelectBitmap: Bitmap) : DrawShape {

    override fun drawUnSelect(canvas: Canvas, rect: Rect, mPen: Paint) {
        canvas.drawBitmap(unSelectBitmap, rect.left.toFloat(), rect.top.toFloat(), Paint())
    }

    override fun drawSelect(canvas: Canvas, rect: Rect, mPen: Paint) {
        canvas.drawBitmap(selectBitmap, rect.left.toFloat(), rect.top.toFloat(), Paint())
    }

    override fun drawExtraSelect(canvas: Canvas, rect: Rect, extraWidth: Int, mPen: Paint) {

        val bmp = Bitmap.createBitmap(selectBitmap, 0, 0, extraWidth, selectBitmap.height, null, false)
        canvas.drawBitmap(bmp, rect.left.toFloat(), rect.top.toFloat(), Paint())
        bmp.recycle()
    }
}