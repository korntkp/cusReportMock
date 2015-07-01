package com.zackoji.fault_reportmockup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zackoji on 30/6/2558.
 */
public class Fragment_Avail extends Fragment {

    TabLayout tabLayout_avai;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_availa, container, false);

        tabLayout_avai = (TabLayout) rootView.findViewById(R.id.tabLayout_avail);
        tabLayout_avai.addTab(tabLayout_avai.newTab().setText("Month 1"));
        tabLayout_avai.addTab(tabLayout_avai.newTab().setText("Month 2"));
        tabLayout_avai.addTab(tabLayout_avai.newTab().setText("Month 3"));

        return rootView;
    }
}
