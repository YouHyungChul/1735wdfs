package com.example.a1735wdfs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.example.a1735wdfs.databinding.ActivityMainBinding;
import com.example.a1735wdfs.utils.ContextUtil;

public class MainActivity extends BaseActivity {
    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {
        binding.idCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ContextUtil.setIdCheck(mContext, isChecked);
            }
        });


        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.idCheckBox.isChecked()){
                    String inputEmail = binding.emailEdt.getText().toString();
                    ContextUtil.setEmail(mContext, inputEmail);

                }else{
                    ContextUtil.setEmail(mContext, "");
                }
            }
        });

    }

    @Override
    public void setValues() {
        binding.emailEdt.setText(ContextUtil.getEmail(mContext));
        binding.idCheckBox.setChecked(ContextUtil.isIdCheck(mContext));

    }
}
