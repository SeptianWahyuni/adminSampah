package com.example.adminsampah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adminsampah.ui.main.LogoutFragment

class Logout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logout_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LogoutFragment.newInstance())
                .commitNow()
        }
    }
}