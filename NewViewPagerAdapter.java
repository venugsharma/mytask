package info.devexchanges.navvp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class NewViewPagerAdapter extends FragmentPagerAdapter {

    public NewViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0) {
            return new FragA();
        } else if (position == 1) {
            return new FragB();
        } else return new Fragment3();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
