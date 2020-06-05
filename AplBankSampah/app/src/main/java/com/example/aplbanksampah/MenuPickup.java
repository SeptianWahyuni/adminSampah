package com.example.aplbanksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aplbanksampah.ui.menupickup.MenuPickupFragment;

public class MenuPickup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MenuPickupFragment.newInstance())
                    .commitNow();
        }
    }
}