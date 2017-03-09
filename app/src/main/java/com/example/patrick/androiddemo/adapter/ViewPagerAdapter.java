package com.example.patrick.androiddemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;

/**
 * Created by patrick on 2/1/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragmentList;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setContent(ArrayList<Fragment> fragmentList){
        this.fragmentList = fragmentList;
    }

    @Override
    public CharSequence getPageTitle(int position) {


        switch (position){
            case 0:
                return "Center Crop";
            case 1:
                return "Center";
            case 2:
                return "Center Inside";
            case 3:
                return  "Fit Center";
            case 4:
                return  "Fit End";
            case 5:
                return  "Fit Start";
            case 6:
                return  "Fit XY";
            case 7:
                return  "Matrix";
            default:
                return fragmentList.get(position).getClass().getName();
        }


    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
