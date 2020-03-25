package com.example.a1735wdfs.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class ContextUtil {

    private static final String prefName = "myPref";
    private static final String EMAIL = "EMAIL";

    public static void setEmail(Context context, String email){

        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        pref.edit().putString(EMAIL, email).apply();

    }

    public static String getEmail(Context context){
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        return pref.getString(EMAIL, "");
    }
}
