package com.zackoji.fault_reportmockup;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(getApplicationContext(), "sdfghjkl;", Toast.LENGTH_LONG).show();
        Intent intent = getIntent();
        /*
        username = intent.getStringExtra("Username");
        username_TextV = (TextView) findViewById(R.id.username_act_main);
        username_TextV.setText(username_TextV.getText().toString() + username);
*/
        navigationView = (NavigationView) findViewById(R.id.navigation);

        /**
         * Set Fragment_Fault to fragment_layout
         * */
        Fragment_Fault fragment_fault = new Fragment_Fault();
        android.support.v4.app.FragmentTransaction fragmentTransaction_fault = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_fault.replace(R.id.fragment_layout,fragment_fault);
        fragmentTransaction_fault.commit();

        /**
         * Set Checked menuItem to Fault Report
         * */
        navigationView.getMenu().getItem(0).setChecked(true);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                //Toast.makeText(getApplicationContext(), menuItem.getItemId(), Toast.LENGTH_LONG).show();

                //Checking if the item is in checked state or not, if not make it in checked state
                if(menuItem.isChecked()) {
                    menuItem.setChecked(false);
                    //Toast.makeText(getApplicationContext(),"Set Checked -> False",Toast.LENGTH_SHORT).show();
                }
                else {
                    menuItem.setChecked(true);
                    //Toast.makeText(getApplicationContext(),"Set Checked -> True",Toast.LENGTH_SHORT).show();
                }

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()){
                    case R.id.navItem1_Fault_Re:
                        //Toast.makeText(getApplicationContext(),"Fault Report",Toast.LENGTH_SHORT).show();
                        Fragment_Fault fragment_fault = new Fragment_Fault();
                        android.support.v4.app.FragmentTransaction fragmentTransaction_fault = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_fault.replace(R.id.fragment_layout,fragment_fault);
                        fragmentTransaction_fault.commit();
                        return true;

                    case R.id.navItem2_Avai_Re:
                        //Toast.makeText(getApplicationContext(),"Availability Report",Toast.LENGTH_SHORT).show();
                        Fragment_Avail fragment_avail = new Fragment_Avail();
                        android.support.v4.app.FragmentTransaction fragmentTransaction_avail = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_avail.replace(R.id.fragment_layout,fragment_avail);
                        fragmentTransaction_avail.commit();
                        return true;

                    case R.id.navItem3_Pro:
                        //Toast.makeText(getApplicationContext(),"Profile",Toast.LENGTH_SHORT).show();
                        Fragment_Profile fragment_profile = new Fragment_Profile();
                        android.support.v4.app.FragmentTransaction fragmentTransaction_profile = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_profile.replace(R.id.fragment_layout, fragment_profile);
                        fragmentTransaction_profile.commit();
                        return true;

                    case R.id.navItem4_Log:
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
        initInstances();
        initToolbar();
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initInstances() {
        rootLayout = (CoordinatorLayout) findViewById(R.id.rootLayout);

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
    }

    public void logout(View view) {
        Intent objIntentLogout = new Intent(MainActivity.this, Login.class);
        startActivity(objIntentLogout);
        finish();
    }

    public void goFaultRep(View view) {
        //Toast.makeText(getApplicationContext(), "asdf;", Toast.LENGTH_LONG).show();
        Intent objIntent1 = new Intent(MainActivity.this, Fragment_Fault.class);

        //TextView usern_textv = (TextView) findViewById(R.id.username_act_main);
        //String usernameFault = usern_textv.getText().toString();
        //objIntent1.putExtra("UsernameFault", usernameFault);

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
