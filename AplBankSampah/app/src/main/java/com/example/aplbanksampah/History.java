package com.example.aplbanksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aplbanksampah.ui.history.HistoryFragment;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_fragment);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, HistoryFragment.newInstance())
                    .commitNow();
        }
    }
}