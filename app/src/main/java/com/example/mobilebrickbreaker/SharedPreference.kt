import android.content.Context

object SharedPreference {
    private const val PREF_NAME = "MyPrefs"
    private const val HIGH_SCORE_KEY = "high_score"

    fun setHighScore(context: Context, score: Int) {
        val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putInt(HIGH_SCORE_KEY, score)
        editor.apply()
    }

    fun getHighScore(context: Context): Int {
        val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getInt(HIGH_SCORE_KEY, 0)
    }
}
