package com.vederko.kotlinforandroidbta5.activities

import android.app.Dialog
import android.content.Intent
import android.content.res.Configuration
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.view.isVisible
import com.google.android.material.snackbar.Snackbar
import com.rommansabbir.animationx.*
import com.vederko.kotlinforandroidbta5.R
import com.vederko.kotlinforandroidbta5.utilities.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_question_i.*
import kotlinx.android.synthetic.main.low_lives_layout.*
import java.lang.Exception
import kotlinx.android.synthetic.main.activity_main.menuQuBtn as menuQuBtn

class QuestionI : LifecycleActivity() {
    var mCurrentPosition: Int = 0
    var regime = 0
    var mQuestionsList: ArrayList<Question>? = null
    var myAnswer : Int = 0
    var choiceSound: MediaPlayer? = null
    var musicBg: MediaPlayer? = null
    var numberOfLives: Int? = null
    var numberOfPoints: Int? = null
    var numberOfEnergy: Int? = null
    var flagForHint:Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_i)
val playerLvlSelected = intent.getParcelableExtra<Player>(PLAYER)
        val sharedPreference: SharedPreference = SharedPreference(this)
//        dOption.isVisible = false

        mQuestionsList = Constants.getQuestions()
        checkPlayerState(sharedPreference)
        setQuestion()
        menuQuBtn.setOnClickListener {onMenuQuClicked()}
        musicPlay()
    }

    fun stopSound(view: View) {
        if (musicBg != null) {
            musicBg!!.stop()
            musicBg!!.release()
            musicBg = null
        }
    }


    override fun onStop() {
        super.onStop()
        if (musicBg != null) {
            musicBg!!.release()
            musicBg = null
        }
    }

    override fun onResume() {
        super.onResume()
        musicPlay()

    }

    fun checkPlayerState(flx:SharedPreference) {
        numberOfLives = flx.getValueInt("numberOfLs")
        if (numberOfLives == -2) numberOfLives = 3
        flx.save("numberOfLs", numberOfLives!!)
        tvLives.text = numberOfLives.toString()

        numberOfPoints = flx.getValueInt("numberOfPs")
        if (numberOfPoints == -2) numberOfPoints = 100
        flx.save("numberOfPs", numberOfPoints!!)
        tvPoints.text = numberOfPoints.toString()

        numberOfEnergy = flx.getValueInt("numberOfEs")
        if (numberOfEnergy == -2) numberOfEnergy = 4
        flx.save("numberOfEs", numberOfEnergy!!)
        tvHints.text = numberOfEnergy.toString()
    }


    fun musicPlay() {
        try {if (musicBg == null) {
            musicBg = MediaPlayer.create(applicationContext, R.raw.musicplay)
            musicBg!!.isLooping = true
            musicBg!!.start()
        } else {
            musicBg!!.start()
        }
        } catch (e: Exception){
        }
    }

    fun nextTaskActivity(view: View) {
        val question = mQuestionsList!![mCurrentPosition]
        if (myAnswer == 0) {Snackbar.make(view, "Please, select your answer!", Snackbar.LENGTH_LONG).
        show()
            try {
                choiceSound = MediaPlayer.create(applicationContext, R.raw.error)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception){

            }
        }else if (regime == 1) {
            mCurrentPosition++
            hintBtn.text = "?"
            aOption.isChecked = false
            bOption.isChecked = false
            cOption.isChecked = false
            dOption.isChecked = false
            eOption.isChecked = false
            fOption.isChecked = false
            aOption.setBackgroundResource(R.drawable.bottons)
            bOption.setBackgroundResource(R.drawable.bottons)
            cOption.setBackgroundResource(R.drawable.bottons)
            dOption.setBackgroundResource(R.drawable.bottons)
            eOption.setBackgroundResource(R.drawable.bottons)
            fOption.setBackgroundResource(R.drawable.bottons)
            setQuestion()
            regime = 0
            myAnswer = 0
            nextActivity.text ="Submit"
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                questionBG.setImageResource(R.drawable.fonlandscape)
            } else {
                questionBG.setImageResource(R.drawable.fon)
            }
            if (numberOfLives == 0){
                Snackbar.make(view, "You don't have enough lives to continue!", Snackbar.LENGTH_SHORT).
                show()
                val livesDialog = Dialog(this)
                livesDialog.setContentView(R.layout.low_lives_layout)
                livesDialog.getWindow()?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
                livesDialog.show()
                livesDialog.lowLiveBtnOk.setOnClickListener {
                    numberOfLives = 2
                    livesDialog.dismiss()
                    val prizeDialog = Dialog(this)
                    prizeDialog.setContentView(R.layout.your_price_layout)
                    prizeDialog.getWindow()?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
                    prizeDialog.show()
                }
                livesDialog.lowLiveBtnNO.setOnClickListener {
                    numberOfLives = 8
                    livesDialog.dismiss()
                }
                val sharedPreference: SharedPreference = SharedPreference(this)
                sharedPreference.save("numberOfLs", numberOfLives!!)
                tvLives.text = numberOfLives.toString()
            }

        } else {
            hintBtn.text = "Q"
            flagForHint = 1
            if (myAnswer == question.correctAnswer){
                taskQuestion.text = question.answer
                taskImage.setImageResource(question.answerImage)
                taskImage.animationXAttention(Attention.ATTENTION_TA_DA)
                if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    questionBG.setImageResource(R.drawable.correctland)
                } else {
                    questionBG.setImageResource(R.drawable.correct)
                }
                numberOfPoints = numberOfPoints!! + 5
                val sharedPreference: SharedPreference = SharedPreference(this)
                sharedPreference.save("numberOfPs", numberOfPoints!!)
                tvPoints.text = numberOfPoints.toString()
                try {
                    choiceSound = MediaPlayer.create(applicationContext, R.raw.correct)
                    choiceSound!!.isLooping = false
                    choiceSound!!.start()
                } catch (e: Exception){
                }
                when (myAnswer) {
                    1->aOption.setBackgroundResource(R.drawable.correct_answer)
                    2->bOption.setBackgroundResource(R.drawable.correct_answer)
                    3->cOption.setBackgroundResource(R.drawable.correct_answer)
                    4->dOption.setBackgroundResource(R.drawable.correct_answer)
                    5->eOption.setBackgroundResource(R.drawable.correct_answer)
                    6->fOption.setBackgroundResource(R.drawable.correct_answer)
            }
        } else {
                taskQuestion.text = question.answer
                taskImage.setImageResource(question.answerImage)
                taskImage.animationXAttention(Attention.ATTENTION_TA_DA)
                if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    questionBG.setImageResource(R.drawable.wrongland)
                } else {
                    questionBG.setImageResource(R.drawable.wrong)
                }
               numberOfLives = numberOfLives!!-1
                val sharedPreference: SharedPreference = SharedPreference(this)
                sharedPreference.save("numberOfLs", numberOfLives!!)
                tvLives.text = numberOfLives.toString()
                try {
                    choiceSound = MediaPlayer.create(applicationContext, R.raw.wrong)
                    choiceSound!!.isLooping = false
                    choiceSound!!.start()
                } catch (e: Exception){
                }

                when (question.correctAnswer) {
                    1 -> aOption.setBackgroundResource(R.drawable.correct_answer)
                    2 -> bOption.setBackgroundResource(R.drawable.correct_answer)
                    3 -> cOption.setBackgroundResource(R.drawable.correct_answer)
                    4 -> dOption.setBackgroundResource(R.drawable.correct_answer)
                    5 -> eOption.setBackgroundResource(R.drawable.correct_answer)
                    6 -> fOption.setBackgroundResource(R.drawable.correct_answer)
                }
                when (myAnswer) {
                    1 -> aOption.setBackgroundResource(R.drawable.wrong_answer)
                    2 -> bOption.setBackgroundResource(R.drawable.wrong_answer)
                    3 -> cOption.setBackgroundResource(R.drawable.wrong_answer)
                    4 -> dOption.setBackgroundResource(R.drawable.wrong_answer)
                    5 -> eOption.setBackgroundResource(R.drawable.wrong_answer)
                    6 -> fOption.setBackgroundResource(R.drawable.wrong_answer)
                }
            }
        regime =1
            nextActivity.text ="Next"
        }
    }

    fun onAListener (view:View){
        if (regime == 0){
        bOption.isChecked = false
        cOption.isChecked = false
        dOption.isChecked = false
        eOption.isChecked = false
        fOption.isChecked = false
            try {
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception){

            }
        myAnswer = 1
        aOption.setBackgroundResource(R.drawable.bottons_checked)
        bOption.setBackgroundResource(R.drawable.bottons)
        cOption.setBackgroundResource(R.drawable.bottons)
        dOption.setBackgroundResource(R.drawable.bottons)
        eOption.setBackgroundResource(R.drawable.bottons)
        fOption.setBackgroundResource(R.drawable.bottons)
    }}
    fun onBListener (view:View){
        if (regime == 0){
        aOption.isChecked = false
        cOption.isChecked = false
        dOption.isChecked = false
        eOption.isChecked = false
        fOption.isChecked = false
            try {
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception){

            }
        myAnswer = 2
        aOption.setBackgroundResource(R.drawable.bottons)
        bOption.setBackgroundResource(R.drawable.bottons_checked)
        cOption.setBackgroundResource(R.drawable.bottons)
        dOption.setBackgroundResource(R.drawable.bottons)
        eOption.setBackgroundResource(R.drawable.bottons)
        fOption.setBackgroundResource(R.drawable.bottons)
    }}
    fun onCListener (view:View){
        if (regime == 0){
        bOption.isChecked = false
        aOption.isChecked = false
        dOption.isChecked = false
        eOption.isChecked = false
        fOption.isChecked = false
            try {
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception){

            }
        myAnswer = 3
        aOption.setBackgroundResource(R.drawable.bottons)
        bOption.setBackgroundResource(R.drawable.bottons)
        cOption.setBackgroundResource(R.drawable.bottons_checked)
        dOption.setBackgroundResource(R.drawable.bottons)
        eOption.setBackgroundResource(R.drawable.bottons)
        fOption.setBackgroundResource(R.drawable.bottons)
    }}
    fun onDListener (view:View){
        if (regime == 0){
        bOption.isChecked = false
        cOption.isChecked = false
        aOption.isChecked = false
        eOption.isChecked = false
        fOption.isChecked = false
            try {
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception){

            }
        myAnswer = 4
        aOption.setBackgroundResource(R.drawable.bottons)
        bOption.setBackgroundResource(R.drawable.bottons)
        cOption.setBackgroundResource(R.drawable.bottons)
        dOption.setBackgroundResource(R.drawable.bottons_checked)
        eOption.setBackgroundResource(R.drawable.bottons)
        fOption.setBackgroundResource(R.drawable.bottons)
        }}
    fun onEListener (view:View){
        if (regime == 0){
        bOption.isChecked = false
        cOption.isChecked = false
        dOption.isChecked = false
        aOption.isChecked = false
        fOption.isChecked = false
            try {
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception){

            }
        myAnswer = 5
        aOption.setBackgroundResource(R.drawable.bottons)
        bOption.setBackgroundResource(R.drawable.bottons)
        cOption.setBackgroundResource(R.drawable.bottons)
        dOption.setBackgroundResource(R.drawable.bottons)
        eOption.setBackgroundResource(R.drawable.bottons_checked)
        fOption.setBackgroundResource(R.drawable.bottons)
    }}
    fun onFListener (view:View){
        if (regime == 0){
        bOption.isChecked = false
        cOption.isChecked = false
        dOption.isChecked = false
        eOption.isChecked = false
        aOption.isChecked = false
            try {
                choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                choiceSound!!.isLooping = false
                choiceSound!!.start()
            } catch (e: Exception){

            }
        myAnswer = 6
        aOption.setBackgroundResource(R.drawable.bottons)
        bOption.setBackgroundResource(R.drawable.bottons)
        cOption.setBackgroundResource(R.drawable.bottons)
        dOption.setBackgroundResource(R.drawable.bottons)
        eOption.setBackgroundResource(R.drawable.bottons)
        fOption.setBackgroundResource(R.drawable.bottons_checked)
    }}

    fun setQuestion() {
        var question = mQuestionsList!![mCurrentPosition]
        when (question.numberOfQuestions) {
            3 -> {
                dOption.visibility = View.INVISIBLE
                eOption.isVisible = false
                fOption.isVisible = false
            }
            4 -> {
                dOption.isVisible = true
                eOption.isVisible = false
                fOption.isVisible = false
            }
            else -> {
                dOption.isVisible = true
                eOption.isVisible = true
                fOption.isVisible = true
            }

        }
        taskImage.setImageResource(question.questionImage)
        taskImage.animationXZoom(Zoom.ZOOM_IN)
        taskQuestion.text = question.question

    }
    private fun onMenuQuClicked() {
        val menuDialogMain = Dialog(this)
        menuDialogMain.setContentView(R.layout.menu_layout)
        menuDialogMain.getWindow()?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
        menuDialogMain.show()
    }

    fun onClickHint(view: View) {
        val question = mQuestionsList!![mCurrentPosition]
        if (nextActivity.text =="Submit"){
            if (numberOfEnergy ==0){
            val energyDialog = Dialog(this)
            energyDialog.setContentView(R.layout.low_lives_layout)
            energyDialog.getWindow()?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
            energyDialog.show()
                numberOfEnergy = 3
                tvHints.text = numberOfEnergy.toString()
            }else{
                numberOfEnergy = numberOfEnergy!! - 1
                val sharedPreference: SharedPreference = SharedPreference(this)
                sharedPreference.save("numberOfEs", numberOfEnergy!!)
                tvHints.text = numberOfEnergy.toString()
                Snackbar.make(view, question.hint, Snackbar.LENGTH_SHORT).
                show()
            }
            }else if (nextActivity.text =="Next"){
            if(flagForHint == 1){
            taskImage.setImageResource(question.questionImage)
            taskQuestion.text = question.question
            hintBtn.text = "A"
                flagForHint = 2
            }
         else {
                taskImage.setImageResource(question.answerImage)
                taskQuestion.text = question.answer
                hintBtn.text = "Q"
                flagForHint = 1
        }
        }
    }

}
