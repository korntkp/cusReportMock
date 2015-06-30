package com.zackoji.fault_reportmockup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Zackoji on 24/6/2558.
 */
public class Fragment_FaultRep extends Fragment {

    TextView username_TextV;
    Button logout_Butt;
    //String username = "test2";
    TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fault_report, container, false);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Month 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Month 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Month 3"));

        return rootView;
    }

/*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_fault_report);

        Intent intent = getIntent();
        String username = intent.getStringExtra("UsernameFault");
        username_TextV = (TextView) findViewById(R.id.fault_username);
        username_TextV.setText(username);
    }

    public void logout(View view) {
        Intent objIntentLogout = new Intent(Fragment_FaultRep.this, Login.class);
        startActivity(objIntentLogout);
        finish();
    }
    */
}
