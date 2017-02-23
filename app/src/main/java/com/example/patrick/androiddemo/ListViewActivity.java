package com.example.patrick.androiddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.patrick.androiddemo.adapter.ListViewAdapter;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ArrayList<String> listresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listresult = new ArrayList<String>();
        createFakeResult();

        initialView();
    }

    private void createFakeResult() {

        listresult.add("AAAAAAAA");
        listresult.add("BBBBBBBB");
        listresult.add("CCCC");
        listresult.add("D");
        listresult.add("EEEEEEEEEEEE");
        listresult.add("F");
        listresult.add("GGGGG");
        listresult.add("H");
        listresult.add("I");
        listresult.add("J");
        listresult.add("K");
        listresult.add("L");
        listresult.add("M");
        listresult.add("N");
        listresult.add("O");
        listresult.add("P");
        listresult.add("Q");

    }


    private void initialView() {
        listView = (ListView) findViewById(R.id.list_view);
        View view = getLayoutInflater().inflate(R.layout.list_view_header,null);

        LinearLayout listViewHeader = (LinearLayout)view.findViewById(R.id.list_view_header);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,listresult);
        listView.addHeaderView(listViewHeader);

        TextView tv = new TextView (this);
        tv.setText("We have no more content");
        tv.setTextSize(28);
        tv.setGravity(Gravity.CENTER);
        listView.addFooterView(tv);

        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"listView was clicked at position:"+position,Toast.LENGTH_LONG).show();
        Log.d("testListViewActivity",String.valueOf(position));
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("message","ListView");
        setResult(RESULT_OK,intent);
        super.onBackPressed();
    }
}
