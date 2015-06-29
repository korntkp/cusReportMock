package com.zackoji.fault_reportmockup;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Zackoji on 18/6/2558.
 */
public class Login extends AppCompatActivity {

    String username;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }


    public void chkLogin(View view) {
        Intent objIntent = new Intent(Login.this, MainActivity.class);

        EditText usern_edittext = (EditText) findViewById(R.id.usern_edittext);
        username = usern_edittext.getText().toString();
        objIntent.putExtra("Username", username);

        startActivity(objIntent);
        finish();
    }
}
