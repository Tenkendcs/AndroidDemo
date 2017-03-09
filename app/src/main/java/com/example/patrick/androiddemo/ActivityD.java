package com.example.patrick.androiddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.OnClick;

public class ActivityD extends baseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    @OnClick(R.id.ActivityAButton)
    public void buttonAClick() {
        Intent intent = new Intent(this, ActivityA.class);
        startActivityForResult(intent, 4);
        toActivity(ActivityA.class);

    }

    @OnClick(R.id.ActivityBButton)
    public void buttonBClick() {
        Intent intent = new Intent(this, AcitivityB.class);
        startActivityForResult(intent, 4);
        toActivity(AcitivityB.class);

    }

    @OnClick(R.id.ActivityCButton)
    public void buttonCClick() {
        Intent intent = new Intent(this, ActivityC.class);
        startActivityForResult(intent, 4);
        toActivity(ActivityC.class);

    }

    @OnClick(R.id.ActivityDButton)
    public void buttonDClick() {
        Intent intent = new Intent(this, ActivityD.class);
        startActivityForResult(intent, 4);
        toActivity(ActivityD.class);

    }




}
