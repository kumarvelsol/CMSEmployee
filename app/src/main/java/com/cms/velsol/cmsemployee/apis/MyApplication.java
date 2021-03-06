package com.cms.velsol.cmsemployee.apis;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Kumar on 3/12/2018.
 */

public class MyApplication extends Application
{
    // Gloabl declaration of variable to use in whole app
    public static boolean activityVisible; // Variable that will check the
    // current activity state
    public static boolean isActivityVisible() {
        return activityVisible; // return true or false
    }
    public static void activityResumed() {
        activityVisible = true;// this will set true when activity resumed
    }
    public static void activityPaused() {
        activityVisible = false;// this will set false when activity paused
    }
    public static boolean isNetworkAvailable(Context context)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        } else {
            return false;
        }
    }
}
