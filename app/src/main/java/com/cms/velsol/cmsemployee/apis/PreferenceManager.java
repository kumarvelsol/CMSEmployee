package com.cms.velsol.cmsemployee.apis;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ADMIN on 4/9/2018.
 */

public class PreferenceManager
{
    public static final String SHARED_PREF_NAME = "CableManagementSystem";
    public static final String FIREBASE_TOKEN="firebasetoken";
    private static PreferenceManager mInstance;
    private static Context mCtx;
    public PreferenceManager(Context context) {
        mCtx = context;
    }
    public static synchronized PreferenceManager getInstance(Context context)
    {
        if (mInstance == null)
        {
            mInstance = new PreferenceManager(context);
        }
        return mInstance;
    }

    public boolean saveFirebaseToken(String firebaseToken)
    {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FIREBASE_TOKEN, firebaseToken);
        editor.apply();
        return true;
    }
    public String getFirebaseToken()
    {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return  sharedPreferences.getString(FIREBASE_TOKEN, "");
    }

}
