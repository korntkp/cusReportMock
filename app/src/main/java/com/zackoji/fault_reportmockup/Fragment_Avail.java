package com.zackoji.fault_reportmockup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zackoji.fault_reportmockup.tab_avail.PageAdapter_Tab_Avail;

/**
 * Created by Zackoji on 30/6/2558.
 */
public class Fragment_Avail extends Fragment {

    TabLayout tabLayout_avail;
    ViewPager pager_avail;
    PageAdapter_Tab_Avail adapter_tab_avail;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_avail_report, container, false);

        pager_avail = (ViewPager)rootView.findViewById(R.id.pager_tab_avail);
        adapter_tab_avail = new PageAdapter_Tab_Avail(getChildFragmentManager());
        pager_avail.setAdapter(adapter_tab_avail);

        tabLayout_avail = (TabLayout) rootView.findViewById(R.id.tabLayout_avail);
        tabLayout_avail.addTab(tabLayout_avail.newTab());
        tabLayout_avail.addTab(tabLayout_avail.newTab());
        tabLayout_avail.addTab(tabLayout_avail.newTab());

        tabLayout_avail.setupWithViewPager(pager_avail);

        tabLayout_avail.getTabAt(0).setText("Month 1");
        tabLayout_avail.getTabAt(1).setText("Month 2");
        tabLayout_avail.getTabAt(2).setText("Month 3");

        return rootView;
    }
}
