package com.example.shubham.multilingualdemo;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void attachBaseContext(Context newBase) {
       /* super.attachBaseContext(MultilingualContextWrapper.wrapLocale(newBase,
                new Locale("th","TH")));*/
        super.attachBaseContext(MultilingualContextWrapper.wrapLocale(newBase, Locale.ENGLISH));
    }


}
