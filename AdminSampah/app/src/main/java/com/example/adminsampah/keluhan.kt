package com.example.adminsampah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adminsampah.ui.main.KeluhanFragment

class keluhan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keluhan_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, KeluhanFragment.newInstance())
                .commitNow()
        }
    }
}