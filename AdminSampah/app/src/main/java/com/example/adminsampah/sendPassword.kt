package com.example.adminsampah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adminsampah.ui.main.SendPasswordFragment

class sendPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.send_password_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SendPasswordFragment.newInstance())
                .commitNow()
        }
    }
}