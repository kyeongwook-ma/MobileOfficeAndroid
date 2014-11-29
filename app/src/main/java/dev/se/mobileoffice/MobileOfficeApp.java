package dev.se.mobileoffice;

import android.app.Application;
import android.content.Context;

/**
 * Created by Dev on 2014-11-29.
 */
public class MobileOfficeApp extends Application {

    private static Context context;

    public MobileOfficeApp() {
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
