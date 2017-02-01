package com.example.patrick.androiddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton bt1;
    private ImageButton button3;

//    private View.OnClickListener btListener1(){
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_relative_layout);
        initialView();


        bt1 = (ImageButton) findViewById(R.id.bt1);
        button3 = (ImageButton) findViewById(R.id.button3);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Button 1 was clicked", Toast.LENGTH_LONG).show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ListViewActivity.class);
                startActivity(intent);
            }
        });
    }
            private void initialView(){
                bt1 = (ImageButton) findViewById(R.id.bt1);
            }

    public void newMethod(View v){
        Toast.makeText(v.getContext(), "Button 2 was clicked", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }


        }
