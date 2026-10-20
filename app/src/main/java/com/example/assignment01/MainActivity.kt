package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Locate the button in the XML layout
        val btnOpenSecond = findViewById<Button>(R.id.btnOpenSecond)

        // 2. Set click listener on the button
        btnOpenSecond.setOnClickListener {
            // 3. Create an Intent targeting SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            // 4. Start the activity
            startActivity(intent)
        }
    }
}
