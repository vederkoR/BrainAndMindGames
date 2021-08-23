package com.vederko.kotlinforandroidbta5.utilities

import android.app.Dialog
import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import com.vederko.kotlinforandroidbta5.R
import com.vederko.kotlinforandroidbta5.activities.MainActivity
import kotlinx.android.synthetic.main.menu_layout.*

class MenuDialog (val context: Context, musicSet: Int, soundSet: Int){



    private var music = musicSet
    private var sound = soundSet
    fun onMenuClicked(): List<Int> {
        val menuDialogMain = Dialog(context)
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
        }

        menuDialogMain.soundView.setOnClickListener {
            if (sound == -1) {
                sound = -2
                menuDialogMain.soundView.setImageResource(R.drawable.soundminus)
            } else if (sound == -2) {
                sound = -1
                menuDialogMain.soundView.setImageResource(R.drawable.soundplus)
            }
        }

        menuDialogMain.homeView.setOnClickListener {
            val home = Intent(context, MainActivity::class.java)
            startActivity(context,home,null)
            menuDialogMain.dismiss()
        }

        menuDialogMain.OkBtn.setOnClickListener {
            menuDialogMain.dismiss()
        }


        return listOf(music,sound)
    }

}

