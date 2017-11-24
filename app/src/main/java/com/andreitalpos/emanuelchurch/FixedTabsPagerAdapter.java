/*
package com.andreitalpos.emanuelchurch;


import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class FixedTabsPagerAdapter extends FragmentPagerAdapter {


    public FixedTabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeActivity();
            case 1:
                return new LiveActivity();
            case 2:
                return new BibleActivity();
            case 3:
                return new ArchiveActivity();
            case 4:
                return new MoreActivity();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return getString(R.string.home_title);
            case 1:
                return Resources.getSystem().getString(R.string.live_title);
            case 2:
                return Resources.getSystem().getString(R.string.bible_title);
            case 3:
                return Resources.getSystem().getString(R.string.archive_title);
            case 4:
                return Resources.getSystem().getString(R.string.more_title);
            default:
                return null;
        }
    }
}
*/
