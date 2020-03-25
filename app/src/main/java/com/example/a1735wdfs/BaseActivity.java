package com.example.a1735wdfs;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    Context mContext;
    public abstract void setupEvents();
    public abstract void setValues();
}
