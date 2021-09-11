package com.vederko.logicPuzzlesAndGames.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.vederko.logicPuzzlesAndGames.R
import com.vederko.logicPuzzlesAndGames.utilities.PLAYER
import com.vederko.logicPuzzlesAndGames.utilities.Player
import kotlinx.android.synthetic.main.activity_prize.*
import kotlinx.android.synthetic.main.activity_task_list.*

class PrizeActivity : AppCompatActivity() {
    @SuppressLint("SourceLockedOrientationActivity", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prize)

        val ua = WebView(this).settings.userAgentString
        if ("Mobile" !in ua) {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }

        val playerLvlSelected = intent.getParcelableExtra<Player>(PLAYER)

         val level = when (playerLvlSelected?.levelChoice) {
            "Easy" -> "EASY"
            "Normal" -> "NORMAL"
            "Hard" -> "HARD"
            "Tricky" -> "TRICKY"
            "Impossible" -> "IMPOSSIBLE"
             else -> "SECRET"
         }
        setLang(playerLvlSelected!!)

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

    @SuppressLint("SetTextI18n")
    private fun setLang(myplayer:Player){
        if (myplayer.lang =="RU"){
            congrText.text = "ПОЗДРАВЛЯЕМ!"
            val level = when (myplayer.levelChoice) {
                "Easy" -> "ЛЕГКИЙ"
                "Normal" -> "НОРМАЛЬНЫЙ"
                "Hard" -> "ТЯЖЕЛЫЙ"
                "Tricky" -> "С ПОДВОХОМ"
                "Impossible" -> "НЕВОЗМОЖНЫЙ"
                else -> "SECRET"
            }
            backToHomeListBtn.text = "Вернуться на главную"
            finishText.text = "ВЫ ВЫПОЛНИЛИ ВСЕ ЗАДАНИЯ УРОВНЯ \"$level\"!"
        }
    }
}