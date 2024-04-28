package com.example.mobilebrickbreaker

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Score:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.score_activity)

        // Set up the Toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        // Retrieve the score passed from the MainActivity
        val score = intent.getIntExtra("SCORE", 0)
        // Find the TextView in the layout and display the score
        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)

        scoreTextView.text = "Score: $score"
        scoreTextView.text = "High Score: ${SharedPreference.getHighScore()}"
    }

    // Handle back button click
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}