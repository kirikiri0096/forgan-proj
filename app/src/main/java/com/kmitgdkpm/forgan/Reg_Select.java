package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Reg_Select extends AppCompatActivity {
    TextView hasSelect;
    Button selectSup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.LoginTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_select);
        hasSelect = (TextView) findViewById(R.id.hasSelect);
        selectSup = (Button) findViewById(R.id.selectSup);

        hasSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogin = new Intent(Reg_Select.this,Login.class);
                startActivity(toLogin);
            }
        });

        selectSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toRegSupName = new Intent(Reg_Select.this,Reg_sup_name.class);
                startActivity(toRegSupName);
            }
        });

    }
}
