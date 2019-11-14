package com.alekseyb.testgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by Алексей Бычков on 28.01.2018.
 */

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {

        // Кисть для графика                    Кисть для осевой линии
        Paint paint1 = new Paint();             Paint paint2 = new Paint();
        paint1.setColor(Color.BLUE);            paint2.setColor(Color.BLACK);
        paint1.setStrokeWidth(4);               paint2.setStrokeWidth(2);
        paint1.setStyle(Paint.Style.FILL);      paint2.setStyle(Paint.Style.FILL);
        paint1.setAntiAlias(true);              paint2.setAntiAlias(false);
        // Рисуем график функции
        double x, y;
        for (int i = 1; i <= canvas.getWidth(); i+=2) {
            x = 2 * Math.PI * (i - 1) / (canvas.getWidth());
            y = Math.sin(4*x) * Math.cos(2*x);
            int yint = canvas.getHeight() - (int) (canvas.getHeight() / 2 * (0.75*y + 1));
            canvas.drawPoint(i,yint,paint1);
            canvas.drawPoint(i,canvas.getHeight()/2,paint2);
        }
/*
        // это часть из примера на сайте
        // http://developer.alexanderklimov.ru/android/catshop/android.graphics.canvas.php
        float width = 400f;
        float height = 240f;
        float radius = 100f;

        Path path = new Path();
        path.addCircle(width, height, radius, Path.Direction.CW);
        Paint paint = new Paint();
        paint.setColor(Color.WHITE); // установим белый цвет
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL); // заливаем
        paint.setAntiAlias(true);

        float center_x, center_y;
        center_x = 240;
        center_y = 220;

        final RectF oval = new RectF();
        oval.set(center_x - radius, center_y - radius, center_x + radius,
                center_y + radius);
        canvas.drawArc(oval, 45, 270, true, paint); // рисуем пакмана

// рисуем большого пакмана без заливки
        paint.setStyle(Paint.Style.STROKE);
        oval.set(center_x - 200f, center_y - 200f, center_x + 200f,
                center_y + 200f);
        canvas.drawArc(oval, 45, 270, true, paint);

        paint.setStyle(Paint.Style.STROKE);

// рисуем разорванное кольцо
        center_y = 540;
        oval.set(center_x - radius,
                center_y - radius,
                center_x + radius,
                center_y + radius);
        canvas.drawArc(oval, 135, 270, false, paint);
*/
    }
}