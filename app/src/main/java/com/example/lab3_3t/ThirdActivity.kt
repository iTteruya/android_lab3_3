package com.example.lab3_3t

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ThirdActivity: AppCompatActivity() {
    private lateinit var toFirstButton: Button
    private lateinit var toSecondButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        toFirstButton = findViewById(R.id.bnToFirst)
        toFirstButton.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        toSecondButton = findViewById(R.id.bnToSecond)
        toSecondButton.setOnClickListener {
            finish()
        }

        val aboutMenu = findViewById<BottomNavigationView>(R.id.nav_view)
        aboutMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.aboutActivity -> {
                    startActivity(Intent(this, AboutActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP))
                }
            }
            true
        }
    }
}