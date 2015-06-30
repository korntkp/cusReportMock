package com.zackoji.fault_reportmockup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Zackoji on 24/6/2558.
 */
public class Fragment_FaultRep extends AppCompatActivity {

    TextView username_TextV;
    Button logout_Butt;
    //String username = "test2";

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
}
