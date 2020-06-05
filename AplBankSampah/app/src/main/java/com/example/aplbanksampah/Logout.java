package com.example.aplbanksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aplbanksampah.ui.logout.LogoutFragment;

public class Logout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logout_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LogoutFragment.newInstance())
                    .commitNow();
        }
    }
}