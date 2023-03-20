package com.example.f2c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class Rating : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)


        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val button = findViewById<Button>(R.id.submit3)
        val ratingScale = findViewById<TextView>(R.id.rateMessage)

        ratingBar.setOnRatingBarChangeListener{rBar,fl,b ->
            ratingScale.text = fl.toString()
            when(rBar.rating.toInt()){
                1 -> ratingScale.text = "Very Bad"
                2 -> ratingScale.text = "Bad"
                3 -> ratingScale.text = "Good"
                4 -> ratingScale.text = "Great"
                5 -> ratingScale.text = "Awesome"
                else -> ratingScale.text = " "
            }
        }

        var submission = findViewById<Button>(R.id.submit3)
        submission.setOnClickListener {
            var intent = Intent(this,DisplayReview::class.java)
            startActivity(intent)
        }
        var not_now = findViewById<Button>(R.id.not_now)
        not_now.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}