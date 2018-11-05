package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Reg_sup_pass extends AppCompatActivity {
    TextView hasRegSupPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.LoginTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_sup_pass);
        hasRegSupPass = (TextView) findViewById(R.id.hasRegSupPass);

        hasRegSupPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogin = new Intent(Reg_sup_pass.this,Login.class);
                startActivity(toLogin);
            }
        });
    }
}
