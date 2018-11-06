package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reg_user_sso extends AppCompatActivity {
    Button btUserID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_user_sso);

        btUserID=(Button)findViewById(R.id.btUserID);
        btUserID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPassword = new Intent(Reg_user_sso.this,Reg_user_password.class);
                startActivity(toPassword);
            }
        });
    }
}
