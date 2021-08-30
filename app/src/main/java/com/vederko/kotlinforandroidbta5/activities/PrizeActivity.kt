package com.vederko.kotlinforandroidbta5.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vederko.kotlinforandroidbta5.R
import kotlinx.android.synthetic.main.activity_prize.*

class PrizeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prize)

        finishText.text = "YOU HAVE FINISHED THE EASY LEVEL SECTION!"
    }
}