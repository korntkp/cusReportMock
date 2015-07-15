package com.zackoji.fault_reportmockup.tab_fault;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.zackoji.fault_reportmockup.Fragment_Full_DDN_Fault;
import com.zackoji.fault_reportmockup.Fragment_Full_MPLS_Fault;
import com.zackoji.fault_reportmockup.R;

/**
 * Created by Zackoji on 2/7/2558.
 */
public class Fragment_Tab_Fault_M1 extends Fragment {

    View rootView;
    LinearLayout linearLayout;
//     fragmentTransaction_full_DDN_Fault;

    public static Fragment_Tab_Fault_M1 newInstance() {
        Fragment_Tab_Fault_M1 fragment = new Fragment_Tab_Fault_M1();
        return fragment;
    }

    public Fragment_Tab_Fault_M1() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_fault_m1, container, false);

//        Button bn = (Button) rootView.findViewById(R.id.gogogo);
//        bn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "asdf", Toast.LENGTH_LONG).show();
//            }
//        });

//        linearLayout = (LinearLayout) rootView.findViewById(R.id.link_to_full_ddn_fault_m1);
//        linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                fragmentTransaction_full_DDN_Fault = getSupportFragmentManager().beginTransaction();
//                Fragment_Full_DDN_Fault fragment_full_ddn_fault = new Fragment_Full_DDN_Fault();
//                android.support.v4.app.FragmentTransaction fragmentTransaction_full_DDN_Fault = getFragmentManager().beginTransaction();
//                fragmentTransaction_full_DDN_Fault.replace(R.id.fragment_layout_main, fragment_full_ddn_fault);
//                fragmentTransaction_full_DDN_Fault.commit();
////                getSupportActionBar().setTitle("Full DDN Fault Report");
//                Log.i("lkjkj","uhgfyh");
//
//            }
//        });
//        Log.i("lkjkj","uhgfyh");

        return rootView;
    }
}
