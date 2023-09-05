package com.example.testlibrary

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.TextView

@SuppressLint("AppCompatCustomView")
class ObliqueStrikeTextView : TextView {
    private var dividerColor = 0
    private var paint: Paint? = null

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(context)
    }

    private fun init(context: Context) {
        val resources = context.resources
        //replace with your color
        dividerColor = resources.getColor(R.color.black);
        paint = Paint()
        paint!!.color = dividerColor
        paint!!.strokeWidth = 4f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawLine(-30f, height.toFloat(), width.toFloat(), 10f, paint!!)
    }
}