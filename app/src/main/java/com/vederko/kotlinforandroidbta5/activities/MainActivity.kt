package com.vederko.kotlinforandroidbta5.activities

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.vederko.kotlinforandroidbta5.R
import com.vederko.kotlinforandroidbta5.utilities.PLAYER
import com.vederko.kotlinforandroidbta5.utilities.Player
import com.vederko.kotlinforandroidbta5.utilities.SharedPreference
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.menu_layout.*


class MainActivity : LifecycleActivity() {
    var playerLvlSelected = Player("")




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferenceMenu= SharedPreference(this@MainActivity)

        var musicSet = sharedPreferenceMenu.getValueInt("music")
        var soundSet = sharedPreferenceMenu.getValueInt("sound")
        menuQuBtn.setOnClickListener {
            onMenuClicked(musicSet, soundSet)

        }


    }

    fun taskActivity(view: View) {
        if (playerLvlSelected.levelChoise != "") {
            val firstTaskIntent = Intent(this, QuestionI::class.java)
            firstTaskIntent.putExtra(PLAYER, playerLvlSelected)
            startActivity(firstTaskIntent)
        } else {
            val intent = Intent(this, TaskListActivity::class.java)
            startActivity(intent)
            finish()
//            Toast.makeText(this, "Please, select a difficulty level", Toast.LENGTH_LONG).
//                    show()
        }

    }

    fun mainActivityEasyBtn (view:View){

        normalLevelBtn.isChecked = false
        hardLevelBtn.isChecked = false
        trickyLevelBtn.isChecked = false
        impBtn.isChecked = false

        if (easyLevelBtn.isChecked == false) playerLvlSelected.levelChoise = ""
        else playerLvlSelected.levelChoise = "Easy"
    }

    fun mainActivityNormalBtn (view:View){
        easyLevelBtn.isChecked = false
        hardLevelBtn.isChecked = false
        trickyLevelBtn.isChecked = false
        impBtn.isChecked = false

        if (normalLevelBtn.isChecked == false) playerLvlSelected.levelChoise = ""
        else playerLvlSelected.levelChoise = "Normal"
    }

    fun mainActivityHardBtn (view:View){
        normalLevelBtn.isChecked = false
        easyLevelBtn.isChecked = false
        trickyLevelBtn.isChecked = false
        impBtn.isChecked = false

        if (hardLevelBtn.isChecked == false) playerLvlSelected.levelChoise = ""
        else playerLvlSelected.levelChoise = "Hard"
    }

    fun mainActivityTrickyBtn (view:View){
        normalLevelBtn.isChecked = false
        hardLevelBtn.isChecked = false
        easyLevelBtn.isChecked = false
        impBtn.isChecked = false

        if (trickyLevelBtn.isChecked == false) playerLvlSelected.levelChoise = ""
        else playerLvlSelected.levelChoise = "Tricky"
    }

    fun mainActivityimpBtn (view:View){

        normalLevelBtn.isChecked = false
        hardLevelBtn.isChecked = false
        trickyLevelBtn.isChecked = false
        easyLevelBtn.isChecked = false

        if (impBtn.isChecked == false) playerLvlSelected.levelChoise = ""
        else playerLvlSelected.levelChoise = "Impossible"
    }

    private fun onMenuClicked(musics: Int, sounds: Int) {
        var music = musics
        var sound = sounds
        val sharedPreferenceMenu= SharedPreference(this@MainActivity)
        val menuDialogMain = Dialog(this)
        menuDialogMain.setContentView(R.layout.menu_layout)
        menuDialogMain.window
            ?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
        menuDialogMain.show()
        if (music == -1) {
            menuDialogMain.musicView.setImageResource(R.drawable.musicplus)
        } else menuDialogMain.musicView.setImageResource(R.drawable.musicminus)

        if (sound == -1) {
            menuDialogMain.soundView.setImageResource(R.drawable.soundplus)
        } else menuDialogMain.soundView.setImageResource(R.drawable.soundminus)

        menuDialogMain.musicView.setOnClickListener {
            if (music == -1) {
                music = -2
                menuDialogMain.musicView.setImageResource(R.drawable.musicminus)

            } else if (music == -2) {
                music = -1
                menuDialogMain.musicView.setImageResource(R.drawable.musicplus)
            }
            sharedPreferenceMenu.save("music", music)
        }

        menuDialogMain.soundView.setOnClickListener {
            if (sound == -1) {
                sound = -2
                menuDialogMain.soundView.setImageResource(R.drawable.soundminus)
            } else if (sound == -2) {
                sound = -1
                menuDialogMain.soundView.setImageResource(R.drawable.soundplus)
            }
            sharedPreferenceMenu.save("sound", sound)
        }

        menuDialogMain.homeView.setOnClickListener {
            val home = Intent(this, MainActivity::class.java)
            ContextCompat.startActivity(this, home, null)
            menuDialogMain.dismiss()
        }

        menuDialogMain.OkBtn.setOnClickListener {
            menuDialogMain.dismiss()
        }

    }

}




