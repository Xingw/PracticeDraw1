package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    Paint paint = new Paint();
    Path path = new Path();
    int marginTop = 30;
    Map<String, Integer> data = new LinkedHashMap<>();

    private void init() {
        data.put("Froyo", 2);
        data.put("GB", 5);
        data.put("IC S", 5);
        data.put("JB", 40);
        data.put("Kitkat", 80);
        data.put("L", 100);
        data.put("M", 50);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int space = 10;
        int rectWidth = 24;
        int centerX = getWidth() / 2;
        int centerH = getHeight() / 2;
        paint.setColor(Color.WHITE);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        //绘制直方图
        drawCoordinate(space, rectWidth, centerX, canvas);
        //绘制数据
        int cooW = (data.size() + 1) * space + data.size() * rectWidth;

        int cubicX = centerX - (cooW >> 1) + space;
        int cubicy = getHeight() - marginTop;
        paint.setStyle(Paint.Style.FILL);
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            Log.d("mapmap", "key:" + entry.getKey() + " value:" + entry.getValue());
            paint.setColor(Color.parseColor("#72B916"));
            canvas.drawRect(cubicX, cubicy - entry.getValue(), cubicX + rectWidth, cubicy, paint);
            paint.setColor(Color.WHITE);
            paint.setTextSize(8);
            canvas.drawText(entry.getKey(), cubicX, cubicy + 8, paint);
            cubicX += rectWidth + space;
        }
        //绘制文字
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        paint.setTextSize(12);
        canvas.drawText("直方图", centerX, getHeight(), paint);
    }

    private void drawCoordinate(int space, int rectWidth, int centerX, Canvas canvas) {
        paint.setStrokeWidth(1);
        //计算横向长度
        int cooW = (data.size() + 1) * space + data.size() * rectWidth;
        path.moveTo(centerX - (cooW >> 1), 0);
        path.rLineTo(0, getHeight() - marginTop);
        path.rLineTo(cooW, 0);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path, paint);
    }
}
