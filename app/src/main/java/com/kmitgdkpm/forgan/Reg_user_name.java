package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.time.Instant;

public class Reg_user_name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_user_name);

        Button ButtonNext = (Button) findViewById(R.id.btUserName);
                Intent showPage = new Intent (Reg_user_name.this,Reg_user_phone.class);
        startActivity(showPage);



    }
}
