package com.example.shubham.multilingualdemo.utils;

import android.content.Context;

import com.example.shubham.multilingualdemo.AppConstants;
import com.example.shubham.multilingualdemo.SavedPreferences;

import java.util.Locale;

/**
 * @author Ranosys Technologies
 */
public class Utility {
    public static Locale getLanguage(Context newBase) {
        SavedPreferences sp = new SavedPreferences(newBase);
        switch (sp.getCurrentLanguage()) {
            case AppConstants.LANG_ENG:
                return Locale.ENGLISH;
            case AppConstants.LANG_THAI:
                return new Locale("th", "TH");
            default:
                return new Locale(sp.getCurrentLanguage());
        }
    }


}
