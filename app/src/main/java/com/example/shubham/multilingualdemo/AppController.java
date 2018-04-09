package com.example.shubham.multilingualdemo;

import android.app.Application;

/**
 * @author Ranosys Technologies
 */
public class AppController extends Application {

    private static AppController appController;

    @Override
    public void onCreate() {
        super.onCreate();
        appController=this;
    }

    public static AppController getApp() {
        return appController;
    }
}
