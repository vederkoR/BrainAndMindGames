package com.vederko.kotlinforandroidbta5.activities

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.vederko.kotlinforandroidbta5.R
import com.vederko.kotlinforandroidbta5.utilities.Constants
import com.vederko.kotlinforandroidbta5.utilities.PLAYER
import com.vederko.kotlinforandroidbta5.utilities.Player
import kotlinx.android.synthetic.main.activity_prize.*

class PrizeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prize)

        val ua = WebView(this).settings.userAgentString
        if ("Mobile" !in ua) {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }

        val playerLvlSelected = intent.getParcelableExtra<Player>(PLAYER)

         val level = when (playerLvlSelected?.levelChoise) {
            "Easy" -> "EASY"
            "Normal" -> "NORMAL"
            "Hard" -> "HARD"
            "Tricky" -> "TRICKY"
            "Impossible" -> "IMPOSSIBLE"
             else -> "SECRET"
         }

        finishText.text = "YOU HAVE FINISHED THE $level LEVEL!"

        backToHomePrizeBtn.setOnClickListener{
            val home = Intent(this, MainActivity::class.java)
            startActivity(home)
            finish()
        }


    }
    override fun onBackPressed() {
        val home = Intent(this, MainActivity::class.java)
        startActivity(home)
        finish()
    }
}