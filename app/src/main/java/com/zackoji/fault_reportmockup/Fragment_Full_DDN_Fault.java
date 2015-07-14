package com.zackoji.fault_reportmockup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zackoji.fault_reportmockup.tab_full_ddn_fault.PageAdapter_Tab_Full_DDN_Fault;

import java.util.GregorianCalendar;

/**
 * Created by Zackoji on 13/7/2558.
 */
public class Fragment_Full_DDN_Fault extends Fragment {
    public static TabLayout tabLayout;
    ViewPager pager_full_ddn_fault;
    PageAdapter_Tab_Full_DDN_Fault adapter_tab_full_ddn_fault;
    View rootView;
    GregorianCalendar cal;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_full_ddn_fault_report, container, false);
        initiateTab();
        return rootView;
    }

    private void initiateTab() {
        pager_full_ddn_fault = (ViewPager)rootView.findViewById(R.id.pager_tab_full_ddn_fault);
        adapter_tab_full_ddn_fault = new PageAdapter_Tab_Full_DDN_Fault(getChildFragmentManager());
        pager_full_ddn_fault.setAdapter(adapter_tab_full_ddn_fault);
//        my = new MonthYear();
        tabLayout = (TabLayout) rootView.findViewById(R.id.tabLayout_full_ddn_fault);
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.getTabAt(0).setText("1");
        tabLayout.getTabAt(1).setText("2");
        tabLayout.getTabAt(2).setText("3");
        tabLayout.setupWithViewPager(pager_full_ddn_fault);

        /**
         * Dynamic Month Tab's name
         * */
//        cal = (GregorianCalendar) GregorianCalendar.getInstance();
//        my.setMonth(cal.get(cal.MONTH) + 1);
//        my.setYear(String.valueOf(cal.get(cal.YEAR)));
//        tabLayout.getTabAt(0).setText(my.getMonth() + "/" + my.getYear());
//
//        cal.add((GregorianCalendar.MONTH), -1);
//        my.setMonth(cal.get(cal.MONTH) + 1);
//        my.setYear(String.valueOf(cal.get(cal.YEAR)));
//        tabLayout.getTabAt(1).setText(my.getMonth() + "/" + my.getYear());
//
//        cal.add((GregorianCalendar.MONTH), -1);
//        my.setMonth(cal.get(cal.MONTH) + 1);
//        my.setYear(String.valueOf(cal.get(cal.YEAR)));
//        tabLayout.getTabAt(2).setText(my.getMonth() + "/" + my.getYear());
    }
}
