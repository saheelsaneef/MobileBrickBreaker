package com.example.mobilebrickbreaker



import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SharedPreference.init(this) // Initialize SharedPreference

        val scoreButton = findViewById<Button>(R.id.score)
        scoreButton.setOnClickListener {
            // Create an intent to navigate to the ScoreActivity
            val intent = Intent(this, Score::class.java)
            startActivity(intent)
        }

        val newgame = findViewById<Button>(R.id.newgame)
        newgame.setOnClickListener {
            val intent = Intent(this,Playable::class.java)
           startActivity(intent)
        }


    }


}