package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        int centerX = getWidth() / 2;
        int centerH = getHeight() / 2 - 10;
        int radius = centerH;
        paint.setAntiAlias(true);

        int offsetR = 5;

        paint.setColor(Color.parseColor("#F44336"));
        canvas.drawArc(centerX - radius - offsetR, centerH - radius - offsetR, centerX + radius - offsetR, centerH + radius - offsetR, -180, 135, true, paint);
        paint.setColor(Color.parseColor("#FFC107"));
        canvas.drawArc(centerX - radius, centerH - radius, centerX + radius, centerH + radius, -45, 45, true, paint);
        paint.setColor(Color.parseColor("#9C27B0"));
        canvas.drawArc(centerX - radius, centerH - radius, centerX + radius, centerH + radius, 0, 7.2f, true, paint);
        paint.setColor(Color.parseColor("#9E9E9E"));
        canvas.drawArc(centerX - radius, centerH - radius, centerX + radius, centerH + radius, 7.2f, 7.2f, true, paint);
        paint.setColor(Color.parseColor("#009688"));
        canvas.drawArc(centerX - radius, centerH - radius, centerX + radius, centerH + radius, 14.4f, 70, true, paint);
        paint.setColor(Color.parseColor("#2196F3"));
        canvas.drawArc(centerX - radius, centerH - radius, centerX + radius, centerH + radius, 70, 110, true, paint);


    }
}
