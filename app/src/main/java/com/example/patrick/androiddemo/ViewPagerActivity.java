package com.example.patrick.androiddemo;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.patrick.androiddemo.Fragment.ConentFragment;
import com.example.patrick.androiddemo.Fragment.HistoryFragment;
import com.example.patrick.androiddemo.Fragment.LoginFragment;
import com.example.patrick.androiddemo.adapter.ViewPagerAdapter;
import com.example.patrick.androiddemo.util.UtilLog;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new  ArrayList<Fragment>();
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String message = intent.getStringExtra("key");
        int number = bundle.getInt("Integer",0);
        int fakenumber = bundle.getInt("fake",0);
        Book book = (Book) bundle.getSerializable("book");
        UtilLog.LogD("ViewPagerActivity, value is : ", message);
        UtilLog.LogD("ViewPagerActivity, number  is : ", ""+number);
        UtilLog.LogD("ViewPagerActivity, fake number is is : ", String.valueOf(fakenumber));
        UtilLog.LogD("ViewPagerActivity, book author is ",book.getAuthor());


        initial();
    }

    private void initial(){

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        fragmentList.add(new LoginFragment());
        fragmentList.add(new ConentFragment());
        fragmentList.add(new HistoryFragment());
        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);

//        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
//        tabLayout.setupWithViewPager(viewPager);

    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        intent.putExtra("Message", "ViewPager");
        setResult(RESULT_OK,intent);
        super.onBackPressed();
    }
}
