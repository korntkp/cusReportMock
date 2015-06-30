package com.zackoji.fault_reportmockup;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {

    TextView username_TextV;
    String username = "test";
    CoordinatorLayout rootLayout;
    Toolbar toolbar;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(getApplicationContext(), "sdfghjkl;", Toast.LENGTH_LONG).show();
        Intent intent = getIntent();
        username = intent.getStringExtra("Username");
        username_TextV = (TextView) findViewById(R.id.username_act_main);
        username_TextV.setText(username_TextV.getText().toString() + username);

        initInstances();
    }

    private void initInstances() {
        rootLayout = (CoordinatorLayout) findViewById(R.id.rootLayout);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Info"));
        tabLayout.addTab(tabLayout.newTab().setText("Month 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Month 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Month 3"));
    }

    public void logout(View view) {
        Intent objIntentLogout = new Intent(MainActivity.this, Login.class);
        startActivity(objIntentLogout);
        finish();
    }

    public void goFaultRep(View view) {
        //Toast.makeText(getApplicationContext(), "asdf;", Toast.LENGTH_LONG).show();
        Intent objIntent1 = new Intent(MainActivity.this, FaultRepActivity.class);

        TextView usern_textv = (TextView) findViewById(R.id.username_act_main);
        String usernameFault = usern_textv.getText().toString();
        objIntent1.putExtra("UsernameFault", usernameFault);

        startActivity(objIntent1);
        //finish(); // It will EXIT from application
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
