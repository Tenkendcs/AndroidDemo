package com.example.patrick.androiddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.patrick.androiddemo.util.UtilLog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends baseActivity {

    private ImageButton button1;
    private ImageButton button3;
    private ImageButton bt2;

    @OnClick(R.id.button2)
    public void button2Click(){
    Intent intent = new Intent(this, DialogActivity.class);
        startActivityForResult(intent,2);
        toActivity(DialogActivity.class);

    }

    @OnClick(R.id.bt2)
    public void buttonTopClick(){
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivityForResult(intent,3);
        toActivity(ListView2.class);
    }



//    private View.OnClickListener btListener1(){
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_relative_layout);
        initialView();
        ButterKnife.bind(this);


        button1 = (ImageButton) findViewById(R.id.button1);
        button3 = (ImageButton) findViewById(R.id.button3);


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
                toActivity(ListViewActivity.class);
            }
        });
    }
            private void initialView(){
                button1 = (ImageButton) findViewById(R.id.button1);
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



        }
