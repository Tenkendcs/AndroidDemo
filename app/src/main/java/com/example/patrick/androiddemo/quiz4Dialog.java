package com.example.patrick.androiddemo;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.OnClick;

public class quiz4Dialog extends Dialog {

    private CustomDialog.ICustomDialogEventListener listener;



    public interface ICustomDialogEventListener{
        public void onClickListener();
    }
    public quiz4Dialog(@NonNull Context context, CustomDialog.ICustomDialogEventListener listener) {
        super(context, R.style.dialog);
        this.listener = listener;





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4_dialog);
    }
}
