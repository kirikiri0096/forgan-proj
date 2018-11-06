package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reg_user_Email extends AppCompatActivity {
    Button btUserMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_user__email);

        btUserMail = (Button)findViewById(R.id.btUserMail);
        btUserMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSSo = new Intent( Reg_user_Email.this,Reg_user_sso.class);
                startActivity(toSSo);
            }
        });
    }
}
