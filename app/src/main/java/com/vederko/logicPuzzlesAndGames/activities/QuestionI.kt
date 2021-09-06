package com.vederko.logicPuzzlesAndGames.activities

import android.app.Dialog
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.graphics.Color
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.ads.*
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import com.google.android.material.snackbar.Snackbar
import com.rommansabbir.animationx.*
import com.vederko.logicPuzzlesAndGames.BuildConfig
import com.vederko.logicPuzzlesAndGames.R
import com.vederko.logicPuzzlesAndGames.utilities.*
import kotlinx.android.synthetic.main.about_layout.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_question_i.*
import kotlinx.android.synthetic.main.low_energy_layout.*
import kotlinx.android.synthetic.main.low_lives_layout.*
import kotlinx.android.synthetic.main.low_lives_layout.OkBtn
import kotlinx.android.synthetic.main.low_lives_layout.homeView
import kotlinx.android.synthetic.main.menu_layout.*
import kotlinx.android.synthetic.main.your_price_layout.*
import java.lang.Exception
import kotlin.collections.ArrayList
import kotlinx.android.synthetic.main.activity_main.menuQuBtn as menuQuBtn



class QuestionI : LifecycleActivity() {
    var mCurrentPosition: Int = 0
    var regime = 0
    var mQuestionsList: ArrayList<Question>? = null
    var myAnswer: Int = 0
    var choiceSound: MediaPlayer? = null
    var musicBg: MediaPlayer? = null
    var numberOfLives: Int? = null
    var numberOfPoints: Int? = null
    var numberOfEnergy: Int? = null
    var flagForHint: Int = -1
    var flagHintUsed: Int = -1
    var soundTag: Int? = null
    var musciTag: Int? = null
    var flagForPrize = -1
    var flagPrizeOk = -1
    private var mIsLoading = false
    private var mRewardedAd: RewardedAd? = null
    private lateinit var viewModel: QuestionActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_i)
        val playerLvlSelected = intent.getParcelableExtra<Player>(PLAYER)
        val sharedPreference = SharedPreference(this)

        val ua = WebView(this).settings.userAgentString
        if ("Mobile" !in ua) {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }

        MobileAds.initialize(this) {}
        loadRewardedAd()



        when (playerLvlSelected?.levelChoise) {
            "Easy" -> mQuestionsList = Constants.getEasyQuestions()
            "Normal" -> mQuestionsList = Constants.getNormalQuestions()
            "Hard" -> mQuestionsList = Constants.getHardQuestions()
            "Tricky" -> mQuestionsList = Constants.getTrickyQuestions()
            "Impossible" -> mQuestionsList = Constants.getImpossibleQuestions()
        }

        mCurrentPosition = playerLvlSelected?.quesChoise!!.toInt()

        checkPlayerState(sharedPreference)

        viewModel = ViewModelProvider(
            this,
            QuestionViewModelFactory(mCurrentPosition)
        )
            .get(QuestionActivityViewModel::class.java)
        viewModel.answerLD.observe(this, { myAnswer = it })
        viewModel.regimeLD.observe(this, { regime = it })
        viewModel.position.observe(this, {
            mCurrentPosition = it
            setQuestion()
        })

        val sharedPreferenceMenu = SharedPreference(this)
        soundTag = sharedPreferenceMenu.getValueInt("sound")
        musciTag = sharedPreferenceMenu.getValueInt("music")
        menuQuBtn.setOnClickListener {
            onMenuClicked(
                sharedPreferenceMenu.getValueInt("music"),
                sharedPreferenceMenu.getValueInt("sound")
            )

        }
        if (sharedPreferenceMenu.getValueInt("music") == -1) {musicPlay()}
    }

    override fun onBackPressed() {
        val home = Intent(this, MainActivity::class.java)
        startActivity(home)
        finish()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt("POSITION", mCurrentPosition)
        outState.putInt("ANSWER", myAnswer)
        outState.putInt("REGIME", regime)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        viewModel.position.observe(this, { mCurrentPosition = it })
        mCurrentPosition = savedInstanceState.getInt("POSITION")
        myAnswer = savedInstanceState.getInt("ANSWER")
        regime = savedInstanceState.getInt("regime")
    }


    private fun stopMusic() {
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
        val sharedPreferenceMenu = SharedPreference(this)
        if (sharedPreferenceMenu.getValueInt("music") == -1) {musicPlay()}

    }

    private fun checkPlayerState(flx: SharedPreference) {
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


    private fun musicPlay() {
        try {
            if (musicBg == null) {
                musicBg = MediaPlayer.create(applicationContext, R.raw.musicplay)
                musicBg!!.isLooping = true
                musicBg!!.start()
            } else {
                musicBg!!.start()
            }
        } catch (e: Exception) {
        }
    }

    fun nextTaskActivity(view: View) {

        viewModel.regimeLD.observe(this, { regime = it })
        val question = mQuestionsList!![mCurrentPosition]
        if (myAnswer == 0) {
            Snackbar.make(
                view,
                "Please, select your answer!",
                Snackbar.LENGTH_LONG
            ).show()
            if (soundTag == -1) {
                try {
                    if (choiceSound != null) choiceSound!!.release()
                    choiceSound = MediaPlayer.create(applicationContext, R.raw.error)
                    choiceSound!!.isLooping = false
                    choiceSound!!.start()
                } catch (e: Exception) {
                }
            }
        } else if (regime == 1) {
            if (mCurrentPosition+1 == mQuestionsList?.size){
                val finishAct = Intent(this, PrizeActivity::class.java)
                val playerLvlSelected = intent.getParcelableExtra<Player>(PLAYER)
                finishAct.putExtra(PLAYER, playerLvlSelected)
                startActivity(finishAct)
            }
            else {
                if (numberOfLives == 0) {
                    lowLive(view)
                } else {

                    viewModel.increment()
                    viewModel.position.observe(this, { mCurrentPosition = it })


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


                    viewModel.regimeChangeToQu()
                    viewModel.regimeLD.observe(this, { regime = it })
                    viewModel.ansNull()
                    viewModel.answerLD.observe(this, { myAnswer = it })
                    setQuestion()
                    flagHintUsed = -1
                    nextActivity.text = "Submit"

                    val ua = WebView(this).settings.userAgentString

                    if ("Mobile" in ua) {
                        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                            questionBG.setImageResource(R.drawable.normlandred)
                        } else {
                            questionBG.setImageResource(R.drawable.normportred)
                        }
                    } else {
                        questionBG.setImageResource(R.drawable.fontabletnornal)
                    }
                    if (numberOfLives == 0) {
                        lowLive(view)
                    }
                }
            }

        } else {
            if (numberOfLives == 0) {
                lowLive(view)
            } else {
                hintBtn.text = "Q"
                flagForHint = 1
                if (myAnswer == question.correctAnswer) {
                    taskQuestion.text = question.answer
                    taskImage.setImageResource(question.answerImage)
                    taskImage.animationXAttention(Attention.ATTENTION_TA_DA)

                    val ua = WebView(this).settings.userAgentString

                    if ("Mobile" in ua){
                        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                            questionBG.setImageResource(R.drawable.corlandred)
                        } else {
                            questionBG.setImageResource(R.drawable.corportred)
                        }
                    }else {
                        questionBG.setImageResource(R.drawable.fontabletcorrect)
                    }
                    val playerLvlSelected = intent.getParcelableExtra<Player>(PLAYER)
                    val sharedPreferenceSolved = SharedPreference(this)
                    var easyLevelSolved = sharedPreferenceSolved
                        .getValueInt("easyLevelSolved")
                    var normalLevelSolved = sharedPreferenceSolved
                        .getValueInt("normalLevelSolved")
                    var hardLevelSolved = sharedPreferenceSolved
                        .getValueInt("hardLevelSolved")
                    var trickyLevelSolved = sharedPreferenceSolved
                        .getValueInt("trickyLevelSolved")
                    var impossibleLevelSolved = sharedPreferenceSolved
                        .getValueInt("impossibleLevelSolved")


                    when (playerLvlSelected?.levelChoise) {
                        "Easy" -> if (easyLevelSolved < mCurrentPosition+2) {
                            sharedPreferenceSolved
                                .save("easyLevelSolved", (mCurrentPosition+2))
                            numberOfPoints = numberOfPoints!! + 5
                        }
                        "Normal" -> if (normalLevelSolved  < mCurrentPosition+2) {
                            sharedPreferenceSolved
                                .save("normalLevelSolved", (mCurrentPosition+2))
                            numberOfPoints = numberOfPoints!! + 5
                        }
                        "Hard" -> if (hardLevelSolved  < mCurrentPosition+2) {
                            sharedPreferenceSolved
                                .save("hardLevelSolved", (mCurrentPosition+2))
                            numberOfPoints = numberOfPoints!! + 5
                        }
                        "Tricky" -> if (trickyLevelSolved < mCurrentPosition+2) {
                            sharedPreferenceSolved
                                .save("trickyLevelSolved", (mCurrentPosition+2))
                            numberOfPoints = numberOfPoints!! + 5
                        }
                        "Impossible" -> if (impossibleLevelSolved < mCurrentPosition+2) {
                            sharedPreferenceSolved
                                .save("impossibleLevelSolved", (mCurrentPosition+2))
                            numberOfPoints = numberOfPoints!! + 5
                        }
                    }

                    val sharedPreference: SharedPreference = SharedPreference(this)
                    sharedPreference.save("numberOfPs", numberOfPoints!!)
                    tvPoints.text = numberOfPoints.toString()
                    if (soundTag == -1) {
                        try {
                            if (choiceSound != null) choiceSound!!.release()
                            choiceSound = MediaPlayer.create(applicationContext, R.raw.correct)
                            choiceSound!!.isLooping = false
                            choiceSound!!.start()
                        } catch (e: Exception) {
                        }
                    }
                    when (myAnswer) {
                        1 -> aOption.setBackgroundResource(R.drawable.correct_answer)
                        2 -> bOption.setBackgroundResource(R.drawable.correct_answer)
                        3 -> cOption.setBackgroundResource(R.drawable.correct_answer)
                        4 -> dOption.setBackgroundResource(R.drawable.correct_answer)
                        5 -> eOption.setBackgroundResource(R.drawable.correct_answer)
                        6 -> fOption.setBackgroundResource(R.drawable.correct_answer)
                    }
                } else {
                    taskQuestion.text = question.answer
                    taskImage.setImageResource(question.answerImage)
                    taskImage.animationXAttention(Attention.ATTENTION_TA_DA)

                    val ua = WebView(this).settings.userAgentString
                    if ("Mobile" in ua){
                        if (resources.configuration.orientation == Configuration.
                            ORIENTATION_LANDSCAPE) {
                            questionBG.setImageResource(R.drawable.wronglandred)
                        } else {
                            questionBG.setImageResource(R.drawable.wrongportred)
                        }
                    }else {
                        questionBG.setImageResource(R.drawable.fontabletwrong)
                    }

                    numberOfLives = numberOfLives!! - 1
                    val sharedPreference: SharedPreference = SharedPreference(this)
                    sharedPreference.save("numberOfLs", numberOfLives!!)
                    tvLives.text = numberOfLives.toString()
                    if (soundTag == -1) {
                        try {
                            if (choiceSound != null) choiceSound!!.release()
                            choiceSound = MediaPlayer.create(applicationContext, R.raw.wrong)
                            choiceSound!!.isLooping = false
                            choiceSound!!.start()
                        } catch (e: Exception) {
                        }
                    }

                    val playerLvlSelected = intent.getParcelableExtra<Player>(PLAYER)
                    val sharedPreferenceSolved = SharedPreference(this)
                    var easyLevelSolved = sharedPreferenceSolved
                        .getValueInt("easyLevelSolved")
                    var normalLevelSolved = sharedPreferenceSolved
                        .getValueInt("normalLevelSolved")
                    var hardLevelSolved = sharedPreferenceSolved
                        .getValueInt("hardLevelSolved")
                    var trickyLevelSolved = sharedPreferenceSolved
                        .getValueInt("trickyLevelSolved")
                    var impossibleLevelSolved = sharedPreferenceSolved
                        .getValueInt("impossibleLevelSolved")


                    when (playerLvlSelected?.levelChoise) {
                        "Easy" -> if (easyLevelSolved < mCurrentPosition+2) {
                            sharedPreferenceSolved
                                .save("easyLevelSolved", (mCurrentPosition+2))
                        }
                        "Normal" -> if (normalLevelSolved  < mCurrentPosition+2) {
                            sharedPreferenceSolved
                                .save("normalLevelSolved", (mCurrentPosition+2))
                        }
                        "Hard" -> if (hardLevelSolved  < mCurrentPosition+2) {
                            sharedPreferenceSolved
                                .save("hardLevelSolved", (mCurrentPosition+2))
                        }
                        "Tricky" -> if (trickyLevelSolved < mCurrentPosition+2) {
                            sharedPreferenceSolved
                                .save("trickyLevelSolved", (mCurrentPosition+2))
                        }
                        "Impossible" -> if (impossibleLevelSolved < mCurrentPosition+2) {
                            sharedPreferenceSolved
                                .save("impossibleLevelSolved", (mCurrentPosition+2))
                        }
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
                viewModel.regimeChangeToAns()
                viewModel.regimeLD.observe(this, { regime = it })


                nextActivity.text = "Next"
            }
        }
    }

    fun onAListener(view: View) {
        viewModel.regimeLD.observe(this, { regime = it })
        if (regime == 0) {

            bOption.isChecked = false
            cOption.isChecked = false
            dOption.isChecked = false
            eOption.isChecked = false
            fOption.isChecked = false
            if (soundTag == -1) {
                try {
                    if (choiceSound != null) choiceSound!!.release()
                    choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                    choiceSound!!.isLooping = false
                    choiceSound!!.start()
                } catch (e: Exception) {
                }
            }

            viewModel.answA()
            viewModel.answerLD.observe(this, { myAnswer = it })
            aOption.setBackgroundResource(R.drawable.bottons_checked)
            bOption.setBackgroundResource(R.drawable.bottons)
            cOption.setBackgroundResource(R.drawable.bottons)
            dOption.setBackgroundResource(R.drawable.bottons)
            eOption.setBackgroundResource(R.drawable.bottons)
            fOption.setBackgroundResource(R.drawable.bottons)
        }
    }

    fun onBListener(view: View) {
        viewModel.regimeLD.observe(this, { regime = it })
        if (regime == 0) {


            aOption.isChecked = false
            cOption.isChecked = false
            dOption.isChecked = false
            eOption.isChecked = false
            fOption.isChecked = false
            if (soundTag == -1) {
                try {
                    if (choiceSound != null) choiceSound!!.release()
                    choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                    choiceSound!!.isLooping = false
                    choiceSound!!.start()
                } catch (e: Exception) {
                }
            }
            viewModel.answB()
            viewModel.answerLD.observe(this, { myAnswer = it })

            aOption.setBackgroundResource(R.drawable.bottons)
            bOption.setBackgroundResource(R.drawable.bottons_checked)
            cOption.setBackgroundResource(R.drawable.bottons)
            dOption.setBackgroundResource(R.drawable.bottons)
            eOption.setBackgroundResource(R.drawable.bottons)
            fOption.setBackgroundResource(R.drawable.bottons)
        }
    }

    fun onCListener(view: View) {
        viewModel.regimeLD.observe(this, { regime = it })
        if (regime == 0) {


            bOption.isChecked = false
            aOption.isChecked = false
            dOption.isChecked = false
            eOption.isChecked = false
            fOption.isChecked = false
            if (soundTag == -1) {
                try {
                    if (choiceSound != null) choiceSound!!.release()
                    choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                    choiceSound!!.isLooping = false
                    choiceSound!!.start()
                } catch (e: Exception) {
                }
            }

            viewModel.answC()
            viewModel.answerLD.observe(this, { myAnswer = it })

            aOption.setBackgroundResource(R.drawable.bottons)
            bOption.setBackgroundResource(R.drawable.bottons)
            cOption.setBackgroundResource(R.drawable.bottons_checked)
            dOption.setBackgroundResource(R.drawable.bottons)
            eOption.setBackgroundResource(R.drawable.bottons)
            fOption.setBackgroundResource(R.drawable.bottons)
        }
    }

    fun onDListener(view: View) {
        viewModel.regimeLD.observe(this, { regime = it })
        if (regime == 0) {


            bOption.isChecked = false
            cOption.isChecked = false
            aOption.isChecked = false
            eOption.isChecked = false
            fOption.isChecked = false
            if (soundTag == -1) {
                try {
                    if (choiceSound != null) choiceSound!!.release()
                    choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                    choiceSound!!.isLooping = false
                    choiceSound!!.start()
                } catch (e: Exception) {
                }
            }

            viewModel.answD()
            viewModel.answerLD.observe(this, { myAnswer = it })


            aOption.setBackgroundResource(R.drawable.bottons)
            bOption.setBackgroundResource(R.drawable.bottons)
            cOption.setBackgroundResource(R.drawable.bottons)
            dOption.setBackgroundResource(R.drawable.bottons_checked)
            eOption.setBackgroundResource(R.drawable.bottons)
            fOption.setBackgroundResource(R.drawable.bottons)
        }
    }

    fun onEListener(view: View) {
        viewModel.regimeLD.observe(this, { regime = it })


        if (regime == 0) {
            bOption.isChecked = false
            cOption.isChecked = false
            dOption.isChecked = false
            aOption.isChecked = false
            fOption.isChecked = false
            if (soundTag == -1) {
                try {
                    if (choiceSound != null) choiceSound!!.release()
                    choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                    choiceSound!!.isLooping = false
                    choiceSound!!.start()
                } catch (e: Exception) {
                }
            }
            viewModel.answE()
            viewModel.answerLD.observe(this, { myAnswer = it })

            aOption.setBackgroundResource(R.drawable.bottons)
            bOption.setBackgroundResource(R.drawable.bottons)
            cOption.setBackgroundResource(R.drawable.bottons)
            dOption.setBackgroundResource(R.drawable.bottons)
            eOption.setBackgroundResource(R.drawable.bottons_checked)
            fOption.setBackgroundResource(R.drawable.bottons)
        }
    }

    fun onFListener(view: View) {
        viewModel.regimeLD.observe(this, { regime = it })
        if (regime == 0) {


            bOption.isChecked = false
            cOption.isChecked = false
            dOption.isChecked = false
            eOption.isChecked = false
            aOption.isChecked = false
            if (soundTag == -1) {
                try {
                    if (choiceSound != null) choiceSound!!.release()
                    choiceSound = MediaPlayer.create(applicationContext, R.raw.clickchoise)
                    choiceSound!!.isLooping = false
                    choiceSound!!.start()
                } catch (e: Exception) {
                }
            }

            viewModel.answF()
            viewModel.answerLD.observe(this, { myAnswer = it })

            aOption.setBackgroundResource(R.drawable.bottons)
            bOption.setBackgroundResource(R.drawable.bottons)
            cOption.setBackgroundResource(R.drawable.bottons)
            dOption.setBackgroundResource(R.drawable.bottons)
            eOption.setBackgroundResource(R.drawable.bottons)
            fOption.setBackgroundResource(R.drawable.bottons_checked)
        }
    }

    private fun setQuestion() {
        val question = mQuestionsList!![mCurrentPosition]
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
        if (regime == 0) {
            taskImage.setImageResource(question.questionImage)
            taskImage.animationXZoom(Zoom.ZOOM_IN)
            taskQuestion.text = question.question
        } else {
            taskImage.setImageResource(question.answerImage)
            taskImage.animationXZoom(Zoom.ZOOM_IN)
            taskQuestion.text = question.answer
            nextActivity.text = "Next"
            hintBtn.text = "Q"
            when (question.correctAnswer) {
                1 -> aOption.setBackgroundResource(R.drawable.correct_answer)
                2 -> bOption.setBackgroundResource(R.drawable.correct_answer)
                3 -> cOption.setBackgroundResource(R.drawable.correct_answer)
                4 -> dOption.setBackgroundResource(R.drawable.correct_answer)
                5 -> eOption.setBackgroundResource(R.drawable.correct_answer)
                6 -> fOption.setBackgroundResource(R.drawable.correct_answer)
            }
            if (myAnswer == question.correctAnswer) {

                val ua = WebView(this).settings.userAgentString
                if ("Mobile" in ua){
                    if (resources.configuration.orientation == Configuration
                            .ORIENTATION_LANDSCAPE) {
                        questionBG.setImageResource(R.drawable.corlandred)
                    } else {
                        questionBG.setImageResource(R.drawable.corportred)
                    }
                }else {
                    questionBG.setImageResource(R.drawable.fontabletcorrect)
                }


            } else {
                when (myAnswer) {
                    1 -> aOption.setBackgroundResource(R.drawable.wrong_answer)
                    2 -> bOption.setBackgroundResource(R.drawable.wrong_answer)
                    3 -> cOption.setBackgroundResource(R.drawable.wrong_answer)
                    4 -> dOption.setBackgroundResource(R.drawable.wrong_answer)
                    5 -> eOption.setBackgroundResource(R.drawable.wrong_answer)
                    6 -> fOption.setBackgroundResource(R.drawable.wrong_answer)
                }

                val ua = WebView(this).settings.userAgentString
                if ("Mobile" in ua){
                    if (resources.configuration.orientation == Configuration.
                        ORIENTATION_LANDSCAPE) {
                        questionBG.setImageResource(R.drawable.wronglandred)
                    } else {
                        questionBG.setImageResource(R.drawable.wrongportred)
                    }
                } else {
                    questionBG.setImageResource(R.drawable.fontabletwrong)
                }

            }

        }
    }

    fun onClickHint(view: View) {
        viewModel.position.observe(this, { mCurrentPosition = it })
        val question = mQuestionsList!![mCurrentPosition]
        if (nextActivity.text == "Submit") {
            if (numberOfEnergy == 0 && flagHintUsed==-1) {
                val energyDialog = Dialog(this)
                energyDialog.setContentView(R.layout.low_energy_layout)
                energyDialog.window?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
                energyDialog.show()
                energyDialog.setCanceledOnTouchOutside(false)
                energyDialog.setCancelable(false)
                energyDialog.OkBtnEnergy.setOnClickListener {
                    stopMusic()
                    energyDialog.dismiss()
                    showRewardedVideoEnergy()
                }
                energyDialog.lowEnergyBtnNO.setOnClickListener {
                    energyDialog.dismiss()
                }
            } else {
                if (question.hint != null) {
                    if (flagHintUsed == -1) numberOfEnergy = numberOfEnergy!! - 1
                    val sharedPreference: SharedPreference = SharedPreference(this)
                    sharedPreference.save("numberOfEs", numberOfEnergy!!)
                    tvHints.text = numberOfEnergy.toString()
                    var snack = Snackbar.make(view, question!!.hint!!, 10000)
                    snack.setActionTextColor(Color.BLUE)
                    val snackBarView = snack.view
                    snackBarView.setBackgroundColor(Color.BLACK)
                    val textView = snackBarView
                        .findViewById(com.google.android.material.R.id.snackbar_text) as TextView
                    textView.setTextColor(Color.WHITE)
                    textView.textAlignment = View.TEXT_ALIGNMENT_CENTER
                    snack.show()

                    flagHintUsed = -2
                }
            }
        } else if (nextActivity.text == "Next") {
            if (flagForHint == 1) {
                taskImage.setImageResource(question.questionImage)
                taskQuestion.text = question.question
                hintBtn.text = "A"
                flagForHint = 2
            } else {
                taskImage.setImageResource(question.answerImage)
                taskQuestion.text = question.answer
                hintBtn.text = "Q"
                flagForHint = 1
            }
        }
    }

    fun onMenuClicked(musics: Int, sounds: Int) {
        var music = musics
        var sound = sounds
        val sharedPreferenceMenu = SharedPreference(this)
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
                stopMusic()
                musciTag = -2

            } else if (music == -2) {
                music = -1
                menuDialogMain.musicView.setImageResource(R.drawable.musicplus)
                musicPlay()
                musciTag = -1
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
            aboutDialog.aboutTextView.text = getString(R.string.about)
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

    fun lowLive(view: View) {
        Snackbar.make(
            view,
            "You don't have enough lives to continue!",
            Snackbar.LENGTH_SHORT
        ).show()
        val livesDialog = Dialog(this)
        livesDialog.setContentView(R.layout.low_lives_layout)
        livesDialog.window
            ?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
        livesDialog.show()
        livesDialog.setCanceledOnTouchOutside(false)
        livesDialog.setCancelable(false)
        livesDialog.OkBtn.setOnClickListener {
            if (numberOfLives!! >= 5) {
                livesDialog.dismiss()
            } else {
                stopMusic()
                livesDialog.dismiss()
                try {
                    showRewardedVideoLives()
                } catch (e: Exception) {
                    numberOfLives = 1
                    tvLowLives.text = numberOfLives.toString()
                }
            }

        }
        livesDialog.lowLiveBtnNO.setOnClickListener {
            livesDialog.dismiss()
        }

    }


    fun prizeDialogFun() {
        val prizeDialog = Dialog(this)
        prizeDialog.setContentView(R.layout.your_price_layout)
        prizeDialog.window
            ?.setBackgroundDrawableResource(R.drawable.dialog_rounded_background)
        prizeDialog.show()
        prizeDialog.setCanceledOnTouchOutside(false)
        prizeDialog.setCancelable(false)
        val prizes = Constants.getPrizeLives()
        var prizeChoice = 0

        prizeDialog.OkBtnPrize.isVisible = false

        prizeDialog.option1.setOnClickListener {

            if (flagForPrize == -1) {
                prizeDialog.option1.setImageResource(prizes[0].prizeImage)
                prizeDialog.option1.animationXFade(Fade.FADE_IN)
                prizeDialog.OkBtnPrize.isVisible = true
                flagForPrize = 0
                prizeChoice = 1
                prizeDialog.prizeTitle.text = "Your Prize Is:"
            }
        }

        prizeDialog.option2.setOnClickListener {
            if (flagForPrize == -1) {
                prizeDialog.option2.setImageResource(prizes[1].prizeImage)
                prizeDialog.option2.animationXFade(Fade.FADE_IN)
                prizeDialog.OkBtnPrize.isVisible = true
                flagForPrize= 0
                prizeChoice = 2
                prizeDialog.prizeTitle.text = "Your Prize Is:"
            }
        }

        prizeDialog.option3.setOnClickListener {
            if (flagForPrize == -1) {
                prizeDialog.option3.setImageResource(prizes[2].prizeImage)
                prizeDialog.option3.animationXFade(Fade.FADE_IN)
                prizeDialog.OkBtnPrize.isVisible = true
                flagForPrize = 0
                prizeChoice = 3
                prizeDialog.prizeTitle.text = "Your Prize Is:"
            }
        }

        prizeDialog.option4.setOnClickListener {
            if (flagForPrize == -1) {
                prizeDialog.option4.setImageResource(prizes[3].prizeImage)
                prizeDialog.option4.animationXFade(Fade.FADE_IN)
                prizeDialog.OkBtnPrize.isVisible = true
                flagForPrize = 0
                prizeChoice = 4
                prizeDialog.prizeTitle.text = "Your Prize Is:"
            }
        }

        prizeDialog.option5.setOnClickListener {
            if (flagForPrize == -1) {
                prizeDialog.option5.setImageResource(prizes[4].prizeImage)
                prizeDialog.option5.animationXFade(Fade.FADE_IN)
                prizeDialog.OkBtnPrize.isVisible = true
                flagForPrize = 0
                prizeChoice = 5
                prizeDialog.prizeTitle.text = "Your Prize Is:"
            }
        }

        prizeDialog.option6.setOnClickListener {
            if (flagForPrize == -1) {
                prizeDialog.option6.setImageResource(prizes[5].prizeImage)
                prizeDialog.option6.animationXFade(Fade.FADE_IN)
                prizeDialog.OkBtnPrize.isVisible = true
                flagForPrize = 0
                prizeChoice = 6
                prizeDialog.prizeTitle.text = "Your Prize Is:"
            }
        }

        prizeDialog.option7.setOnClickListener {
            if (flagForPrize == -1) {
                prizeDialog.option7.setImageResource(prizes[6].prizeImage)
                prizeDialog.option7.animationXFade(Fade.FADE_IN)
                prizeDialog.OkBtnPrize.isVisible = true
                flagForPrize = 0
                prizeChoice = 7
                prizeDialog.prizeTitle.text = "Your Prize Is:"
            }
        }

        prizeDialog.option8.setOnClickListener {
            if (flagForPrize == -1) {
                prizeDialog.option8.setImageResource(prizes[7].prizeImage)
                prizeDialog.option8.animationXFade(Fade.FADE_IN)
                prizeDialog.OkBtnPrize.isVisible = true
                flagForPrize = 0
                prizeChoice = 8
                prizeDialog.prizeTitle.text = "Your Prize Is:"
            }
        }

        prizeDialog.option9.setOnClickListener {
            if (flagForPrize == -1) {
                prizeDialog.option9.setImageResource(prizes[8].prizeImage)
                prizeDialog.option9.animationXFade(Fade.FADE_IN)
                prizeDialog.OkBtnPrize.isVisible = true
                flagForPrize = 0
                prizeChoice = 9
                prizeDialog.prizeTitle.text = "Your Prize Is:"
            }
        }
        prizeDialog.OkBtnPrize.setOnClickListener {

            if (flagPrizeOk == -1) {
                val sharedPreference: SharedPreference = SharedPreference(this)
                numberOfLives = numberOfLives!! + prizes[prizeChoice-1].livesBonus
                numberOfEnergy = numberOfEnergy!! + prizes[prizeChoice-1].energyBonus
                numberOfPoints = numberOfPoints!! + prizes[prizeChoice-1].pointsBonus
                sharedPreference.save("numberOfLs", numberOfLives!!)
                tvLives.text = numberOfLives.toString()

                sharedPreference.save("numberOfEs", numberOfEnergy!!)
                tvHints.text = numberOfEnergy.toString()

                sharedPreference.save("numberOfPs", numberOfPoints!!)
                tvPoints.text = numberOfPoints.toString()


                prizeDialog.option1.setImageResource(prizes[0].prizeImage)
                prizeDialog.option2.setImageResource(prizes[1].prizeImage)
                prizeDialog.option3.setImageResource(prizes[2].prizeImage)
                prizeDialog.option4.setImageResource(prizes[3].prizeImage)
                prizeDialog.option5.setImageResource(prizes[4].prizeImage)
                prizeDialog.option6.setImageResource(prizes[5].prizeImage)
                prizeDialog.option7.setImageResource(prizes[6].prizeImage)
                prizeDialog.option8.setImageResource(prizes[7].prizeImage)
                prizeDialog.option9.setImageResource(prizes[8].prizeImage)
                prizeDialog.prizeTitle.text = "Thank You!"

                flagPrizeOk = 0
            } else {
                flagPrizeOk = -1
                flagForPrize = -1
                prizeChoice = 0
                prizeDialog.OkBtnPrize.isVisible = false
                prizeDialog.prizeTitle.text = "Select Your Prize!"
                prizeDialog.dismiss()
            }
        }


    }

    private fun loadRewardedAd() {
        if (mRewardedAd == null) {
            mIsLoading = true
            var adRequest = AdRequest.Builder().build()

            RewardedAd.load(
                this, AD_UNIT_ID, adRequest,
                object : RewardedAdLoadCallback() {
                    override fun onAdFailedToLoad(adError: LoadAdError) {
                        Log.d(TAG, adError.message)
                        mIsLoading = false
                        mRewardedAd = null
                    }

                    override fun onAdLoaded(rewardedAd: RewardedAd) {
                        Log.d(TAG, "Ad was loaded.")
                        mRewardedAd = rewardedAd
                        mIsLoading = false
                    }
                }
            )
        }
    }

    private fun showRewardedVideoLives() {
        if (mRewardedAd != null) {
            mRewardedAd?.fullScreenContentCallback = object : FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    Log.d(TAG, "Ad was dismissed.")
                    // Don't forget to set the ad reference to null so you
                    // don't show the ad a second time.
                    mRewardedAd = null
                    loadRewardedAd()
                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError?) {
                    // Don't forget to set the ad reference to null so you
                    // don't show the ad a second time.
                    numberOfLives = 1
                    if (musciTag== -1) {musicPlay()}
                    mRewardedAd = null
                }

                override fun onAdShowedFullScreenContent() {
                    // Called when ad is dismissed.
                }
            }

            mRewardedAd?.show(
                this,
                OnUserEarnedRewardListener {
                    numberOfLives = 5
                    tvLives.text = numberOfLives.toString()
                    val sharedPreference: SharedPreference = SharedPreference(this)
                    sharedPreference.save("numberOfLs", numberOfLives!!)
                    tvLives.text = numberOfLives.toString()
                    prizeDialogFun()
                    if (musciTag== -1) {musicPlay()}
                }
            )
        }
    }

    private fun showRewardedVideoEnergy() {
        if (mRewardedAd != null) {
            mRewardedAd?.fullScreenContentCallback = object : FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    Log.d(TAG, "Ad was dismissed.")
                    // Don't forget to set the ad reference to null so you
                    // don't show the ad a second time.
                    mRewardedAd = null
                    loadRewardedAd()
                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError?) {
                    // Don't forget to set the ad reference to null so you
                    // don't show the ad a second time.
                    if (musciTag== -1) {musicPlay()}
                    mRewardedAd = null
                }

                override fun onAdShowedFullScreenContent() {
                    // Called when ad is dismissed.
                }
            }

            mRewardedAd?.show(
                this,
                OnUserEarnedRewardListener {
                    numberOfEnergy = 5
                    val sharedPreference: SharedPreference = SharedPreference(this)
                    sharedPreference.save("numberOfEs", numberOfEnergy!!)
                    tvHints.text = numberOfEnergy.toString()
                    if (musciTag== -1) {musicPlay()}
                }
            )
        }
    }

}