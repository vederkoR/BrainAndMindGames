package com.vederko.logicPuzzlesAndGames.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class LifecycleActivity : AppCompatActivity() {

    var tag = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "${javaClass.simpleName} OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onRestart() {
        Log.d(tag, "${javaClass.simpleName} OnRestart")
        super.onRestart()
    }

    override fun onResume() {
        Log.d(tag, "${javaClass.simpleName} OnResume")
        super.onResume()
    }

    override fun onDestroy() {
        Log.d(tag, "${javaClass.simpleName} OnDestroy")
        super.onDestroy()
    }

    override fun onPause() {
        Log.d(tag, "${javaClass.simpleName} OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag, "${javaClass.simpleName} onStop")
        super.onStop()
        }
}

