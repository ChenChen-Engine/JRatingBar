package com.test.jasonchen.assemblydemo.draw

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

/**
 * Created by marti on 2018/3/14.
 */
open  interface DrawShape {
     fun drawUnSelect(canvas: Canvas, rect: Rect, mPen: Paint)
     fun drawSelect(canvas: Canvas, rect: Rect, mPen: Paint)
     fun drawExtraSelect(canvas: Canvas, rect: Rect, extraWidth: Int, mPen: Paint)
}