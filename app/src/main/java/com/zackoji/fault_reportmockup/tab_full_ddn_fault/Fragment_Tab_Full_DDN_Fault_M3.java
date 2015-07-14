package com.zackoji.fault_reportmockup.tab_full_ddn_fault;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zackoji.fault_reportmockup.R;

/**
 * Created by Zackoji on 13/7/2558.
 */
public class Fragment_Tab_Full_DDN_Fault_M3 extends Fragment {

    View rootView;

    /**
     * Test Data
     * */
    String[] list_cirID = { "B03298B456", "B03299B654" };
    String[] list_region = { "R2", "R2" };
    String[] list_rcu = { "CWT-04", "CWT-04" };
    String[] list_location = { "asdf ", "fdsa" };
    String[] list_down = { "04/01/2015 09:38", "04/01/2015 09:38" };
    String[] list_up = { "04/01/2015 20:29", "04/01/2015 20:29" };
    String[] list_totaltime = { "10.51", "10.51" };
    String[] list_truetime = { "0.0", "0.0" };
    String[] list_cause = { "= =", "- -" };
    String[] list_notes = { "+", "+" };
    String[] list_groupcase = { "Customer", "Customer" };

    public static Fragment_Tab_Full_DDN_Fault_M3 newInstance() {
        Fragment_Tab_Full_DDN_Fault_M3 fragment = new Fragment_Tab_Full_DDN_Fault_M3();
        return fragment;
    }

    public Fragment_Tab_Full_DDN_Fault_M3() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_full_ddn_fault_m3, container, false);

        initAdapter();

        return rootView;
    }

    private void initAdapter() {
        ListViewAdapter_Full_DDN_Fault_M3 adapter = new ListViewAdapter_Full_DDN_Fault_M3(
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
        ListView listView = (ListView)rootView.findViewById(R.id.listView_full_ddn_fault_m3);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            }
        });
    }
}
