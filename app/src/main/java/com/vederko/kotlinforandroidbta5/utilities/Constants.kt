package com.vederko.kotlinforandroidbta5.utilities

import com.vederko.kotlinforandroidbta5.R

const val PLAYER = "player"

object Constants {

    fun getQuestions(): ArrayList<Question> {

        val questionsList = arrayListOf<Question>()

    val EasyEnquestion1 = Question(
        id = 1,
        question = "A little girl lost her tomcat named Jackie in your neighborhood. Jackie has long whiskers, a striped tail, and green eyes. Which of these six tomcats is Jackie?",
        questionImage = R.drawable.pici,
        numberOfQuestions = 4,
        correctAnswer = 2,
        iconImage = R.drawable.slidedi,
        name = "name1",
        answerImage = R.drawable.answeri,
        answer ="The tomcat in the green box is the only one that fits the description.",
        hint = ""
    )

        questionsList.add(EasyEnquestion1)

    val que2 = Question(
        2,
        "Which item does not fit the sequence?",
        R.drawable.picii,
        3,
        3,
        R.drawable.slidedii,
        "name2",
        R.drawable.answerii,
        "The chocolate bar is the only item that is not a fruit.",
        ""
    )

        questionsList.add(que2)

    val que3 = Question(
        3,
        "Stephen, Luke, and Jeremy have swum across the lake by boats. Stephen's boat is not next to Luke's boat. What color is Jeremy's boat?",
        R.drawable.piciii,
        3,
        3,
        R.drawable.slidediii,
        "name3",
        R.drawable.answerii,
        "Jeremy's boat is blue, as it is the only option for Steven's boat not to be next to Luke's one.",
        ""
    )

        questionsList.add(que3)

    val que4 = Question(
        4,
        "Which shape comes next in this sequence?",
        R.drawable.piciv,
        3,
        2,
        R.drawable.slidediv,
        "name4",
        R.drawable.answeriv,
        "The answer is shown in the picture.",
        ""
    )

        questionsList.add(que4)

    val que5 = Question(
        5,
        "Which shape represents a union of two starting shapes?",
        R.drawable.picv,
        4,
        2,
        R.drawable.slidedv,
        "name5",
        R.drawable.answerv,
        "",
        ""
    )

        questionsList.add(que5)

    val que6 = Question(
        6,
        "As a competition winner, you have two options to collect your reward. You can take a bag with 75 coins and another third from this sum or take 2 bags of 50 coins each. Which option is more profitable? A. First option. B. Second option. C. The options are equivalent.",
        R.drawable.picvi,
        4,
        3,
        R.drawable.slidedvi,
        "name6",
        R.drawable.answervi,
        "75 + 75 x 1/3 = 75 + 25 = 100\n" +
                "50 + 50 = 100 -> the options are equivalent.",
        ""
    )

        questionsList.add(que6)

    val que7 = Question(
        7,
        "Which shape should replace the question mark?",
        R.drawable.picvii,
        4,
        2,
        R.drawable.slidedvii,
        "name7",
        R.drawable.answervii,
        "The number of corners increases from shape to shape. There should be a pentagon instead of a question mark.",
        ""
    )

        questionsList.add(que7)

    val que8 = Question(
        8,
        "Which shape comes next in this sequence?",
        R.drawable.picviii,
        4,
        1,
        R.drawable.slidedviii,
        "name8",
        R.drawable.answerviii,
        "Each next shape is rotated 90 degrees clockwise.",
        ""
    )

        questionsList.add(que8)

    val que9 = Question(
        9,
        "The pink circle is not in the top row; the blue star is in the purple frame. What shape is described in the puzzle?",
        R.drawable.picix,
        6,
        4,
        R.drawable.slidedix,
        "name9",
        R.drawable.answerix,
        "Only one shape fits the description.",
        ""
    )

        questionsList.add(que9)

    val que10 = Question(
        10,
        "Which shape of polyhedra net can be folded correctly to become a hexagonal prism (a 3D shape shown in the picture).",
        R.drawable.picx,
        4,
        4,
        R.drawable.slidedx,
        "name10",
        R.drawable.answerx,
        "Option B is not correct as it consists of too many flat figures. Option C has a wrong net that cannot be folded up to form the prism. The correct answer is option A.",
        ""
    )

        questionsList.add(que10)
        return questionsList
    }
}