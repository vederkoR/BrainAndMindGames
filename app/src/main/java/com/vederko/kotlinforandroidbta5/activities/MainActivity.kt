package com.vederko.kotlinforandroidbta5.activities

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.vederko.kotlinforandroidbta5.R
import com.vederko.kotlinforandroidbta5.utilities.PLAYER
import com.vederko.kotlinforandroidbta5.utilities.Player
import com.vederko.kotlinforandroidbta5.utilities.SharedPreference
import kotlinx.android.synthetic.main.about_layout.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.low_lives_layout.*
import kotlinx.android.synthetic.main.menu_layout.*
import kotlinx.android.synthetic.main.menu_layout.OkBtn
import kotlinx.android.synthetic.main.menu_layout.homeView
import java.lang.Exception


class MainActivity : LifecycleActivity() {
    private var myplayer = Player("")
    var soundTag: Int? = null
    var choiceSound: MediaPlayer? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ua = WebView(this).settings.userAgentString
        if ("Mobile" !in ua) {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }


        val sharedPreferenceMenu= SharedPreference(this@MainActivity)
        soundTag = sharedPreferenceMenu.getValueInt("sound")

        menuQuBtn.setOnClickListener {
            onMenuClicked(sharedPreferenceMenu.getValueInt("music"),
                sharedPreferenceMenu.getValueInt("sound"))
        }


    }

    fun taskActivity(view:View) {
        if (myplayer.levelChoise != "") {
            val firstTaskIntent = Intent(this, TaskListActivity::class.java)
            firstTaskIntent.putExtra(PLAYER, myplayer)
            startActivity(firstTaskIntent)
        } else {

            if (soundTag == -1) {
                try {
                    if (choiceSound != null) choiceSound!!.release()
                    choiceSound = MediaPlayer.create(applicationContext, R.raw.error)
                    choiceSound!!.isLooping = false
                    choiceSound!!.start()
                } catch (e: Exception) {
                }
            }

            Toast.makeText(this,
                "Please, select a difficulty level...", Toast.LENGTH_LONG).
                    show()
        }

    }

    fun mainActivityEasyBtn (view:View){

        if (soundTag == -1) {
            try {
                if (choiceSound != null) choiceSound!!.release()
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception) {
            }
        }

        normalLevelBtn.isChecked = false
        hardLevelBtn.isChecked = false
        trickyLevelBtn.isChecked = false
        impBtn.isChecked = false

        if (!easyLevelBtn.isChecked) myplayer.levelChoise = ""
        else myplayer.levelChoise = "Easy"
    }

    fun mainActivityNormalBtn (view:View){

        if (soundTag == -1) {
            try {
                if (choiceSound != null) choiceSound!!.release()
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception) {
            }
        }

        easyLevelBtn.isChecked = false
        hardLevelBtn.isChecked = false
        trickyLevelBtn.isChecked = false
        impBtn.isChecked = false

        if (!normalLevelBtn.isChecked) myplayer.levelChoise = ""
        else myplayer.levelChoise = "Normal"
    }

    fun mainActivityHardBtn (view:View){


        if (soundTag == -1) {
            try {
                if (choiceSound != null) choiceSound!!.release()
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception) {
            }
        }


        normalLevelBtn.isChecked = false
        easyLevelBtn.isChecked = false
        trickyLevelBtn.isChecked = false
        impBtn.isChecked = false

        if (!hardLevelBtn.isChecked) myplayer.levelChoise = ""
        else myplayer.levelChoise = "Hard"
    }

    fun mainActivityTrickyBtn (view:View){

        if (soundTag == -1) {
            try {
                if (choiceSound != null) choiceSound!!.release()
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception) {
            }
        }


        normalLevelBtn.isChecked = false
        hardLevelBtn.isChecked = false
        easyLevelBtn.isChecked = false
        impBtn.isChecked = false

        if (!trickyLevelBtn.isChecked) myplayer.levelChoise = ""
        else myplayer.levelChoise = "Tricky"
    }

    fun mainActivityimpBtn (view:View){

        if (soundTag == -1) {
            try {
                if (choiceSound != null) choiceSound!!.release()
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception) {
            }
        }


        normalLevelBtn.isChecked = false
        hardLevelBtn.isChecked = false
        trickyLevelBtn.isChecked = false
        easyLevelBtn.isChecked = false

        if (!impBtn.isChecked) myplayer.levelChoise = ""
        else myplayer.levelChoise = "Impossible"
    }

    private fun onMenuClicked(musics: Int, sounds: Int) {
        var music = musics
        var sound = sounds
        val sharedPreferenceMenu = SharedPreference(this@MainActivity)
        val menuDialogMain = Dialog(this)
        menuDialogMain.setContentView(R.layout.menu_layout)
        menuDialogMain.window
            ?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
        menuDialogMain.show()
        menuDialogMain.setCanceledOnTouchOutside(false)
        menuDialogMain.setCancelable(false)
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
                soundTag = -2
            } else if (sound == -2) {
                sound = -1
                menuDialogMain.soundView.setImageResource(R.drawable.soundplus)
                soundTag = -1
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

        menuDialogMain.aboutView.setOnClickListener {
            menuDialogMain.dismiss()
            val aboutDialog = Dialog(this)
            aboutDialog.setContentView(R.layout.about_layout)
            aboutDialog.window
                ?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
            aboutDialog.show()
            aboutDialog.aboutTextView.text =
                getString(R.string.about)
            aboutDialog.setCanceledOnTouchOutside(false)
            aboutDialog.setCancelable(false)
            aboutDialog.OkBtnAbout.setOnClickListener {
                aboutDialog.dismiss()
            }
        }
    }

}




