package com.vederko.kotlinforandroidbta5.utilities

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuestionActivityViewModel(var currentPosition: Int = 0) : ViewModel() {

    val position: MutableLiveData<Int> = MutableLiveData()


    init {
        position.value = currentPosition
    }

   fun increment() {
        position.value = position.value!! + 1
    }

}