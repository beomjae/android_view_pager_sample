package com.jejunet.viewpagersample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
public class ImageSlidePagerAdapter extends FragmentPagerAdapter {

    public ImageSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return DetailFragment.newInstance("title1", "desc1");
            case 1:
                return DetailFragment.newInstance("title2", "desc2");
            case 2:
                return DetailFragment.newInstance("title3", "desc3");
            default:
                return DetailFragment.newInstance("title", "desc");
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
