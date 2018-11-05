package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Reg_sup_email extends AppCompatActivity {
    TextView hasRegSupEmail;
    Button btRegSupEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.LoginTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_sup_email);
        hasRegSupEmail = (TextView) findViewById(R.id.hasRegSupEmail);
        btRegSupEmail = (Button) findViewById(R.id.btRegSupEmail);


        hasRegSupEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogin = new Intent(Reg_sup_email.this,Login.class);
                startActivity(toLogin);
            }
        });
        btRegSupEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toRegSupPhone = new Intent(Reg_sup_email.this,Reg_sup_phone.class);
                startActivity(toRegSupPhone);
            }
        });
    }
}
