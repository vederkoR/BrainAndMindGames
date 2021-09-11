package com.vederko.logicPuzzlesAndGames.utilities

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class QuestionActivityViewModel(
    currentPosition: Int = 0
) : ViewModel() {

    val position: MutableLiveData<Int> = MutableLiveData()
    val regimeLD: MutableLiveData<Int> = MutableLiveData()
    val answerLD: MutableLiveData<Int> = MutableLiveData()
    init {
        position.value = currentPosition
        regimeLD.value = 0
        answerLD.value = 0
    }

   fun increment() {
        position.value = position.value!! + 1
    }
    fun regimeChangeToQu(){
        regimeLD.value = 0
    }

    fun regimeChangeToAns(){
        regimeLD.value = 1
    }

    fun ansNull(){
        answerLD.value = 0
    }

    fun answA(){
        answerLD.value = 1
    }

    fun answB(){
        answerLD.value = 2
    }

    fun answC(){
        answerLD.value = 3
    }

    fun answD(){
        answerLD.value = 4
    }

    fun answE(){
        answerLD.value = 5
    }

    fun answF(){
        answerLD.value = 6
    }




}

class QuestionViewModelFactory(
    private val position: Int
): ViewModelProvider.NewInstanceFactory() {
    override fun <T: ViewModel> create(modelClass:Class<T>): T {
        return QuestionActivityViewModel(position) as T
    }
}