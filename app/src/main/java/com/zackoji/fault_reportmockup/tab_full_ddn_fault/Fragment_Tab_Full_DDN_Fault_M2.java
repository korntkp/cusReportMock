package com.zackoji.fault_reportmockup.tab_full_ddn_fault;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zackoji.fault_reportmockup.R;
import com.zackoji.fault_reportmockup.model.Full_DDN_Fault_Report_Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zackoji on 13/7/2558.
 */
public class Fragment_Tab_Full_DDN_Fault_M2 extends Fragment{

    View rootView;
    ListView listView;
    /**
     * Test Data
     * */
    int n = 1000;
    String[] list_cirID = new String[n];
    String[] list_region = new String[n];
    String[] list_rcu  = new String[n];
    String[] list_location = new String[n];
    String[] list_down = new String[n];
    String[] list_up = new String[n];
    String[] list_totaltime = new String[n];
    String[] list_truetime = new String[n];
    String[] list_cause = new String[n];
    String[] list_notes = new String[n];
    String[] list_groupcase = new String[n];

    public static Fragment_Tab_Full_DDN_Fault_M2 newInstance() {
        Fragment_Tab_Full_DDN_Fault_M2 fragment = new Fragment_Tab_Full_DDN_Fault_M2();
        return fragment;
    }

    public Fragment_Tab_Full_DDN_Fault_M2() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_full_ddn_fault_m2, container, false);
        initData();
        initAdapter();

        return rootView;
    }

    private void initData() {
        for (int i = 0; i < n; i++){
            list_cirID[i] = "B03298B123"+i;
            list_region[i] = "list_region"+i;
            list_rcu[i] = "list_rcu"+i;
            list_down[i] = "list_down"+i;
            list_up[i] = "list_up"+i;
            list_totaltime[i] = "list_totaltime"+i;
            list_truetime[i] = "list_truetime"+n;
            list_cause[i] = "list_cause"+n;
            list_notes[i] = "list_notes"+n;
            list_groupcase[i] = "list_groupcase"+n;
        }
    }

    private void initAdapter() {
        ListViewAdapter_Full_DDN_Fault_M2 adapter = new ListViewAdapter_Full_DDN_Fault_M2(
                getActivity().getApplicationContext(),
                list_cirID,
                list_region,
                list_rcu,
                list_location,
                list_down,
                list_up,
                list_totaltime,
                list_truetime,
                list_cause,
                list_notes,
                list_groupcase);

        listView = (ListView)rootView.findViewById(R.id.listView_full_ddn_fault_m2);

//        fastScroll();
/**
 * Fast Scroll
 * */
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            private static final int DELAY = 400;
            private AbsListView view;
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                if (scrollState != SCROLL_STATE_IDLE) {
                    view.setFastScrollAlwaysVisible(true);
                    handler.removeCallbacks(runnable);
                }
                else {
                    this.view = view;
                    handler.postDelayed(runnable, DELAY);
                }
            }
            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            }
            private Handler handler = new Handler();
            private Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    view.setFastScrollAlwaysVisible(false);
                    view = null;
                }
            };
        });

        /**
         * Set Adapter
         * */
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            }
        });
    }

    private void fastScroll() {
        /**
         * Fast Scroll
         * */
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            private static final int DELAY = 400;
            private AbsListView view;
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                if (scrollState != SCROLL_STATE_IDLE) {
                    view.setFastScrollAlwaysVisible(true);
                    handler.removeCallbacks(runnable);
                }
                else {
                    this.view = view;
                    handler.postDelayed(runnable, DELAY);
                }
            }
            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            }
            private Handler handler = new Handler();
            private Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    view.setFastScrollAlwaysVisible(false);
                    view = null;
                }
            };
        });
    }
}
