package com.example.aplbanksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aplbanksampah.ui.layanan.LayananFragment;

public class Layanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layanan_fragment);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LayananFragment.newInstance())
                    .commitNow();
        }
    }
}