package com.example.tablayout_bottomnavigation.Setting;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tablayout_bottomnavigation.fragment.HomeFragment;
import com.example.tablayout_bottomnavigation.fragment.ProfileFragment;
import com.example.tablayout_bottomnavigation.fragment.SettingFragment;

public class SettingViewPagerAdapter extends FragmentStatePagerAdapter {
    public SettingViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            case 2:
                return new Tab3Fragment();
            default:
                return new Tab1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "tab 1";
            case 1:
                return "tab 2";
            case 2:
                return "tab 3";
            default:
                return "tab 1";
        }
    }
}
