package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Reg_sup_email extends AppCompatActivity {
    TextView hasRegSupEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_sup_email);
        hasRegSupEmail = (TextView) findViewById(R.id.hasRegSupEmail);

        hasRegSupEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogin = new Intent(Reg_sup_email.this,Login.class);
                startActivity(toLogin);
            }
        });
    }
}
