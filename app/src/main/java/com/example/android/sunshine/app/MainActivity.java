package com.example.android.sunshine.app;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            ForcecastFragment newFragment = new ForcecastFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(R.id.activity_main_framelayout, newFragment).commit();

        PreferenceManager.setDefaultValues(this, R.xml.pref_general, false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings){
        Intent goToSettings = new Intent(this, SettingsActivity.class);
        startActivity(goToSettings);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}




