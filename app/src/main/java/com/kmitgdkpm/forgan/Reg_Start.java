package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Reg_Start extends AppCompatActivity {
    TextView hasStart;
    Button btStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.LoginTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_start);
        hasStart = (TextView) findViewById(R.id.hasStart);
        btStart = (Button) findViewById(R.id.btStart);

        hasStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLogin = new Intent(Reg_Start.this,Login.class);
                startActivity(toLogin);
            }
        });
        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSelect = new Intent(Reg_Start.this,Reg_Select.class);
                startActivity(toSelect);
            }
        });
    }
}
