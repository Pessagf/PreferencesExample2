package com.example.user.preferencesexample2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setPreferences(View v){
        Intent intent= new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
    public void getPreferences(View v){

        SharedPreferences prefs = getSharedPreferences("my_prefs",MODE_PRIVATE);
        String email = prefs.getString("email", "");
        String gender = prefs.getString("gender", "");
        boolean soundEnabled = prefs.getBoolean("sound",false);

        Toast.makeText(this,"Email: " + email + "\nGender: " +gender+ "\nSound Enabled: "+soundEnabled,Toast.LENGTH_SHORT).show();
    }
}
