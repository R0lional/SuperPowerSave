package com.ckt.lional.superpowersave;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by lional on 17-6-16.
 */

public abstract class SingleFragment extends Fragment {

    public void addFragment(FragmentManager fm, FragmentTransaction ft, int res) {
        Fragment fragment = fm.findFragmentById(res);
        if (fragment == null) {
            fragment = this;
            ft.add(res, fragment);
        }
    }
}
