package tournaija.com.iykeowoh.tournaija.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.iykeowoh.tournaija.CategoryFragment;
import com.iykeowoh.tournaija.CitiesFragment;
import com.iykeowoh.tournaija.TopSpotsFragment;

/**
 * Created by iykeowoh on 4/29/15.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {

        super(fm);
    }
    @Override
    public Fragment getItem(int index) {
        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new TopSpotsFragment();
            case 1:
                // Games fragment activity
                return new CategoryFragment();
            case 2:
                // Movies fragment activity
                return new CitiesFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
