package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reg_sup_pic extends AppCompatActivity {
    ImageView imageRegSup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.LoginTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_sup_pic);
        imageRegSup = (ImageView)findViewById(R.id.imageRegSup);

    }
}
