package com.vederko.logicPuzzlesAndGames.utilities

data class Question (
    val id: Int,
    val question: String,
    val questionImage: Int,
    val numberOfQuestions: Int,
    val correctAnswer: Int,
    val iconImage: Int,
    val lockIconImage: Int,
    val name: String,
    val answerImage: Int,
    val answer: String,
    val hint: String?
    )