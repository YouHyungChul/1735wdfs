package com.example.a1735wdfs.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class ContextUtil {

    private static final String prefName = "myPref";
    private static final String EMAIL = "EMAIL";
    private static final String ID_CHECK = "ID_CHECK";

    public static void setEmail(Context context, String email){

        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        pref.edit().putString(EMAIL, email).apply();

    }

    public static String getEmail(Context context) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        return pref.getString(EMAIL, "");
    }

    public static void setIdCheck(Context context, boolean isCheck) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        pref.edit().putBoolean(ID_CHECK, isCheck).apply();
    }
    public static boolean isIdCheck(Context context) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        return pref.getBoolean(ID_CHECK, true);
    }

}
