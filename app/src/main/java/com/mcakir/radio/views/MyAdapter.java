package com.mcakir.radio.views;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mcakir.radio.fragments.EquipoFragment;
import com.mcakir.radio.fragments.HojaProgramacionFragment;
import com.mcakir.radio.fragments.ProgramasFragment;

public class MyAdapter extends FragmentPagerAdapter {

    private Fragment HojaProgramacionFragment;
    private Fragment EquipoFragment;
    private Fragment ProgramasFragment;

    public MyAdapter(FragmentManager fm) {
        super(fm);

    }
    public MyAdapter(Context context1, FragmentManager fm1, int totalTabs1) {
        this(fm1);
        FragmentManager fm = fm1;
        Context context = context1;
        int totalTabs = totalTabs1;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return HojaProgramacionFragment;
        }else  if(position == 1){
            return EquipoFragment;
        }else  if(position == 2){
            return ProgramasFragment;
        }else{
            return getItem(position);
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
