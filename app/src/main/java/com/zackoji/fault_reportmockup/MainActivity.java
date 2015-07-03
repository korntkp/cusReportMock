package com.zackoji.fault_reportmockup;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView username_TextV;
    String username = "test";

    CoordinatorLayout rootLayout;
    Toolbar toolbar;
    TabLayout tabLayout;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    LinearLayout fragment_LinearLayout;
    ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        /*
        username = intent.getStringExtra("Username");
        username_TextV = (TextView) findViewById(R.id.username_act_main);
        username_TextV.setText(username_TextV.getText().toString() + username);
*/
        initToolbar();
        initInstances();
        initFragment();

    }

    private void initFragment() {
        navigationView = (NavigationView) findViewById(R.id.navigation_main);

        /**
         * Set Fragment_Fault to fragment_layout
         * */
        Fragment_Fault fragment_fault = new Fragment_Fault();
        android.support.v4.app.FragmentTransaction fragmentTransaction_fault = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_fault.replace(R.id.fragment_layout_main,fragment_fault);
        fragmentTransaction_fault.commit();

        /**
         * Set Checked menuItem to Fault Report
         * */
        navigationView.getMenu().getItem(0).setChecked(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                //Checking if the item is in checked state or not, if not make it in checked state
                if(menuItem.isChecked()) {
                    menuItem.setChecked(false);
                }
                else {
                    menuItem.setChecked(true);
                }

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()){
                    case R.id.navItem1_Fault_Rep:
                        //Toast.makeText(getApplicationContext(),"Fault Report",Toast.LENGTH_SHORT).show();
                        Fragment_Fault fragment_fault = new Fragment_Fault();
                        android.support.v4.app.FragmentTransaction fragmentTransaction_fault = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_fault.replace(R.id.fragment_layout_main,fragment_fault);
                        fragmentTransaction_fault.commit();
                        getSupportActionBar().setTitle("Fault Report");
                        return true;

                    case R.id.navItem2_Avail_Rep:
                        //Toast.makeText(getApplicationContext(),"Availability Report",Toast.LENGTH_SHORT).show();
                        Fragment_Avail fragment_avail = new Fragment_Avail();
                        android.support.v4.app.FragmentTransaction fragmentTransaction_avail = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_avail.replace(R.id.fragment_layout_main,fragment_avail);
                        fragmentTransaction_avail.commit();
                        getSupportActionBar().setTitle("Availability Report");
                        return true;

                    case R.id.navItem3_Profile:
                        //Toast.makeText(getApplicationContext(),"Profile",Toast.LENGTH_SHORT).show();
                        Fragment_Profile fragment_profile = new Fragment_Profile();
                        android.support.v4.app.FragmentTransaction fragmentTransaction_profile = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_profile.replace(R.id.fragment_layout_main, fragment_profile);
                        fragmentTransaction_profile.commit();
                        getSupportActionBar().setTitle("Profile");
                        return true;

                    case R.id.navItem4_Logout:
                        //Toast.makeText(getApplicationContext(),"Logout",Toast.LENGTH_SHORT).show();
                        Intent objIntentLogout = new Intent(MainActivity.this, Login.class);
                        startActivity(objIntentLogout);
                        finish();
                        return true;

                    default:
                        Toast.makeText(getApplicationContext(),"Somethings Wrong",Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
    }

    private void initInstances() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_main);
        drawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, R.string.hello_world, R.string.hello_world);
        drawerLayout.setDrawerListener(drawerToggle);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Fault Report");

        rootLayout = (CoordinatorLayout) findViewById(R.id.rootLayout_main);
    }

    /**
     * Hamburger Button
     * */
    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
//        Toast.makeText(getApplicationContext(), "onPostCreate", Toast.LENGTH_SHORT).show();
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
//        Toast.makeText(getApplicationContext(), "onConfigurationChanged", Toast.LENGTH_SHORT).show();
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /**
         * Fix Hamburger icon clickable
         * */
        if (drawerToggle.onOptionsItemSelected(item))
            return true;

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

    public void goFaultRep(View view) {
        Intent objIntent1 = new Intent(MainActivity.this, Fragment_Fault.class);
        //TextView usern_textv = (TextView) findViewById(R.id.username_act_main);
        //String usernameFault = usern_textv.getText().toString();
        //objIntent1.putExtra("UsernameFault", usernameFault);
        startActivity(objIntent1);
    }
}
