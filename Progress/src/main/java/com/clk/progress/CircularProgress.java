package com.clk.progress;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by CLK Apps 17.08.2020
 */

public class CircularProgress extends View {

    private static final String TAG = "clk_CircularProgress";

    private Activity activity;
    private Canvas canvas;
    private Paint paintBody, paintFirst, paintSecond, paintTransparent;
    private int  bodyColor = getContext().getResources().getColor(R.color.white);
    private int  firstColor = getContext().getResources().getColor(R.color.blue);
    private int secondColor = getContext().getResources().getColor(R.color.green);
    private int thirdColor = getContext().getResources().getColor(R.color.pink);
    private int fourthColor = getContext().getResources().getColor(R.color.orange);
    private int rotation_speeed=15;

    public CircularProgress(Activity activity) {
        super(activity);
        this.activity = activity;
        init(null);
    }

    public void setColor(int firstColor, int secondColor, int thirdColor, int fourthColor){
        this.firstColor = firstColor;
        this.secondColor  = secondColor;
        this.thirdColor = thirdColor;
        this.fourthColor  =fourthColor;
    }

    public void setBodyColor(int bodyColor){
        this.bodyColor = bodyColor;
    }

    public void setRotationSpeeed(int speed){
        this.rotation_speeed = speed;
    }


    private void init(@Nullable AttributeSet set) {

        bodyColor = getContext().getResources().getColor(R.color.white);
        firstColor = getContext().getResources().getColor(R.color.blue);
        secondColor = getContext().getResources().getColor(R.color.green);
        fourthColor = getContext().getResources().getColor(R.color.orange);
        thirdColor = getContext().getResources().getColor(R.color.pink);

        paintBody = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintBody.setColor(bodyColor);
        paintTransparent = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintTransparent.setColor(getContext().getResources().getColor(R.color.transparent));

        paintFirst = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintFirst.setColor(firstColor);

        paintSecond = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintSecond.setColor(secondColor);

        swapColor();
    }


    private int sweepAngle = 120;
    int startBlueAngle = 60;
    int startGreenAngle = 240;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.canvas = canvas;
        canvas.drawColor(Color.TRANSPARENT);

        RectF oval = new RectF();

        int width = getWidth();
        int height = getHeight();

        int center_x = width / 2;
        int center_y = height / 2;

        int left = width / 10;
        int top = height / 10;

        int right = width - left;
        int bottom = height - top;

        int radius = width / 2 - (left+left/2);

        oval.set(left, top, right, bottom);


        canvas.drawArc(oval, startBlueAngle, sweepAngle, true, paintFirst);
        canvas.drawArc(oval, startGreenAngle, sweepAngle, true, paintSecond);

        canvas.drawCircle(center_x, center_y, radius, paintBody);

    }

    int fast=10;
    int turn=0;
    int color=0;
    private void swapColor() {

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                startBlueAngle += fast;
                startGreenAngle +=fast;

                if (startBlueAngle > 359) {
                    startBlueAngle=0;
                    turn++;
                    color++;
                    if(turn>2){
                        turn=0;
                    }
                }else if(startBlueAngle>150 && turn<1){
                    fast=3;
                }else if(startBlueAngle<270){
                    fast=rotation_speeed;
                }

                if(startGreenAngle>359){
                    startGreenAngle=0;
                }

                paintBody.setColor(bodyColor);
                if(color==0){
                    paintFirst.setColor(firstColor);
                    paintSecond.setColor(secondColor);
                }else if(color==2){
                    paintFirst.setColor(firstColor);
                    paintSecond.setColor(fourthColor);
                }else if(color==4){
                    paintFirst.setColor(secondColor);
                    paintSecond.setColor(fourthColor);
                }else if(color==6){
                    paintFirst.setColor(thirdColor);
                    paintSecond.setColor(firstColor);
                }else if(color==8){
                    color=-1;
                }

                postInvalidate();
            }
        }, 5l, 10l);
    }

    public CircularProgress(Context activity, @Nullable AttributeSet attrs) {
        super(activity, attrs);
        init(attrs);
    }

    public CircularProgress(Context activity, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(activity, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CircularProgress(Context activity, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(activity, attrs, defStyleAttr, defStyleRes);
    }

}


