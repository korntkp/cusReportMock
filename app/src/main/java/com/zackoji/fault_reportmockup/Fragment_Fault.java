package com.zackoji.fault_reportmockup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zackoji.fault_reportmockup.tab_fault.PageAdapter_Tab_Fault;

/**
 * Created by Zackoji on 24/6/2558.
 */
public class Fragment_Fault extends Fragment {

    TabLayout tabLayout;
    ViewPager pager_fault;
    PageAdapter_Tab_Fault adapter_tab_fault;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fault_report, container, false);

        pager_fault = (ViewPager)rootView.findViewById(R.id.pager_tab_fault);
        adapter_tab_fault = new PageAdapter_Tab_Fault(getChildFragmentManager());
        pager_fault.setAdapter(adapter_tab_fault);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tabLayout_fault);
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());

        tabLayout.setupWithViewPager(pager_fault);

        tabLayout.getTabAt(0).setText("Month 1");
        tabLayout.getTabAt(1).setText("Month 2");
        tabLayout.getTabAt(2).setText("Month 3");

        return rootView;
    }
}
