package com.example.f2c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)


        var submission = findViewById<Button>(R.id.submit2)
        submission.setOnClickListener {
            var intent = Intent(this,Rating::class.java)
            startActivity(intent)
        }
        var btnCancel = findViewById<Button>(R.id.cancel2)
        btnCancel.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }


}