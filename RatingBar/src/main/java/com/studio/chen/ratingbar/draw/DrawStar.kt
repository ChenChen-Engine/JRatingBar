package com.test.jasonchen.assemblydemo.draw

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

/**
 * Created by marti on 2018/3/14.
 */
class DrawStar : DrawShape {
    override fun drawUnSelect(canvas: Canvas, rect: Rect, mPen: Paint) {
        canvas.drawPath(createStar(rect), mPen)
    }

    override fun drawSelect(canvas: Canvas, rect: Rect, mPen: Paint) {
        canvas.drawPath(createStar(rect), mPen)
    }

    override fun drawExtraSelect(canvas: Canvas, rect: Rect, extraWidth: Int, mPen: Paint) {
        canvas.save()
        canvas.clipRect(rect.left, rect.top, rect.left + extraWidth, rect.bottom)
        canvas.drawPath(createStar(rect), mPen)
        canvas.restore()
    }
}