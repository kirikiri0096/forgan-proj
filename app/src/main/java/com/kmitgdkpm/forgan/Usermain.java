package com.kmitgdkpm.forgan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Usermain extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usermain);

        setSupportActionBar((Toolbar) findViewById(R.id.my_toolbar));

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);


        getSupportFragmentManager().beginTransaction().replace(R.id.user_fragment, new Home_user()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment sel_frag = null;

            switch (item.getItemId()) {
                case R.id.item_home:
                    sel_frag = new Home_user();
                    break;
                case R.id.item_add:
                    sel_frag = new Order_user();
                    break;
                case R.id.item_history:
                    sel_frag = new History_user();
                    break;
                case R.id.item_about:
                    sel_frag = new About_user();
                    break;
            }
            getSupportFragmentManager().beginTransaction().setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out)
                    .replace(R.id.user_fragment, sel_frag).commit();
            return true;
        }
    };
}
