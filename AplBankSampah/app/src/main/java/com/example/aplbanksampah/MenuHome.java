package com.example.aplbanksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aplbanksampah.ui.main.MenuHomeFragment;

public class MenuHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_home_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MenuHomeFragment.newInstance())
                    .commitNow();
        }
    }
}