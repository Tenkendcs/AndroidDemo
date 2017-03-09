package com.example.patrick.androiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends baseActivity {
    private Animation alphaAnimation;
    private Animation scaleAnimation;
    private Animation rotateAnimation;
    private Animation setAnimation;
    private Animation transAnimation;



    @BindView(R.id.anim_tv)
    TextView tv;

    @OnClick(R.id.alpha_bt)
    public void alpha(){
        tv.startAnimation(alphaAnimation);


    }

    @OnClick(R.id.trans_bt)
    public void trans(){
        tv.startAnimation(transAnimation);

    }

    @OnClick(R.id.set_bt)
    public void set(){
        tv.startAnimation(setAnimation);

    }

    @OnClick(R.id.scale_bt)
    public void scale(){
        tv.startAnimation(scaleAnimation);

    }

    @OnClick(R.id.rotate_bt)
    public void rotate(){
        tv.startAnimation(rotateAnimation);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
        initialAnimation();
    }

    private void initialAnimation() {
        alphaAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        scaleAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        setAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_set);
        transAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_trans);


    }
}
