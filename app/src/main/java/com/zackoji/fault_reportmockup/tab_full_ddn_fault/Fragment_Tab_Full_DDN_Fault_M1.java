package com.zackoji.fault_reportmockup.tab_full_ddn_fault;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.zackoji.fault_reportmockup.R;
import com.zackoji.fault_reportmockup.model.Full_DDN_Fault_Report_Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zackoji on 13/7/2558.
 */
public class Fragment_Tab_Full_DDN_Fault_M1 extends Fragment {

    View rootView;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    /**
     * Test Data
     * */
//    String[] list_cirID = { "B03298B", "B03299B" };
//    String[] list_region = { "R2", "R2" };
//    String[] list_rcu = { "CWT-04", "CWT-04" };
//    String[] list_location = { "อาคารเทเลคอมทาวเวอรร : ศรนยรคอมพรวเตอรร แจตงววฒนะ ", "อาคารเทเลคอมทาวเวอรร : ศรนยรคอมพรวเตอรร แจตงววฒนะ" };
//    String[] list_down = { "04/01/2015 09:38", "04/01/2015 09:38" };
//    String[] list_up = { "04/01/2015 20:29", "04/01/2015 20:29" };
//    String[] list_totaltime = { "10.51", "10.51" };
//    String[] list_truetime = { "0.0", "0.0" };
//    String[] list_cause = { "-", "-" };
//    String[] list_notes = { "-", "-" };
//    String[] list_groupcase = { "Customer", "Customer" };

    public static Fragment_Tab_Full_DDN_Fault_M1 newInstance() {
        Fragment_Tab_Full_DDN_Fault_M1 fragment = new Fragment_Tab_Full_DDN_Fault_M1();
        return fragment;
    }

    public Fragment_Tab_Full_DDN_Fault_M1() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_full_ddn_fault_m1, container, false);

        /**
         * Bind View
         * */
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_full_ddn_fault_m1);

        /**
         *
         * */
        mRecyclerView.setHasFixedSize(true);

//        mRecyclerView.setScr

        /**
         * Set LinearLayoutManager
         * */
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        /**
         * Create & Set RecyclerView Adapter
         * */
        mAdapter = new RecyclerView_Adapter_DDN_M1(getActivity(), initData());
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);

//        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_full_ddn_fault_m1);
//        recyclerView.addOnItemTouchListener(
//                new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(View view, int position) {
//                        Toast.makeText(getActivity(), "asdf", Toast.LENGTH_SHORT).show();;
//                    }
//                })
//        );



        return rootView;
    }

    private List<Full_DDN_Fault_Report_Model> initData() {

        int n = 1000;
        Full_DDN_Fault_Report_Model[] datas = new Full_DDN_Fault_Report_Model[n];

        for (int i = 0; i < n; i++){
            datas[i] = new Full_DDN_Fault_Report_Model(i+"");
        }


        List<Full_DDN_Fault_Report_Model> dateset = new ArrayList<>();
        for (int i = 0; i < n; i++){
            dateset.add(datas[i]);
        }

        return dateset;
    }


}
