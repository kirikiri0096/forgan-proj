package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

public class Reg_user_phone extends AppCompatActivity {
    Button btUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_user_phone);

        btUserName = (Button) findViewById(R.id.btUserName);
        btUserName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toEmail = new Intent( Reg_user_phone.this,Reg_user_Email.class);
                startActivity(toEmail);
            }
        });


    }
}
