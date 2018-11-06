package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reg_user_password extends AppCompatActivity {

    Button userPassW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_user_password);

        userPassW = (Button) findViewById(R.id.btUserPass);
       userPassW.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent toProfile = new Intent(Reg_user_password.this,Reg_user_profile_pic.class);
               startActivity(toProfile);
           }
       });


    }
}
