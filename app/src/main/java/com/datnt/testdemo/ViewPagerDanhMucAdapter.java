package com.datnt.testdemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerDanhMucAdapter extends FragmentStatePagerAdapter {
    public ViewPagerDanhMucAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DanhMucFragment();
            case 1:
                return new MenuFragment();
            case 2:
                return new TatCaMonFragment();
            default:
                return new DanhMucFragment();
        }
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Danh mục";
                break;
            case 1:
                title = "Menu";
                break;
            case 2:
                title = "Tất cả món";
                break;
        }
        return title;
    }
}
