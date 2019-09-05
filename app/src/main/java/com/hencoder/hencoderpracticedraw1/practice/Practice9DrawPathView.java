package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    Path path = new Path();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        int movX = 95;
//        练习内容：使用 canvas.drawPath() 方法画心形
        path.addArc(370, 0, 465, 95, -225, 225);
        path.lineTo(getWidth() >> 1, 170);
        path.addArc(370 + movX, 0, 465 + movX, 95, -180, 225);
        path.lineTo(getWidth() >> 1, 170);
//        path.addArc(0, 0, 95, 80, 225, -225, false);
        canvas.drawPath(path, paint);
    }
}
