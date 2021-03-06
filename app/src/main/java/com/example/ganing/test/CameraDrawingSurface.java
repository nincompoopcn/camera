package com.example.ganing.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;


/**
 * Created by ganing on 2018/1/3.
 */

public class CameraDrawingSurface extends View {

    private void Draw(Canvas canvas)
    {
        //canvas.drawColor(Color.TRANSPARENT, android.graphics.PorterDuff.Mode.CLEAR);
        canvas.drawColor(Color.TRANSPARENT);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(3);
        int RectLeft = 1;
        int RectTop = 200 ;
        int RectRight = RectLeft+ 500;
        int RectBottom =RectTop+ 200;
        Rect rec=new Rect((int) RectLeft,(int)RectTop,(int)RectRight,(int)RectBottom);
        canvas.drawRect(rec,paint);

    }


    public CameraDrawingSurface(Context context)
    {
        super(context);

    }

    public CameraDrawingSurface(Context context,AttributeSet attrs)
    {
        super(context,attrs);

    }

    public CameraDrawingSurface(Context context,AttributeSet attrs, int defStyle)
    {
        super(context,attrs,defStyle);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Draw(canvas);
    }
}
