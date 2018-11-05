package com.kmitgdkpm.forgan;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

public class Usermain extends AppCompatActivity {

    //Component Variable
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

    //Fragments

    Home_user homeFR;
    Order_user orderFR;
    History_user hisFR;
    About_user aboutFR;
    MenuItem prevMenuItem;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usermain);

        //INITIALIZING...
        //Toolbar
        setSupportActionBar((Toolbar) findViewById(R.id.my_toolbar));

        //Middle Content
        viewPager = (ViewPager) findViewById(R.id.user_View);

        //BottomNav
        bottomNavigationView = findViewById(R.id.bottom_navigation);


        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.item_home:
                                viewPager.setCurrentItem(0);
                                break;
                            case R.id.item_add:
                                viewPager.setCurrentItem(1);
                                break;
                            case R.id.item_history:
                                viewPager.setCurrentItem(2);
                                break;
                            case R.id.item_about:
                                viewPager.setCurrentItem(3);
                                break;
                        }
                        return false;
                    }
                });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else
                {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                Log.d("page", "onPageSelected: "+position);
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

       /*  //Disable ViewPager Swipe
       viewPager.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                return true;
            }
        });
        */

        setupViewPager(viewPager);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        homeFR = new Home_user();
        orderFR = new Order_user();
        hisFR = new History_user();
        aboutFR = new About_user();
        adapter.addFragment(homeFR);
        adapter.addFragment(orderFR);
        adapter.addFragment(hisFR);
        adapter.addFragment(aboutFR);
        viewPager.setAdapter(adapter);
    }
}