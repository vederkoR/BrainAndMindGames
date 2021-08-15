package com.vederko.kotlinforandroidbta5.utilities

import android.content.Context
import android.content.SharedPreferences

class SharedPreference(val context:Context) {
    private val STATES = "preffile"
    val sharedPref: SharedPreferences = context.getSharedPreferences(STATES,Context.MODE_PRIVATE)

    fun save(KEY_NAME: String, text:String){
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor.putString(KEY_NAME, text)
        editor.apply()
    }
    fun save(KEY_NAME: String, value:Int) {
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor.putInt(KEY_NAME, value)
        editor.apply()
    }

    fun getValueInt(KEY_NAME: String):Int{
        return sharedPref.getInt(KEY_NAME,-2)

    }
}