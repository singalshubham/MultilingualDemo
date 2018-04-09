package com.example.shubham.multilingualdemo;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.DisplayMetrics;

import java.util.Locale;

/**
 * Context wrapper class for Language change
 *
 * @author Ranosys Technologies
 */

public class MultilingualContextWrapper extends ContextWrapper {
    public MultilingualContextWrapper(Context base) {
        super(base);
    }

    //Creates a Context with updated Configuration.
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    private static Context wrapConfiguration(@NonNull final Context context,
                                             @NonNull final Configuration config) {
        return context.createConfigurationContext(config);
    }

    // Creates a Context with updated Locale.
    public static Context wrapLocale(@NonNull final Context context,
                                     @NonNull final Locale locale) {
        final Resources res = context.getResources();
        final Configuration config = res.getConfiguration();
        DisplayMetrics displayMetrics = res.getDisplayMetrics();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            config.setLocale(locale);
        } else {
            config.locale = locale;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            return wrapConfiguration(context, config);
        } else {
            res.updateConfiguration(config, displayMetrics);
            return context;
        }

    }

    @SuppressWarnings("deprecation")
    private void setLocale(Locale locale) {
        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();


    }
}