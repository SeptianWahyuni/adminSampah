package com.example.adminsampah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adminsampah.ui.main.PrintRekeningFragment

class printRekening : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.print_rekening_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PrintRekeningFragment.newInstance())
                .commitNow()
        }
    }
}