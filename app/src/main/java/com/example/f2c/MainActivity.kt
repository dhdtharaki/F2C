package com.example.f2c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var addReview = findViewById<Button>(R.id.add)
        addReview.setOnClickListener {
            var intent = Intent(this, Rating::class.java)
            startActivity(intent)

        }
    }
}