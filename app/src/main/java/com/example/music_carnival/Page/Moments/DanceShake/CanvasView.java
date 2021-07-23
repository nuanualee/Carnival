package com.example.music_carnival.Page.Moments.DanceShake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class CanvasView extends View {

    public int width,height;
    private Bitmap bitmap;
    private Canvas canvas;
    Context context;
    private Path mPath;
    private Paint paint;
    private float mX, mY;
    private static final float TOLERANCE = 5;


    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mPath = new Path();
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);


        paint.setStrokeWidth(100f);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        bitmap = Bitmap.createBitmap(w,h, Bitmap.Config.ARGB_8888);

        canvas = new Canvas(bitmap);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap,0,0,paint);
        canvas.drawPath(mPath, paint);
    }

    private void startTouch(float x, float y){
        mPath.moveTo(x,y);
        mX = x;
        mY = y;
    }

    private void moveTouch(float x, float y){
        float dx = Math.abs(x-mX);
        float dy = Math.abs(y-mY);
        if(dx >= TOLERANCE || dy >= TOLERANCE){
            mPath.quadTo(mX, mY, (x + mX) / 2, (y + mY) / 2);
            mX = x;
            mY = y;
        }
    }

    public void clearCanvas(){
        mPath.reset();
        invalidate();
    }

    private void upTouch(){
        mPath.lineTo(mX,mY);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                startTouch(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                moveTouch(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                upTouch();
                float r = calculatingPercentage(bitmap.getWidth(),bitmap.getHeight());
                if(calculatingPercentage(bitmap.getWidth(),bitmap.getHeight()) >= 50.00){
                    Toast.makeText(getContext(),"Done 50%",Toast.LENGTH_SHORT).show();
                }
                invalidate();
                break;

        }
        return true;
    }
//FUNCTION I WAS USING TO CALCULATE THE SCRATCHED AREA'S PERCENTAGE

    private float calculatingPercentage(int width,int height){
        int[] xArray = new int[100];
        int[] yArray = new int[100];

        float percentTransparent;
        Random r = new Random();
        for(int i = 0; i<100;i++){
            xArray[i] = r.nextInt(width - 10) +10;
        }
        for(int i = 0; i<100;i++){
            yArray[i] = r.nextInt(height - 10) +10;
        }
        int pixelCount = 0;
        for(int i = 0; i<100;i++){
            int x = xArray[i];
            int y = yArray[i];
            int color = Color.WHITE;
            int black = Color.BLACK;
            if(bitmap.getPixel(xArray[i],yArray[i]) == Color.WHITE){

                pixelCount++;


            }

        }

        percentTransparent = (pixelCount/100);
        return percentTransparent;

    }
}
