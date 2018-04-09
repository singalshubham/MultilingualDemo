package com.example.shubham.multilingualdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.shubham.multilingualdemo.utils.Utility;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        /*super.attachBaseContext(MultilingualContextWrapper.wrapLocale(newBase,
                new Locale("th","TH")));*/
        super.attachBaseContext(MultilingualContextWrapper.wrapLocale(newBase,
                Utility.getLanguage(newBase)));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.languageswitcher, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.english:
                SavedPreferences savedPreferences = new
                        SavedPreferences(MainActivity.this);
                savedPreferences.setCurrentLanguage(AppConstants.LANG_ENG);
                startActivity(new Intent(this, MainActivity.class));
                finish();
                break;
            // action with ID action_settings was selected
            case R.id.thai:
                SavedPreferences savedPreferences2 =
                        new SavedPreferences(this);
                savedPreferences2.setCurrentLanguage(AppConstants.LANG_THAI);
                startActivity(new Intent(this, MainActivity.class));
                finish();
                break;
        }

        return true;
    }


    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0,0);
    }


}
