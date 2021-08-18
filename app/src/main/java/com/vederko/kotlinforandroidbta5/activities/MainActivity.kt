package com.vederko.kotlinforandroidbta5.activities

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.vederko.kotlinforandroidbta5.R
import com.vederko.kotlinforandroidbta5.utilities.PLAYER
import com.vederko.kotlinforandroidbta5.utilities.Player
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : LifecycleActivity() {
    var playerLvlSelected = Player("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        menuQuBtn.setOnClickListener { onMenuClicked()}
    }

    fun taskActivity(view: View) {
        if (playerLvlSelected.levelChoise != "") {
            val firstTaskIntent = Intent(this, QuestionI::class.java)
            firstTaskIntent.putExtra(PLAYER, playerLvlSelected)
            startActivity(firstTaskIntent)
        } else {
            val intent = Intent(this, TaskListActivity::class.java)
            startActivity(intent)
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

    private fun onMenuClicked() {
        val menuDialogMain = Dialog(this)
        menuDialogMain.setContentView(R.layout.menu_layout)
        menuDialogMain.getWindow()?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
        menuDialogMain.show()
    }

    }
