package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Reg_sup_phone extends AppCompatActivity {
    TextView hasRegSupPhone;
    Button btRegSupPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.LoginTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_sup_phone);
        hasRegSupPhone = (TextView) findViewById(R.id.hasRegSupPhone);
        btRegSupPhone = (Button) findViewById(R.id.btRegSupPhone);

        hasRegSupPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogin = new Intent(Reg_sup_phone.this,Login.class);
                startActivity(toLogin);
            }
        });
        btRegSupPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toRegSupPass = new Intent(Reg_sup_phone.this,Reg_sup_pass.class);
                startActivity(toRegSupPass);
            }
        });
    }
}
