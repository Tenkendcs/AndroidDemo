package com.example.patrick.androiddemo;

import android.content.Intent;
import android.gesture.Gesture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.patrick.androiddemo.util.UtilLog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends baseActivity {// implements View.OnTouchListener {

    private ImageButton button1;
    private ImageButton button3;
    private ImageButton bt2;
    private Button timer;
    private Button animation;
    private Button animator;
    private Button quiz4Button;
    //  private GestureDetector mGestorDetector;


    @OnClick(R.id.Timer_Button)
    public void buttonTimerClick() {
        Intent intent = new Intent(this, TimerActivity.class);
        startActivityForResult(intent, 4);
        toActivity(TimerActivity.class);
    }

    @OnClick(R.id.animation_Button)
    public void animationClick() {
        Intent intent = new Intent(this, AnimationActivity.class);
        startActivityForResult(intent, 4);
        toActivity(AnimationActivity.class);
    }

    @OnClick(R.id.animatior_Button)
    public void animatorClick() {
        Intent intent = new Intent(this, AnimatorActivity.class);
        startActivityForResult(intent, 4);
        toActivity(AnimatorActivity.class);


    }

    @OnClick(R.id.button2)
    public void button2Click() {
        Intent intent = new Intent(this, DialogActivity.class);
        startActivityForResult(intent, 2);
        toActivity(DialogActivity.class);

    }

    @OnClick(R.id.bt2)
    public void buttonTopClick() {
        Intent intent = new Intent(this, ActivityA.class);
        startActivityForResult(intent, 4);
        toActivity(ActivityA.class);
    }


    @OnClick(R.id.quiz4_button)

    public void quizClick() {

        final CustomDialog dialog = new CustomDialog(this, new CustomDialog.ICustomDialogEventListener(){
            @Override
            public void onClickListener() {
                Intent intent = new Intent();
                intent.putExtra("Message", "Dialog");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        dialog.show();

    }





//    private View.OnClickListener btListener1(){
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_relative_layout);
        initialView();
        initialListener();
        ButterKnife.bind(this);
       // mGestorDetector = new GestureDetector(this,new simpleGestureListener());

    }

    private void initialView() {
        button1 = (ImageButton) findViewById(R.id.button1);
        button3 = (ImageButton) findViewById(R.id.button3);
    }


private void initialListener() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Button 1 was clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(),ViewPagerActivity.class);
                intent.putExtra("key","value");
                Bundle bundle = new Bundle();
                bundle.putInt("Integer", 12345);
                Book book = new Book();
                book.setName("Android");
                book.setAuthor("Pat");
                bundle.putSerializable("book", book);
                intent.putExtras(bundle);
                startActivity(intent);
                startActivityForResult(intent,1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastShort("Button 3 was clicked");
                Intent intent = new Intent(v.getContext(),ListViewActivity.class);
                startActivityForResult(intent,3);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        toastShort("onStart");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        switch (requestCode){
            case 1:
                String message = data.getStringExtra("message");
                toastShort("From ViewPager");
                break;
            case 2:
                toastLong("Dialog");
                break;
            case 3:
                toastShort("ListView");
                break;
            default:
        }
    }



    public void newMethod(View v){
//        Toast.makeText(v.getContext(), "Button 2 was clicked", Toast.LENGTH_LONG).show();
        toastLong("Button 2 was clicked");
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
//        Log.d("testD","Toast");
        UtilLog.LogD("testD", "Toast");

    }
//    @Override
//    public boolean onTouch(View v, MotionEvent) {
//        return mGestorDetector.onTouch(Event);
//    }

//    @Override
//    public boolean onTouch(View v, MotionEvent event) {
//        return false;
//    }

//    private class simpleGestureListener extends
//            GestureDetector.SimpleOnGestureListener{
//
//        public boolean onDown(MotionEvent e){
//
//            UtilLog.LogD("MyGesture", "onDown");
//            toastShort("onDown");
//            return false;
//        }
//    }
//
//    public void onShowPress(MotionEvent e){
//        UtilLog.LogD("MyGesture", "onShowPress");
//        toastShort("onShowPress");
//    }
//
//    public void onLongPress(MotionEvent e){
//        UtilLog.LogD("MyGesture", "OnLongPress");
//        toastShort("onLongPress");
//    }
//
//    public boolean onSingleTapUp(MotionEvent e){
//        UtilLog.LogD("MyGesture", "OnSingleTapUp");
//        toastShort("OnSingleTapUp");
//        return true;
//    }
//
//    public boolean onSingleTapConfirmed(MotionEvent e) {
//        UtilLog.LogD("MyGesture", "OnSingleTapConfirmed");
//        toastShort("OnSingleTapConfirmed");
//        return true;
//    }
//
//    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY){
//        UtilLog.LogD("MyGesture","onScroll:" + (e2.getY()) - e1.getY()) + "     " +distanceX;
//        toastShort("onScroll");
//        return true;
//    }
//
//    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
//        UtilLog.LogD("myGesture", "onFling");
//        toastShort("onFling");
//        return true;
//    }

//    public boolean onDoubleTapEvent(MotionEvent e){
//        UtilLog.LogD("MyGesture", onDoubleTapEvent());
//    }
        }
