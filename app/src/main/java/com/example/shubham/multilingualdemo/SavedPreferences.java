package com.example.shubham.multilingualdemo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author Ranosys Technologies
 */
public class SavedPreferences {

    private static final int MODE_PRIVATE = 0;
    private final SharedPreferences preferences;

    public SavedPreferences(Context context) {
        String userPref = "multilingualdemo";
        preferences = context.getSharedPreferences(userPref, MODE_PRIVATE);
    }

    public String getCurrentLanguage() {
        return preferences.getString("language", "en");
    }

    public void setCurrentLanguage(String currentLanguage) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("language", currentLanguage);
        editor.apply();
    }

}
