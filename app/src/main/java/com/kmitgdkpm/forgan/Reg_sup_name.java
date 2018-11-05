package com.kmitgdkpm.forgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

public class Reg_sup_name extends AppCompatActivity {
    TextView hasRegSupName;
    Button btRegSupName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.LoginTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_sup_name);
        hasRegSupName = (TextView) findViewById(R.id.hasRegSupName);
        btRegSupName = (Button) findViewById(R.id.btRegSupName);

        hasRegSupName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogin = new Intent(Reg_sup_name.this,Login.class);
                startActivity(toLogin);
            }
        });
        btRegSupName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toRegSupEmail = new Intent(Reg_sup_name.this,Reg_sup_email.class);
                startActivity(toRegSupEmail);
            }
        });
    }
    public boolean onTouchEvent(MotionEvent event) {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.
                INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        return true;
    }
}
