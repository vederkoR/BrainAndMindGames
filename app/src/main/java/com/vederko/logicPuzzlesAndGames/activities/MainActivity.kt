package com.vederko.logicPuzzlesAndGames.activities

import android.app.Dialog
import android.content.Intent
import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.webkit.WebView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.vederko.logicPuzzlesAndGames.BuildConfig
import com.vederko.logicPuzzlesAndGames.R
import com.vederko.logicPuzzlesAndGames.utilities.PLAYER
import com.vederko.logicPuzzlesAndGames.utilities.Player
import com.vederko.logicPuzzlesAndGames.utilities.SharedPreference
import kotlinx.android.synthetic.main.about_layout.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.low_lives_layout.*
import kotlinx.android.synthetic.main.menu_layout.*
import kotlinx.android.synthetic.main.menu_layout.OkBtn
import kotlinx.android.synthetic.main.menu_layout.homeView
import java.lang.Exception


class MainActivity : LifecycleActivity() {
    private var myplayer = Player()
    var soundTag: Int? = null
    var choiceSound: MediaPlayer? = null
    var easyLevelSolved = 0
    var normalLevelSolved = 0
    var hardLevelSolved = 0
    var trickyLevelSolved = 0
    var impossibleLevelSolved = 0


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(PLAYER, myplayer)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferenceSolved = SharedPreference(this@MainActivity)
        easyLevelSolved = sharedPreferenceSolved.getValueInt("easyLevelSolved")
        normalLevelSolved = sharedPreferenceSolved.getValueInt("normalLevelSolved")
        hardLevelSolved = sharedPreferenceSolved.getValueInt("hardLevelSolved")
        trickyLevelSolved = sharedPreferenceSolved.getValueInt("trickyLevelSolved")
        impossibleLevelSolved = sharedPreferenceSolved.getValueInt("impossibleLevelSolved")


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

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        myplayer = savedInstanceState.getParcelable(PLAYER)!!
    }

    fun taskActivity(view:View) {
        if (myplayer.levelChoise != "") {
            if (myplayer.solved?.toInt() ==-2) myplayer.solved = 1.toString()
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

        if (!easyLevelBtn.isChecked) myplayer.solved = "" else myplayer.solved =
            easyLevelSolved.toString()
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

        if (!normalLevelBtn.isChecked) myplayer.solved = "" else myplayer.solved =
            normalLevelSolved.toString()
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

        if (!hardLevelBtn.isChecked) myplayer.solved = "" else myplayer.solved =
            hardLevelSolved.toString()
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

        if (!trickyLevelBtn.isChecked) myplayer.solved = "" else myplayer.solved =
            trickyLevelSolved.toString()
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

        if (!impBtn.isChecked) myplayer.solved = "" else myplayer.solved =
            impossibleLevelSolved.toString()
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
        menuDialogMain.shareView.setOnClickListener {
            menuDialogMain.dismiss()
            val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_SUBJECT,"BRAIN &amp; MIND: LOGIC PUZZLES AND GAMES")
            intent.putExtra(Intent.EXTRA_TEXT,"Let me recommend you this application:" +
                    "\n\n  http://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share To:"))
        }
        menuDialogMain.rateView.setOnClickListener {
            val uri = Uri.parse("market://details?id=" + BuildConfig.APPLICATION_ID)
            var intent = Intent(Intent.ACTION_VIEW, uri)
            // To count with Play market backstack, After pressing back button,
            // to taken back to our application, we need to add following flags to intent.
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY or
                    Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                    Intent.FLAG_ACTIVITY_MULTIPLE_TASK)

            if (intent.resolveActivity(this.packageManager) != null) {
                startActivity(intent)
            }
            else {
                intent = Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID))
                if (intent.resolveActivity(this.packageManager) != null) {
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this, "No play store or browser app", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}




