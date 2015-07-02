package com.zackoji.fault_reportmockup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zackoji on 2/7/2558.
 */
public class Fragment_Tab_Fault_M1 extends Fragment {

    public static Fragment_Tab_Fault_M1 newInstance() {
        Fragment_Tab_Fault_M1 fragment = new Fragment_Tab_Fault_M1();
        return fragment;
    }

    public Fragment_Tab_Fault_M1() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fault_m1, container, false);
        return rootView;
    }
}
