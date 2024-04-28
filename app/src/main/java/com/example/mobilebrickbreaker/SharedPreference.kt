package com.example.mobilebrickbreaker

import android.content.Context
import android.content.SharedPreferences

object SharedPreference {
    private const val HIGH_SCORE_KEY = "high_score"
    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
    }

    fun getHighScore(): Int {
        return sharedPreferences.getInt(HIGH_SCORE_KEY, 0)
    }

    fun setHighScore(score: Int) {
        val editor = sharedPreferences.edit()
        editor.putInt(HIGH_SCORE_KEY, score)
        editor.apply()
    }
}
