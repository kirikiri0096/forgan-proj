package com.kmitgdkpm.forgan;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity  {
    private RadioButton usrDB, usrAuth, usrRegEmail, usrRegGoo, usrRegFace, sysEtc, usrPictureUpload, usrUpdateProf, usrGetProf, supGloLst, usrMakeOrder;
    private Button goBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void debugger (View view){
        Intent intent = new Intent(this, Usermain.class);
        startActivity(intent);
    }

}
