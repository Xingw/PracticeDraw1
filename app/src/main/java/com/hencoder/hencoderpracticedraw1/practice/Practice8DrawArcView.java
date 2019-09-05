package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int moveH = 70;
        int moveW = 120;
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        canvas.drawArc(width - moveW, height - moveH, width + moveW, height + moveH, -110, 100, true, paint);
        canvas.drawArc(width - moveW, height - moveH, width + moveW, height + moveH, 20, 140, false, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(width - moveW, height - moveH, width + moveW, height + moveH, 180, 60, false, paint);
    }
}
