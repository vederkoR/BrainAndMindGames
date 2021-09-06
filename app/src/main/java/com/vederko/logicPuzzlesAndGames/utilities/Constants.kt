package com.vederko.logicPuzzlesAndGames.utilities

import com.vederko.logicPuzzlesAndGames.R

const val PLAYER = "player"
const val AD_UNIT_ID = "ca-app-pub-3940256099942544/5224354917"

object Constants {

    fun getPrizeLives(): List<Prize> {

        val prizeList = arrayListOf<Prize>()

        val prizeLive1 = Prize(
            id = 1,
            prizeImage = R.drawable.lprizei,
            livesBonus = 0,
            energyBonus = 0,
            pointsBonus = 1
        )
        prizeList.add(prizeLive1)

        val prizeLive2 = Prize(
            id = 2,
            prizeImage = R.drawable.lprizeii,
            livesBonus = 0,
            energyBonus = 0,
            pointsBonus = 3
        )
        prizeList.add(prizeLive2)

        val prizeLive3 = Prize(
            id = 3,
            prizeImage = R.drawable.lprizeiii,
            livesBonus = 0,
            energyBonus = 0,
            pointsBonus = 5
        )
        prizeList.add(prizeLive3)

        val prizeLive4 = Prize(
            id = 4,
            prizeImage = R.drawable.lprizeiv,
            livesBonus = 0,
            energyBonus = 1,
            pointsBonus = 2
        )
        prizeList.add(prizeLive4)

        val prizeLive5 = Prize(
            id = 5,
            prizeImage = R.drawable.lprizevv,
            livesBonus = 1,
            energyBonus = 0,
            pointsBonus = 1
        )
        prizeList.add(prizeLive5)

        val prizeLive6 = Prize(
            id = 6,
            prizeImage = R.drawable.lprizevi,
            livesBonus = 1,
            energyBonus = 1,
            pointsBonus = 5
        )
        prizeList.add(prizeLive6)

        val prizeLive7 = Prize(
            id = 7,
            prizeImage = R.drawable.lprizevii,
            livesBonus = 2,
            energyBonus = 0,
            pointsBonus = 0
        )
        prizeList.add(prizeLive7)

        val prizeLive8 = Prize(
            id = 8,
            prizeImage = R.drawable.lprizeviii,
            livesBonus = 0,
            energyBonus = 2,
            pointsBonus = 1
        )
        prizeList.add(prizeLive8)

        val prizeLive9 = Prize(
            id = 9,
            prizeImage = R.drawable.lprizeix,
            livesBonus = 0,
            energyBonus = 3,
            pointsBonus = 0
        )
        prizeList.add(prizeLive9)

        return prizeList.shuffled()
    }

    fun getEasyQuestions(): ArrayList<Question> {

        val questionsList = arrayListOf<Question>()

        val easyQuestion1 = Question(
            id = 1,
            question = " A little girl lost her tomcat named Jackie in your neighborhood. " +
                    "Jackie has long whiskers, a striped tail, and green eyes. Which of these" +
                    " six tomcats is Jackie? ",
            questionImage = R.drawable.easyquesi,
            numberOfQuestions =6,
            correctAnswer = 5,
            iconImage = R.drawable.easyiconi,
            lockIconImage = R.drawable.leasyiconi,
            name = "easy1",
            answerImage = R.drawable.easyansi,
            answer =" The tomcat in the green box is the only one that fits the description.",
            hint = " The first tomcat has short whiskers; the second one has hazel eyes ...")

        questionsList.add(easyQuestion1)

        val easyQuestion2 = Question(
            id = 2,
            question = " Which item does not fit the sequence?",
            questionImage = R.drawable.easyquesii,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconii,
            lockIconImage = R.drawable.leasyiconii,
            name = "easy2",
            answerImage = R.drawable.easyansii,
            answer =" The chocolate bar is the only item that is not a fruit.",
            hint = " A peach grows on a tree...")

        questionsList.add(easyQuestion2)

        val easyQuestion3 = Question(
            id = 3,
            question = " Stephen, Luke, and Jeremy have swum across the lake by boats. " +
                    "Stephen's boat is not next to Luke's boat. What color is Jeremy's boat?",
            questionImage = R.drawable.easyquesiii,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconiii,
            lockIconImage = R.drawable.leasyiconiii,
            name = "easy3",
            answerImage = R.drawable.easyansiii,
            answer =" Jeremy's boat is blue, as it is the only option for Steven's boat" +
                    " not to be next to Luke's one.",
            hint = " Stephen's boat is on the left ... or right ...")

        questionsList.add(easyQuestion3)

        val easyQuestion4 = Question(
            id = 4,
            question = " Which shape comes next in this sequence?",
            questionImage = R.drawable.easyquesiv,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconiv,
            lockIconImage = R.drawable.leasyiconiv,
            name = "easy4",
            answerImage = R.drawable.easyansiv,
            answer =" The answer is shown in the picture.",
            hint = " It contains 6...")

        questionsList.add(easyQuestion4)

        val easyQuestion5 = Question(
            id = 5,
            question = " Which shape represents a union of two starting shapes?",
            questionImage = R.drawable.easyquesv,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconv,
            lockIconImage = R.drawable.leasyiconv,
            name = "easy5",
            answerImage = R.drawable.easyansv,
            answer =" The answer is shown in the picture.",
            hint = " Assembly of 7 lines …")

        questionsList.add(easyQuestion5)

        val easyQuestion6 = Question(
            id = 6,
            question = "As a competition winner, you have two options to collect your reward. " +
                    "You can take a bag with 75 coins and another third from this sum or take 2" +
                    " bags of 50 coins each. Which option is more profitable? A. First option." +
                    " B. Second option. C. The options are equivalent.",
        questionImage = R.drawable.easyquesvi,
        numberOfQuestions = 3,
        correctAnswer = 3,
        iconImage = R.drawable.easyiconvi,
        lockIconImage = R.drawable.leasyiconvi,
        name = "easy6",
        answerImage = R.drawable.easyansvi,
        answer ="75 + 75 x 1/3 = 75 + 25 = 100 " +
                "50 + 50 = 100 -> the options are equivalent.",
        hint = " A third of 75 is 25...")

        questionsList.add(easyQuestion6)

        val easyQuestion7 = Question(
            id = 7,
            question = " Which shape should replace the question mark?",
            questionImage = R.drawable.easyquesvii,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconvii,
            lockIconImage = R.drawable.leasyiconvii,
            name = "easy7",
            answerImage = R.drawable.easyansvii,
            answer =" The number of corners increases from shape to shape. There should be a " +
                    "pentagon instead of a question mark.",
            hint = " Count the number of corners ...")

        questionsList.add(easyQuestion7)

        val easyQuestion8 = Question(
            id = 8,
            question = " Which shape comes next in this sequence?",
            questionImage = R.drawable.easyquesviii,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconviii,
            lockIconImage = R.drawable.leasyiconviii,
            name = "easy8",
            answerImage = R.drawable.easyansviii,
            answer =" Each next shape is rotated 90 degrees clockwise.",
            hint = " Color is of no significance…")

        questionsList.add(easyQuestion8)

        val easyQuestion9 = Question(
            id = 9,
            question = " The pink circle is not in the top row; the blue star is in the purple" +
                    " frame. What shape is described in the puzzle?",
            questionImage = R.drawable.easyquesix,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconix,
            lockIconImage = R.drawable.leasyiconix,
            name = "easy9",
            answerImage = R.drawable.easyansix,
            answer =" Only one shape fits the description.",
            hint = " Not D…")

        questionsList.add(easyQuestion9)

        val easyQuestion10 = Question(
            id = 10,
            question = " Which shape of polyhedra net can be folded correctly to become a" +
                    " hexagonal prism (a 3D shape shown in the picture)?",
            questionImage = R.drawable.easyquesx,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconx,
            lockIconImage = R.drawable.leasyiconx,
            name = "easy10",
            answerImage = R.drawable.easyansx,
            answer =" Option B is not correct as it consists of too many flat figures." +
                    " Option C has a wrong net that cannot be folded up to form the prism." +
                    " The correct answer is option A.",
            hint = " Count the number of faces…")

        questionsList.add(easyQuestion10)

        val easyQuestion11 = Question(
            id = 11,
            question = " The purple cube is shorter than the green one; the two blue " +
                    "cubes combined are equal in length to the purple and green ones combined." +
                    " What sequence of cubes is described in the puzzle?",
            questionImage = R.drawable.easyquesxi,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconxi,
            lockIconImage = R.drawable.leasyiconxi,
            name = "easy11",
            answerImage = R.drawable.easyansxi,
            "answer Only one sequence fits the description. The blue cube should be " +
                    "shorter than the green one and longer than the purple one. " +
                    "Then two blue cubes (medium in length) can be equal to the sum of " +
                    "the short purple and long green cubes.",
                    hint = " The blue one is in the middle ...")

        questionsList.add(easyQuestion11)

        val easyQuestion12 = Question(
            id = 12,
            question = " Which glass will be filled up first?",
            questionImage = R.drawable.easyquesxii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxii,
            lockIconImage = R.drawable.leasyiconxii,
            name = "easy12",
            answerImage = R.drawable.easyansxii,
            answer =" The liquid immediately drains through the lowest tap. The liquid is moving" +
                    " from the top glass to the left one and then into glass B.",
            hint = " Follow the taps…")

        questionsList.add(easyQuestion12)

        val easyQuestion13 = Question(
            id = 13,
            question = " Each robot collects screw-nuts only of its color. Which robot can" +
                    " collect the most screw-nuts?",
            questionImage = R.drawable.easyquesxiii,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxiii,
            lockIconImage = R.drawable.leasyiconxiii,
            name = "easy13",
            answerImage = R.drawable.easyansxiii,
            answer =" There are 9 pieces of green screw-nuts, 7 pieces of gray screw-nuts, " +
                    "and 5 pieces of purple screw-nuts. The answer is B, a green robot.",
            hint = " Count the number of screw-nuts…")

        questionsList.add(easyQuestion13)

        val easyQuestion14 = Question(
            id = 14,
            question = " Each shape is connected to a number. What number " +
                    "corresponds to the gray shape?",
            questionImage = R.drawable.easyquesxiv,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconxiv,
            lockIconImage = R.drawable.leasyiconxiv,
            name = "easy14",
            answerImage = R.drawable.easyansxiv,
            answer =" The number is equal to the number of sides of the shape multiplied by 3.",
            hint = " Count the sides…")

        questionsList.add(easyQuestion14)

        val easyQuestion15 = Question(
            id = 15,
            question = " How many triangles are shown in this figure?",
            questionImage = R.drawable.easyquesxv,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconxv,
            lockIconImage = R.drawable.leasyiconxv,
            name = "easy15",
            answerImage = R.drawable.easyansxv,
            answer =" The answer is shown in the picture.",
            hint = " The large triangle contains small ones…")

        questionsList.add(easyQuestion15)

        val easyQuestion16 = Question(
            id = 16,
            question = " The scientist was working in his laboratory when an accident" +
                    " happened: the power went out and the passages were blocked. " +
                    "He can only evacuate through a poisonous snake laboratory, " +
                    "a poison gas laboratory, or a power control room with frayed wires." +
                    " What should he choose?",
            questionImage = R.drawable.easyquesxvi,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxvi,
            lockIconImage = R.drawable.leasyiconxvi,
            name = "easy16",
            answerImage = R.drawable.easyansxvi,
            answer =" It is safe to evacuate through the power control room with bare wires," +
                    " there is no electricity!",
            hint = " Something important happened during the accident…")

        questionsList.add(easyQuestion16)

        val easyQuestion17 = Question(
            id = 17,
            question = " In which position on the hanging scale should the 16" +
                    " lb. weight be placed so that it balances the 8 lb. at the other " +
                    "end. An 8 lb weight hangs at a distance of 2 arbitrary units from the " +
                    "block, as shown in the figure.",
            questionImage = R.drawable.easyquesxvii,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconxvii,
            lockIconImage = R.drawable.leasyiconxvii,
            name = "easy17",
            answerImage = R.drawable.easyansxvii,
            answer =" Law of the lever: lever is balanced when the weight on one side " +
                    "multiplied by the length of its arm is equal to the weight on the " +
                    "opposite side multiplied by the length of its arm. To balance the 8 lb, " +
                    "the 16 lb weight must be hung in position #1.",
            hint = " Law of the lever…")

        questionsList.add(easyQuestion17)

        val easyQuestion18 = Question(
            id = 18,
            question = " Which side view (as indicated by the blue arrow) corresponds to " +
                    "the 3D shape shown in the picture?",
            questionImage = R.drawable.easyquesxviii,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconxviii,
            lockIconImage = R.drawable.leasyiconxviii,
            name = "easy18",
            answerImage = R.drawable.easyansxviii,
            answer =" The answer is shown in the picture.",
            hint = " The yellow one is on the left…")

        questionsList.add(easyQuestion18)

        val easyQuestion19 = Question(
            id = 19,
            question = " Which shape has only 2 flat faces?",
            questionImage = R.drawable.easyquesxix,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconxix,
            lockIconImage = R.drawable.leasyiconxix,
            name = "easy19",
            answerImage = R.drawable.easyansxix,
            answer =" Cylinder has 2 flat faces and 1 curved face..",
            hint = " Не вариант A…")

        questionsList.add(easyQuestion19)

        val easyQuestion20 = Question(
            id = 20,
            question = " Which is heavier a pound of bricks or a pound of cotton? A. " +
                    "A pound of bricks is heavier. B. A pound of cotton is heavier. C." +
                    " Both weigh the same.",
            questionImage = R.drawable.easyquesxx,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconxx,
            lockIconImage = R.drawable.leasyiconxx,
            name = "easy20",
            answerImage = R.drawable.easyansxx,
            answer =" The weight of an object and its mass are directly " +
                    "proportional. They weigh the same.",
            hint = " The weight of an object and its mass are directly proportional…")

        questionsList.add(easyQuestion20)

        val easyQuestion21 = Question(
            id = 21,
            question = "Which shape should replace the question mark?",
            questionImage = R.drawable.easyquesxxi,
            numberOfQuestions = 6,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconxxi,
            lockIconImage = R.drawable.leasyiconxxi,
            name = "easy21",
            answerImage = R.drawable.easyansxxi,
            answer ="The correct sector has the same pattern as the sector on the " +
                    "opposite side, but it is of a different color.",
                    hint = " Take a look at the opposite side…")

        questionsList.add(easyQuestion21)

        val easyQuestion22 = Question(
            id = 22,
            question = "John's house is not the tallest, and Alex's house is blue." +
                    " Nothing is known about Sam's house. What house does John live in?",
                    questionImage = R.drawable.easyquesxxii,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxxii,
            lockIconImage = R.drawable.leasyiconxxii,
            name = "easy22",
            answerImage = R.drawable.easyansxxii,
            answer =" Neither the tallest nor blue house is house B.",
            hint = " Neither the tallest nor blue…")

        questionsList.add(easyQuestion22)

        val easyQuestion23 = Question(
            id = 23,
            question = " Which key most probably fits the door?",
            questionImage = R.drawable.easyquesxxiii,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconxxiii,
            lockIconImage = R.drawable.leasyiconxxiii,
            name = "easy23",
            answerImage = R.drawable.easyansxxiii,
            answer =" An ancient door with an old keyhole plate may be " +
                    "opened with a set of golden keys on a ring.",
            hint = " Take a look at the keyhole...")

        questionsList.add(easyQuestion23)

        val easyQuestion24 = Question(
            id = 24,
            question = " Which of the prints can be made with the stamp " +
                    "shown in the center of the picture?",
            questionImage = R.drawable.easyquesxxiv,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.easyiconxxiv,
            lockIconImage = R.drawable.leasyiconxxiv,
            name = "easy24",
            answerImage = R.drawable.easyansxxiv,
            answer =" The answer is shown in the picture.",
            hint = " Flip it in your mind…")

        questionsList.add(easyQuestion24)

        val easyQuestion25 = Question(
            id = 25,
            question = " Which glass contains the most water?",
            questionImage = R.drawable.easyquesxxv,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxxv,
            lockIconImage = R.drawable.leasyiconxxv,
            name = "easy25",
            answerImage = R.drawable.easyansxxv,
            answer =" The larger the item, the less water is in the glass. The coin " +
                    "is the smallest, and the glass with the coin contains the most water.",
            hint = " The cellphone is huge, but the coin is tiny...")

        questionsList.add(easyQuestion25)

        val easyQuestion26 = Question(
            id = 26,
            question = " Which pirate will get to the treasure chest faster than the others," +
                    " provided that each of them moves along the optimal and correct path?",
            questionImage = R.drawable.easyquesxxvi,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxxvi,
            lockIconImage = R.drawable.leasyiconxxvi,
            name = "easy26",
            answerImage = R.drawable.easyansxxvi,
            answer =" The answer is shown in the picture.",
            hint = " Plot 3 routes and compare them…")

        questionsList.add(easyQuestion26)

        val easyQuestion27 = Question(
            id = 27,
            question = " Based on the analogy from the first row, answer which two" +
                    " paper airplanes were selected from the second rectangle.",
            questionImage = R.drawable.easyquesxxvii,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconxxvii,
            lockIconImage = R.drawable.leasyiconxxvii,
            name = "easy27",
            answerImage = R.drawable.easyansxxvii,
            answer =" The fewest paper planes were selected from the rectangles. Then, " +
                    "the paper planes were turned over.",
            hint = " There are fewer of them ...")

        questionsList.add(easyQuestion27)

        val easyQuestion28 = Question(
            id = 28,
            question = " Which pairs do not fit the sequence?",
            questionImage = R.drawable.easyquesxxviii,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconxxviii,
            lockIconImage = R.drawable.leasyiconxxviii,
            name = "easy28",
            answerImage = R.drawable.easyansxxviii,
            answer =" Clocks # 2 and # 4 show the same time.",
            hint = " Look at the time…")

        questionsList.add(easyQuestion28)

        val easyQuestion29 = Question(
            id = 29,
            question = " What square should be instead of the question mark?",
            questionImage = R.drawable.easyquesxxix,
            numberOfQuestions = 6,
            correctAnswer = 6,
            iconImage = R.drawable.easyiconxxix,
            lockIconImage = R.drawable.leasyiconxxix,
            name = "easy29",
            answerImage = R.drawable.easyansxxix,
            answer =" There is no order in the sequence, but all shapes contain 2 turquoise" +
                    " squares (the number of colors is preserved).",
            hint = " There is no order…")

        questionsList.add(easyQuestion29)

        val easyQuestion30 = Question(
            id = 30,
            question = " Which playing card comes next in this sequence?",
            questionImage = R.drawable.easyquesxxx,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxxx,
            lockIconImage = R.drawable.leasyiconxxx,
            name = "easy30",
            answerImage = R.drawable.easyansxxx,
            answer =" The transition from red suit to red suit or from black suit to black " +
                    "suit increases the rank of the card by 2. The transition from black to red" +
                    " and vice versa increases the rank of the card by 1. The suits are in order.",
            hint = " The suits are in order. There is logic in the ranks ...")

        questionsList.add(easyQuestion30)

        val easyQuestion31 = Question(
            id = 31,
            question = " Which number comes next in this sequence?",
            questionImage = R.drawable.easyquesxxxi,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxxxi,
            lockIconImage = R.drawable.leasyiconxxxi,
            name = "easy31",
            answerImage = R.drawable.easyansxxxi,
            answer =" The answer is shown in the picture.",
            hint = " Progressive increase of increase… ")

        questionsList.add(easyQuestion31)

        val easyQuestion32 = Question(
            id = 32,
            question = " Each shape corresponds to a one-digit number between 0 and 9. The sums" +
                    " of the corresponding numbers are shown in equations 1-3. What number" +
                    " corresponds to an octagon?",
            questionImage = R.drawable.easyquesxxxii,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.easyiconxxxii,
            lockIconImage = R.drawable.leasyiconxxxii,
            name = "easy32",
            answerImage = R.drawable.easyansxxxii,
            answer =" The answer is shown in the picture.",
            hint = " The blue star = 2…")

        questionsList.add(easyQuestion32)

        val easyQuestion33 = Question(
            id = 33,
            question = " Which number should replace the question mark?",
            questionImage = R.drawable.easyquesxxxiii,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.easyiconxxxiii,
            lockIconImage = R.drawable.leasyiconxxxiii,
            name = "easy33",
            answerImage = R.drawable.easyansxxxiii,
            answer =" Add all the numbers around the edges to find the center one.",
            hint = " Add…")

        questionsList.add(easyQuestion33)

        val easyQuestion34 = Question(
            id = 34,
            question = " What sequence of mathematical operations should be placed instead" +
                    " of the question marks for the equation to be true?",
            questionImage = R.drawable.easyquesxxxiv,
            numberOfQuestions = 6,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconxxxiv,
            lockIconImage = R.drawable.leasyiconxxxiv,
            name = "easy34",
            answerImage = R.drawable.easyansxxxiv,
            answer =" Only one sequence is correct.",
            hint = " Do not divide…")

        questionsList.add(easyQuestion34)

        val easyQuestion35 = Question(
            id = 35,
            question = " Which shape should replace the question mark?",
            questionImage = R.drawable.easyquesxxxv,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxxxv,
            lockIconImage = R.drawable.leasyiconxxxv,
            name = "easy35",
            answerImage = R.drawable.easyansxxxv,
            answer =" The forward and reverse sequences alternate.",
            hint = " Not violet…")

        questionsList.add(easyQuestion35)

        val easyQuestion36 = Question(
            id = 36,
            question = " Which shape comes next in this sequence?",
            questionImage = R.drawable.easyquesxxxvi,
            numberOfQuestions = 3,
            correctAnswer =1,
            iconImage = R.drawable.easyiconxxxvi,
            lockIconImage = R.drawable.leasyiconxxxvi,
            name = "easy36",
            answerImage = R.drawable.easyansxxxvi,
            answer =" Every N-pointed star is followed by an (N+2)-pointed star.",
            hint = " Count the points…")

        questionsList.add(easyQuestion36)

        val easyQuestion37 = Question(
            id = 37,
            question = " Steve has two friends; Lorenz is friends with Steve. Joe" +
                    " is hiding under the letter B. Where is Mark?",
            questionImage = R.drawable.easyquesxxxvii,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconxxxvii,
            lockIconImage = R.drawable.leasyiconxxxvii,
            name = "easy37",
            answerImage = R.drawable.easyansxxxvii,
            answer =" Letter B is Joe. Consequently, letters C and D are Steve and Lorenz" +
                    ", respectively. Neither Steve nor Lorenz could be A, as in this case, " +
                    "they would not be friends. The answer is A.",
            hint = " Use the process of elimination…")

        questionsList.add(easyQuestion37)

        val easyQuestion38 = Question(
            id = 38,
            question = " One loaf of bread costs one dollar and half a loaf. How much" +
                    " is a whole loaf of bread worth in dollars?",
            questionImage = R.drawable.easyquesxxxviii,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconxxxviii,
            lockIconImage = R.drawable.leasyiconxxxviii,
            name = "easy38",
            answerImage = R.drawable.easyansxxxviii,
            answer =" The answer is shown in the picture.",
            hint = " Create an equation…")

        questionsList.add(easyQuestion38)

        val easyQuestion39 = Question(
            id = 39,
            question = " Which shape should replace the question mark?",
            questionImage = R.drawable.easyquesxxxix,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconxxxix,
            lockIconImage = R.drawable.leasyiconxxxix,
            name = "easy39",
            answerImage = R.drawable.easyansxxxix,
            answer =" Every moon is under the octagon. Every octagon is below the" +
                    " circle. Every circle is under the moon.",
            hint = " All shapes are in equal quantities…")

        questionsList.add(easyQuestion39)

        val easyQuestion40 = Question(
            id = 40,
            question = " Take a look at the dice and their corresponding numbers" +
                    " and answer which number should correspond to the third dice.",
            questionImage = R.drawable.easyquesxl,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconxl,
            lockIconImage = R.drawable.leasyiconxl,
            name = "easy40",
            answerImage = R.drawable.easyansxl,
            answer =" Add up all the values that you see on the dice. 6 + 4 + 5 = 15",
            hint = " Only the visible sides are important...")

        questionsList.add(easyQuestion40)

        val easyQuestion41 = Question(
            id = 41,
            question = " Which of the following shapes does not fit the sequence?",
            questionImage = R.drawable.easyquesxli,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxli,
            lockIconImage = R.drawable.leasyiconxli,
            name = "easy41",
            answerImage = R.drawable.easyansxli,
            answer =" Only one shape is flat.",
            hint = " Not complex enough...")

        questionsList.add(easyQuestion41)

        val easyQuestion42 = Question(
            id = 42,
            question = " Find an analogy and replace the question mark.",
            questionImage = R.drawable.easyquesxlii,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxlii,
            lockIconImage = R.drawable.leasyiconxlii,
            name = "easy42",
            answerImage = R.drawable.easyansxlii,
            answer =" Both ice skates and a boat are means of transportation.",
            hint = " Means…")

        questionsList.add(easyQuestion42)

        val easyQuestion43 = Question(
            id = 43,
            question = "Which of the following shapes does not fit the sequence?",
                    questionImage = R.drawable.easyquesxliii,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconxliii,
            lockIconImage = R.drawable.leasyiconxliii,
            name = "easy43",
            answerImage = R.drawable.easyansxliii,
            answer =" Only one shape does not contain any circular face.",
            hint = " Look at the faces ...")

        questionsList.add(easyQuestion43)

        val easyQuestion44 = Question(
            id = 44,
            question = " Which playing card comes next in this sequence?",
            questionImage = R.drawable.easyquesxliv,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconxliv,
            lockIconImage = R.drawable.leasyiconxliv,
            name = "easy44",
            answerImage = R.drawable.easyansxliv,
            answer =" Two sequences alternate. We need the growing one.",
            hint = " There are two sequences here.")

        questionsList.add(easyQuestion44)

        val easyQuestion45 = Question(
            id = 45,
            question = " Find an analogy and replace the question mark.",
            questionImage = R.drawable.easyquesxlv,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconxlv,
            lockIconImage = R.drawable.leasyiconxlv,
            name = "easy45",
            answerImage = R.drawable.easyansxlv,
            answer =" Both the pyramid and cone have a base. There is a point " +
                    "above the base, which is the apex for both the side faces in the " +
                    "pyramid and the lateral surface of the cone.",
            hint = " Find common elements ... ")

        questionsList.add(easyQuestion45)

        val easyQuestion46 = Question(
            id = 46,
            question = " There are paths between points 1 and 0 that go through " +
                    "points 2, 3, 4, and 5 and lead only in the direction indicated by " +
                    "the arrows. How many different paths (e.g. 1 → 2 → 0) are" +
                    " there between points 1 and 0?",
            questionImage = R.drawable.easyquesxlvi,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.easyiconxlvi,
            lockIconImage = R.drawable.leasyiconxlvi,
            name = "easy46",
            answerImage = R.drawable.easyansxlvi,
            answer =" The answer is shown in the picture.",
            hint = " Calculate possible paths...")

        questionsList.add(easyQuestion46)

        val easyQuestion47 = Question(
            id = 47,
            question = " Each cup has its serial number. Select the correct sequence of" +
                    " numbers for the cups as they are ordered in the picture.",
            questionImage = R.drawable.easyquesxlvii,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.easyiconxlvii,
            lockIconImage = R.drawable.leasyiconxlvii,
            name = "easy47",
            answerImage = R.drawable.easyansxlvii,
            answer =" Follow the arrows and write down the numbers in the order of the cups.",
            hint = " Follow the arrows…")

        questionsList.add(easyQuestion47)

        val easyQuestion48 = Question(
            id = 48,
            question = " Each circle is linked with one or more other circles (by red lines). " +
                    "Count the number of circles that have only two connections.",
            questionImage = R.drawable.easyquesxlviii,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.easyiconxlviii,
            lockIconImage = R.drawable.leasyiconxlviii,
            name = "easy48",
            answerImage = R.drawable.easyansxlviii,
            answer =" The answer is shown in the picture.",
            hint = " No need to count all circles...")

        questionsList.add(easyQuestion48)

        val easyQuestion49 = Question(
            id = 49,
            question = " Murder. A famous magician was killed in a restaurant. The only clue is" +
                    " the playing card found in the magician's hand. There are a few suspects: " +
                    "a plump chef (A); a waitress, a spectacular blonde with an average height" +
                    " (B); a dark-haired middle-aged cleaning lady (C). Who is the killer?",
            questionImage = R.drawable.easyquesxlix,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconxlix,
            lockIconImage = R.drawable.leasyiconxlix,
            name = "easy49",
            answerImage = R.drawable.easyansxlix,
            answer =" The murderer is the dark-haired cleaning lady. The Queen of Spades" +
                    " has dark hair, and she is female.",
            hint = " Look at the playing card...")

        questionsList.add(easyQuestion49)

        val easyQuestion50 = Question(
            id = 50,
            question = "Which shape comes next in this sequence?",
            questionImage = R.drawable.easyquesl,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconl,
            lockIconImage = R.drawable.leasyiconl,
            name = "easy50",
            answerImage = R.drawable.easyansl,
            answer ="The answer is shown in the picture.",
            hint = "The inner ball moves clockwise in a logical sequence...")

        questionsList.add(easyQuestion50)

        val easyQuestion51 = Question(
            id = 51,
            question = " What color is the most?",
            questionImage = R.drawable.easyquesli,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.easyiconli,
            lockIconImage = R.drawable.leasyiconli,
            name = "easy51",
            answerImage = R.drawable.easyansli,
            answer =" The answer is shown in the picture.",
            hint = " Count how many cubes ...")

        questionsList.add(easyQuestion51)

        val easyQuestion52 = Question(
            id = 52,
            question = " Which two caterpillars are identical?",
            questionImage = R.drawable.easyqueslii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.easyiconlii,
            lockIconImage = R.drawable.leasyiconlii,
            name = "easy52",
            answerImage = R.drawable.easyanslii,
            answer =" The answer is shown in the picture.",
            hint = " Horns come first...")

        questionsList.add(easyQuestion52)

        val easyQuestion53 = Question(
            id = 53,
            question = " Each shape corresponds to a one-digit number between 0 " +
                    "and 9. The sums of the corresponding numbers are shown in equations" +
                    " 1-3. What number corresponds to the sum of shapes in equations #4?",
            questionImage = R.drawable.easyquesliii,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.easyiconliii,
            lockIconImage = R.drawable.leasyiconliii,
            name = "easy53",
            answerImage = R.drawable.easyansliii,
            answer =" The answer is shown in the picture.",
            hint = " Create an equation…")

        questionsList.add(easyQuestion53)


        return questionsList
    }

    fun getNormalQuestions(): ArrayList<Question> {
        val questionsList = arrayListOf<Question>()

        val normalQuestion1 = Question(
            id = 1,
            question = " Which letter stands for the exit from the maze," +
                    " provided that the transition from line to line is impossible" +
                    " if they are split with a solid black line.",
            questionImage = R.drawable.normalquesi,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconi,
            lockIconImage = R.drawable.lnormaliconi,
            name = "normal1",
            answerImage = R.drawable.normalansi,
            answer =" The answer is shown in the picture.",
            hint = " Follow the path from start to finish...")

        questionsList.add(normalQuestion1)

        val normalQuestion2 = Question(
            id = 2,
            question = " Which key fits the door?",
            questionImage = R.drawable.normalquesii,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconii,
            lockIconImage = R.drawable.lnormaliconii,
            name = "normal2",
            answerImage = R.drawable.normalansii,
            answer =" Only one key has the same set of small design elements as the door.",
            hint = " God is in the details…")

        questionsList.add(normalQuestion2)

        val normalQuestion3 = Question(
            id = 3,
            question = " Which two bells will ring if the lever is " +
                    "pulled in the direction indicated by the blue arrow?",
            questionImage = R.drawable.normalquesiii,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconiii,
            lockIconImage = R.drawable.lnormaliconiii,
            name = "normal3",
            answerImage = R.drawable.normalansiii,
            answer =" The answer is shown in the picture.",
            hint = " One is forward the second is backward...")

        questionsList.add(normalQuestion3)

        val normalQuestion4 = Question(
            id = 4,
            question = " Which of the following shapes does not fit the sequence?",
            questionImage = R.drawable.normalquesiv,
            numberOfQuestions =6,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconiv,
            lockIconImage = R.drawable.lnormaliconiv,
            name = "normal4",
            answerImage = R.drawable.normalansiv,
            answer =" Shape #6 has a small detail (indicated by a red arrow) that " +
                    "does not fit the other shapes in the column.",
            hint = " Look at the small elements in the columns ...")

        questionsList.add(normalQuestion4)

        val normalQuestion5 = Question(
            id = 5,
            question = " Which fruit is the fifth to the right of the fruit, " +
                    "which is the third to the left of the fruit, which is the first " +
                    "to the right of the fruit, which is the fourth to the left of the " +
                    "purple fruit?",
            questionImage = R.drawable.normalquesv,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.normaliconv,
            lockIconImage = R.drawable.lnormaliconv,
            name = "normal5",
            answerImage = R.drawable.normalansv,
            answer =" The answer is shown in the picture.",
            hint = " The fourth to the left of the purple fruit is an orange…")

        questionsList.add(normalQuestion5)

        val normalQuestion6 = Question(
            id = 6,
            question = " Which three cards are described? All cards are of different suits," +
                    " and all of them are not hearts. There is at least one jack to the " +
                    "right of the ten. One of the cards is a jack with a suit different from" +
                    " the diamonds, and the other is a ten of spades. ",
            questionImage = R.drawable.normalquesvi,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.normaliconvi,
            lockIconImage = R.drawable.lnormaliconvi,
            name = "normal6",
            answerImage = R.drawable.normalansvi,
            answer =" Only one combination of cards fits the description.",
            hint = " Use the process of elimination…")

        questionsList.add(normalQuestion6)

        val normalQuestion7 = Question(
            id = 7,
            question = " Joe, Mike, Harry, and Jim are Jennifer's admirers. Each gave " +
                    "Jennifer a present. Jim did not give Jennifer a perfume or a ring." +
                    " Joe did not give Jennifer flowers, and Harry did not give Jennifer " +
                    "a ring. Mike gave her a phone. What did Joe give Jennifer?",
            questionImage = R.drawable.normalquesvii,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.normaliconvii,
            lockIconImage = R.drawable.lnormaliconvii,
            name = "normal7",
            answerImage = R.drawable.normalansvii,
            answer =" Mike gave Jennifer a phone. So Jim gave her flowers as he couldn't " +
                    "give her the rest of the presents. Harry gave perfume because the flowers" +
                    " and the phone had already been given by others, and he could not give the" +
                    " ring. Joe gave Jennifer the last item (the ring).",
            hint = " Use the process of elimination…")

        questionsList.add(normalQuestion7)

        val normalQuestion8 = Question(
            id = 8,
            question = " Which number comes next in this sequence?",
            questionImage = R.drawable.normalquesviii,
            numberOfQuestions = 6,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconviii,
            lockIconImage = R.drawable.lnormaliconviii,
            name = "normal8",
            answerImage = R.drawable.normalansviii,
            answer =" The answer is shown in the picture. A Fibonacci series " +
                    "with initial elements \"5\" and \"7\".",
            hint = " Each number is connected with several others...")

        questionsList.add(normalQuestion8)

        val normalQuestion9 = Question(
            id = 9,
            question = " Which color is missing?",
            questionImage = R.drawable.normalquesix,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconix,
            lockIconImage = R.drawable.lnormaliconix,
            name = "normal9",
            answerImage = R.drawable.normalansix,
            answer =" It is a rainbow; a green color is missing.",
            hint = " A natural phenomenon…")

        questionsList.add(normalQuestion9)

        val normalQuestion10 = Question(
            id = 10,
            question = " Which shape should replace the question mark?",
            questionImage = R.drawable.normalquesx,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconx,
            lockIconImage = R.drawable.lnormaliconx,
            name = "normal10",
            answerImage = R.drawable.normalansx,
            answer =" The green hexagon will be present in the 3rd shape if it is present" +
                    " in at least one of the two previous shapes. ",
            hint = " The first and the second define the third...")

        questionsList.add(normalQuestion10)

        val normalQuestion11 = Question(
            id = 11,
            question = " What figure(s) belongs to the circle and the triangle but does " +
                    "not belong to the square.",
            questionImage = R.drawable.normalquesxi,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.normaliconxi,
            lockIconImage = R.drawable.lnormaliconxi,
            name = "normal11",
            answerImage = R.drawable.normalansxi,
            answer =" Only the turquoise circle satisfies the conditions ...",
            hint = " Not F ...")

        questionsList.add(normalQuestion11)

        val normalQuestion12 = Question(
            id = 12,
            question = " Three hens lay 4 eggs in two days. How many eggs will " +
                    "four hens lay in 6 days?",
            questionImage = R.drawable.normalquesxii,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.normaliconxii,
            lockIconImage = R.drawable.lnormaliconxii,
            name = "normal12",
            answerImage = R.drawable.normalansxii,
            answer =" Three hens lay 4 eggs in 2 days. Three hens will lay 3 times " +
                    "more (12 eggs) in 6 days. One hen will lay 3 times less in 6 days than " +
                    "3 chickens (4 eggs). So four hens will lay 4 times more than one (16 eggs).",
            hint = " A simple series of calculations...")

        questionsList.add(normalQuestion12)

        val normalQuestion13 = Question(
            id = 13,
            question = " Each way contains a number indicating the number of obstacles " +
                    "along this way. What is the total number of obstacles from start to " +
                    "finish for the most optimal path? The optimal path has the least " +
                    "number of obstacles.",
            questionImage = R.drawable.normalquesxiii,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxiii,
            lockIconImage = R.drawable.lnormaliconxiii,
            name = "normal13",
            answerImage = R.drawable.normalansxiii,
            answer =" The answer is shown in the picture.",
            hint = " The optimal path can be very long...")

        questionsList.add(normalQuestion13)

        val normalQuestion14 = Question(
            id = 14,
            question = " Which shape should replace the question mark?",
            questionImage = R.drawable.normalquesxiv,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconxiv,
            lockIconImage = R.drawable.lnormaliconxiv,
            name = "normal14",
            answerImage = R.drawable.normalansxiv,
            answer =" The answer is shown in the picture.",
            hint = " Look at the small elements in the row ...")

        questionsList.add(normalQuestion14)

        val normalQuestion15 = Question(
            id = 15,
            question = " How many small purple cubes compose the corner of the large" +
                    " cube (see a picture)?",
            questionImage = R.drawable.normalquesxv,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconxv,
            lockIconImage = R.drawable.lnormaliconxv,
            name = "normal15",
            answerImage = R.drawable.normalansxv,
            answer =" The answer is shown in the picture. ",
            hint = " Arrange in layers...")

        questionsList.add(normalQuestion15)

        val normalQuestion16 = Question(
            id = 16,
            question = " Which shape should come next in this sequence?",
            questionImage = R.drawable.normalquesxvi,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.normaliconxvi,
            lockIconImage = R.drawable.lnormaliconxvi,
            name = "normal16",
            answerImage = R.drawable.normalansxvi,
            answer =" Order: large, small, large... Order: two dark, one light... " +
                    "The answer is shown in the picture.",
            hint = " Two orders…")

        questionsList.add(normalQuestion16)

        val normalQuestion17 = Question(
            id = 17,
            question = " Which switch lights the bulb?",
            questionImage = R.drawable.normalquesxvii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxvii,
            lockIconImage = R.drawable.lnormaliconxvii,
            name = "normal17",
            answerImage = R.drawable.normalansxvii,
            answer =" The answer is shown in the picture.",
            hint = " Follow the wire…")

        questionsList.add(normalQuestion17)

        val normalQuestion18 = Question(
            id = 18,
            question = " Which shape is a top view of this pyramid?",
            questionImage = R.drawable.normalquesxviii,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxviii,
            lockIconImage = R.drawable.lnormaliconxviii,
            name = "normal18",
            answerImage = R.drawable.normalansxviii,
            answer =" The red lines (edges of the pyramid) should form the diagonal of the " +
                    "square, which is true only for option B.",
            hint = " Look at the red...")

        questionsList.add(normalQuestion18)

        val normalQuestion19 = Question(
            id = 19,
            question = " Find an analogy and replace the question mark.",
            questionImage = R.drawable.normalquesxix,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconxix,
            lockIconImage = R.drawable.lnormaliconxix,
            name = "normal19",
            answerImage = R.drawable.normalansxix,
            answer =" The answer is shown in the picture.",
            hint = " Repeat the same for every…")

        questionsList.add(normalQuestion19)

        val normalQuestion20 = Question(
            id = 20,
            question = " There are paths between points 1 and 0 that go through points " +
                    "2, 3, and 4 and lead only in the direction indicated by the arrows. " +
                    "How many different paths (e.g. 1-> 2-> 0) are there between points 1 and 0?",
            questionImage = R.drawable.normalquesxx,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.normaliconxx,
            lockIconImage = R.drawable.lnormaliconxx,
            name = "normal20",
            answerImage = R.drawable.normalansxx,
            answer =" The answer is shown in the picture.",
            hint = " Calculate possible paths...")

        questionsList.add(normalQuestion20)

        val normalQuestion21 = Question(
            id = 21,
            question = " Mirks from planet Charma always jurvate when they don't varlate. " +
                    "What is true about mirks? A. Mirks are always jurvating or/and varlating. " +
                    "B. Mirks are only engaged in jurvating and varlating and do nothing else. " +
                    "C. Mirks cannot simultaneously varlate and jurvate. D. Mirks are of " +
                    "three sexes.",
            questionImage = R.drawable.normalquesxxi,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconxxi,
            lockIconImage = R.drawable.lnormaliconxxi,
            name = "normal21",
            answerImage = R.drawable.normalansxxi,
            answer =" It is true that mirks always jurvate and/or varlate, because there is" +
                    " no such moment that they would not have been doing at least one of " +
                    "these two activities. They can do something at the same time.",
            hint = " The answer is related to the first sentence of the task...")

        questionsList.add(normalQuestion21)

        val normalQuestion22 = Question(
            id = 22,
            question = " Which shape should come next in this sequence?",
            questionImage = R.drawable.normalquesxxii,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxxii,
            lockIconImage = R.drawable.lnormaliconxxii,
            name = "normal22",
            answerImage = R.drawable.normalansxxii,
            answer =" There are only 2 alternating positions for a square. The circle is " +
                    "located in every second segment clockwise.",
            hint = " There are different logics behind placing squares and circles.")

        questionsList.add(normalQuestion22)

        val normalQuestion23 = Question(
            id = 23,
            question = " One box contains blue cubes, the second box contains green cubes, " +
                    "and the third box contains blue and green cubes. The boxes are painted " +
                    "in a color that does NOT match the contents. From which box should you " +
                    "take one cube at random to determine which cubes are in each box?",
            questionImage = R.drawable.normalquesxxiii,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconxxiii,
            lockIconImage = R.drawable.lnormaliconxxiii,
            name = "normal23",
            answerImage = R.drawable.normalansxxiii,
            answer =" The cube should be taken from a multi-colored box.  If, for example, " +
                    "you pull out a green cube from it, then there are neither blue nor green " +
                    "cubes in the blue box. Therefore, it contains mixed cubes. There are blue " +
                    "cubes in the green box.",
            hint = " There are only three options...")

        questionsList.add(normalQuestion23)

        val normalQuestion24 = Question(
            id = 24,
            question = " Which domino bone should replace the question mark?",
            questionImage = R.drawable.normalquesxxiv,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconxxiv,
            lockIconImage = R.drawable.lnormaliconxxiv,
            name = "normal24",
            answerImage = R.drawable.normalansxxiv,
            answer =" The value of each half increases by 1 until it comes to a value of" +
                    " 6, followed by a value of 0.",
            hint = " Two halves…")

        questionsList.add(normalQuestion24)

        val normalQuestion25 = Question(
            id = 25,
            question = " Lieman always lies; Trueman always speaks the truth." +
                    " Trueman looks from above and says that he sees a red ring." +
                    " Lieman looks from the side and says that the red ring is the" +
                    " largest. Which shape matches their description?",
            questionImage = R.drawable.normalquesxxv,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconxxv,
            lockIconImage = R.drawable.lnormaliconxxv,
            name = "normal25",
            answerImage = R.drawable.normalansxxv,
            answer =" Only one shape fits the description.",
            hint = " Use the process of elimination…")

        questionsList.add(normalQuestion25)

        val normalQuestion26 = Question(
            id = 26,
            question = " Each shape corresponds to a one-digit number " +
                    "between 0 and 9. The sums of the corresponding numbers are shown " +
                    "in equations 1-3. Which number should replace the question mark for " +
                    "all equations to be true?",
            questionImage = R.drawable.normalquesxxvi,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconxxvi,
            lockIconImage = R.drawable.lnormaliconxxvi,
            name = "normal26",
            answerImage = R.drawable.normalansxxvi,
            answer =" The answer is shown in the picture.",
            hint = " Create an equation…")

        questionsList.add(normalQuestion26)

        val normalQuestion27 = Question(
            id = 27,
            question = " Which fragment was cut from the mosaic?",
            questionImage = R.drawable.normalquesxxvii,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconxxvii,
            lockIconImage = R.drawable.lnormaliconxxvii,
            name = "normal27",
            answerImage = R.drawable.normalansxxvii,
            answer =" The cutout fragment should contain yellow bricks, which " +
                    "are adjoined with gray ones.",
            hint = " Consider the sequence of the bricks in each row...")

        questionsList.add(normalQuestion27)

        val normalQuestion28 = Question(
            id = 28,
            question = " Which shape should replace the question mark?",
            questionImage = R.drawable.normalquesxxviii,
            numberOfQuestions = 6,
            correctAnswer = 6,
            iconImage = R.drawable.normaliconxxviii,
            lockIconImage = R.drawable.lnormaliconxxviii,
            name = "normal28",
            answerImage = R.drawable.normalansxxviii,
            answer =" Green is under red. A square is under a triangle. Only " +
                    "one option contains a green square.",
            hint = " Break the task down into 3 easier tasks...")

        questionsList.add(normalQuestion28)

        val normalQuestion29 = Question(
            id = 29,
            question = " Joe and Leo played tennis. The stake in each game was $2. Leo has " +
                    "won 3 games and Joe has won $8. How many games have been played?",
            questionImage = R.drawable.normalquesxxix,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxxix,
            lockIconImage = R.drawable.lnormaliconxxix,
            name = "normal29",
            answerImage = R.drawable.normalansxxix,
            answer =" Leo won 3 games. Joe won back 3 games to equalize and won 4 more " +
                    "games to earn $8. A total is 10 games.",
            hint = " Create an equation…")

        questionsList.add(normalQuestion29)

        val normalQuestion30 = Question(
            id = 30,
            question = " Which shape does not fit the sequence? ",
            questionImage = R.drawable.normalquesxxx,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.normaliconxxx,
            lockIconImage = R.drawable.lnormaliconxxx,
            name = "normal30",
            answerImage = R.drawable.normalansxxx,
            answer =" Only one shape contains identical elements which are not directly " +
                    "linked by a line and are not next to each other.",
            hint = " Link identical...")

        questionsList.add(normalQuestion30)

        val normalQuestion31 = Question(
            id = 31,
            question = " Each card, depending on its rank and suit, has its numeric " +
                    "value (see an example for the jack of hearts). Using information " +
                    "about the values for other cards, select the value for the queen of clubs.",
            questionImage = R.drawable.normalquesxxxi,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconxxxi,
            lockIconImage = R.drawable.lnormaliconxxxi,
            name = "normal31",
            answerImage = R.drawable.normalansxxxi,
            answer =" Comparing the \"Sixes\", it can be seen that the \"Diamonds\" are equal " +
                    "to four \"Spades\". Also comparing the \"Fives\", it can be seen that the" +
                    " \"Clubs\" are equal to six spades ( or 1.5 \"Diamonds\"). 44 x 1.5 = 66.",
            hint = " Compare all possible card pairs...")

        questionsList.add(normalQuestion31)

        val normalQuestion32 = Question(
            id = 32,
            question = " Each shape corresponds to a one-digit number between 0 and 9. A" +
                    " combination of two shapes corresponds to a two-digit number, and a" +
                    " combination of 3 shapes corresponds to a three-digit one. What number " +
                    "corresponds to the gray shape?",
            questionImage = R.drawable.normalquesxxxii,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconxxxii,
            lockIconImage = R.drawable.lnormaliconxxxii,
            name = "normal32",
            answerImage = R.drawable.normalansxxxii,
            answer =" For equation # 1 to be true, the star can only be 0, 5, and 6. The " +
                    "circle is 0, 1, or 2 (if the circle is more than 2, equation #2 would" +
                    " give a four-digit number). The circle is 1 and the star is 5 by the " +
                    "process of elimination. Then the octagon is 2, and the month is" +
                    " 3 (12 * 25 = 300).",
            hint = " From 0 to 9, when squared, retains itself as the last digit ...")

        questionsList.add(normalQuestion32)

        val normalQuestion33 = Question(
            id = 33,
            question = " If I. is a set of triangles, and II. is a set of non-red figures," +
                    " then which shape belongs to their intersection?",
            questionImage = R.drawable.normalquesxxxiii,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconxxxiii,
            lockIconImage = R.drawable.lnormaliconxxxiii,
            name = "normal33",
            answerImage = R.drawable.normalansxxxiii,
            answer =" Not red (green) diamond.",
            hint = " Not red…")

        questionsList.add(normalQuestion33)

        val normalQuestion34 = Question(
            id = 34,
            question = " Which notes on the grand staff are logically ordered?",
            questionImage = R.drawable.normalquesxxxiv,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconxxxiv,
            lockIconImage = R.drawable.lnormaliconxxxiv,
            name = "normal34",
            answerImage = R.drawable.normalansxxxiv,
            answer =" The answer is shown in the picture.",
            hint = " Not all notes look the same …")

        questionsList.add(normalQuestion34)

        val normalQuestion35 = Question(
            id = 35,
            question = " Which two patterns can interconvert just by rotations?",
            questionImage = R.drawable.normalquesxxxv,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.normaliconxxxv,
            lockIconImage = R.drawable.lnormaliconxxxv,
            name = "normal35",
            answerImage = R.drawable.normalansxxxv,
            answer =" The answer is shown in the picture.",
            hint = " Mental rotation skills are important here...")

        questionsList.add(normalQuestion35)

        val normalQuestion36 = Question(
            id = 36,
            question = " Which number should replace the question mark?",
            questionImage = R.drawable.normalquesxxxvi,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.normaliconxxxvi,
            lockIconImage = R.drawable.lnormaliconxxxvi,
            name = "normal36",
            answerImage = R.drawable.normalansxxxvi,
            answer =" Divide the right number by the left (or top by bottom). Multiply the" +
                    " resulting number by 2 (36/6 = 24/4 = 6; 6 * 2 = 12).",
            hint = " Somewhere you need to divide ...")

        questionsList.add(normalQuestion36)

        val normalQuestion37 = Question(
            id = 37,
            question = " What color is the most?",
            questionImage = R.drawable.normalquesxxxvii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxxxvii,
            lockIconImage = R.drawable.lnormaliconxxxvii,
            name = "normal37",
            answerImage = R.drawable.normalansxxxvii,
            answer =" The answer is shown in the picture.",
            hint = " Count how many cubes...")

        questionsList.add(normalQuestion37)

        val normalQuestion38 = Question(
            id = 38,
            question = " To transport animals, zookeepers need to know their total " +
                    "weight. They know how much all combinations of two animals weigh." +
                    " Unfortunately, when they decided to weigh all three animals, the" +
                    " scale broke down. Help them calculate how much all animals weigh" +
                    " without using a scale.",
            questionImage = R.drawable.normalquesxxxviii,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxxxviii,
            lockIconImage = R.drawable.lnormaliconxxxviii,
            name = "normal38",
            answerImage = R.drawable.normalansxxxviii,
            answer =" It's simple. If you add up all 3 animal pairs and add up their masses," +
                    " you will find out how much two hippos, two ostriches, and two raccoons" +
                    " weigh together (220 + 200 + 50 = 470). Three animals weigh 470/2 = 235.",
            hint = " Create an equation. Or make it simple…")

        questionsList.add(normalQuestion38)

        val normalQuestion39 = Question(
            id = 39,
            question = " Nick lacks 8 coins to buy a chocolate bar. Fred lacks 3 coins " +
                    "for the same chocolate bar. They decided to buy a chocolate bar together." +
                    " Now they lack only 2 coins to buy a chocolate bar. How many coins does" +
                    " a chocolate bar cost?",
            questionImage = R.drawable.normalquesxxxix,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconxxxix,
            lockIconImage = R.drawable.lnormaliconxxxix,
            name = "normal39",
            answerImage = R.drawable.normalansxxxix,
            answer =" Fred has lacked 3 coins, and with Nick's one coin, he now lacks two coins." +
                    " If Nick had only one coin, the chocolate bar costs 9 coins.",
            hint = " Create an equation…")

        questionsList.add(normalQuestion39)

        val normalQuestion40 = Question(
            id = 40,
            question = " The clocks are placed in a logical sequence. Which time should" +
                    " replace the question mark?",
            questionImage = R.drawable.normalquesxl,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxl,
            lockIconImage = R.drawable.lnormaliconxl,
            name = "normal40",
            answerImage = R.drawable.normalansxl,
            answer =" One can see that each time differs by 5 minutes + some tens of minutes" +
                    " (all numbers in the row are either 2 or 7). The answer should contain" +
                    " 2 or 7 as the last digit.",
            hint = " Look at the last digit...")

        questionsList.add(normalQuestion40)

        val normalQuestion41 = Question(
            id = 41,
            question = " The watchmaker entrusted his apprentice to assemble the mechanism " +
                    "for the watch. The apprentice made 2 mechanisms, but he has no idea which " +
                    "one works. Help him make a choice. A. The first mechanism works. B. " +
                    "The second mechanism works. C. Both work. D. both do not work.",
            questionImage = R.drawable.normalquesxli,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxli,
            lockIconImage = R.drawable.lnormaliconxli,
            name = "normal41",
            answerImage = R.drawable.normalansxli,
            answer =" Two contacting gears cannot go in the same direction " +
                    "(nor clockwise neither counterclockwise).",
            hint = " Check every gear in order...")

        questionsList.add(normalQuestion41)

        val normalQuestion42 = Question(
            id = 42,
            question = " Which side view (as indicated by the blue arrow) " +
                    "corresponds to the 3D shape shown in the picture?",
            questionImage = R.drawable.normalquesxlii,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconxlii,
            lockIconImage = R.drawable.lnormaliconxlii,
            name = "normal42",
            answerImage = R.drawable.normalansxlii,
            answer =" The answer is shown in the picture. The red and " +
                    "yellow cubes are not visible.",
            hint = " Some cubes are not visible behind other cubes...")

        questionsList.add(normalQuestion42)

        val normalQuestion43 = Question(
            id = 43,
            question = " Which shape should replace the question mark?",
            questionImage = R.drawable.normalquesxliii,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.normaliconxliii,
            lockIconImage = R.drawable.lnormaliconxliii,
            name = "normal43",
            answerImage = R.drawable.normalansxliii,
            answer =" The answer is shown in the picture.",
            hint = " Rotate both gears at the same time...")

        questionsList.add(normalQuestion43)

        val normalQuestion44 = Question(
            id = 44,
            question = " Which glass will be filled up first?",
            questionImage = R.drawable.normalquesxliv,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconxliv,
            lockIconImage = R.drawable.lnormaliconxliv,
            name = "normal44",
            answerImage = R.drawable.normalansxliv,
            answer =" The answer is shown in the picture.",
            hint = " Stop sign will not allow passing...")

        questionsList.add(normalQuestion44)

        val normalQuestion45 = Question(
            id = 45,
            question = " Each shape was drawn on top of the previous one." +
                    " Determine the color of the shape drawn second.",
            questionImage = R.drawable.normalquesxlv,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxlv,
            lockIconImage = R.drawable.lnormaliconxlv,
            name = "normal45",
            answerImage = R.drawable.normalansxlv,
            answer =" First, a green triangle was drawn. A pink cross was drawn over it.",
            hint = " Not gray...")

        questionsList.add(normalQuestion45)

        val normalQuestion46 = Question(
            id = 46,
            question = " Which shadow does the teddy bear cast?",
            questionImage = R.drawable.normalquesxlvi,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxlvi,
            lockIconImage = R.drawable.lnormaliconxlvi,
            name = "normal46",
            answerImage = R.drawable.normalansxlvi,
            answer =" The basket remains on the left, and the bow-knot should be there.",
            hint = " This bear is not a vampire, and thus he casts a shadow with all the elements…")

        questionsList.add(normalQuestion46)

        val normalQuestion47 = Question(
            id = 47,
            question = " Which number should replace the question mark?",
            questionImage = R.drawable.normalquesxlvii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxlvii,
            lockIconImage = R.drawable.lnormaliconxlvii,
            name = "normal47",
            answerImage = R.drawable.normalansxlvii,
            answer =" This is a modified Pascal's triangle, in which each element" +
                    " is multiplied by 2. The answer is in the picture.",
            hint = " Someone smart came up with this, not the creator of the app. Not 10...")

        questionsList.add(normalQuestion47)

        val normalQuestion48 = Question(
            id = 48,
            question = " Anna buys rectangular laundry soap for a month (28 days) and uses " +
                    "it every day. On the 27th day, the bar of soap is reduced by 3 times " +
                    "on all sides (height, width and length). Does Anna get enough soap by" +
                    " the end of the month? A. Just enough. B. Not enough. C. More than she needs.",
            questionImage = R.drawable.normalquesxlviii,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.normaliconxlviii,
            lockIconImage = R.drawable.lnormaliconxlviii,
            name = "normal48",
            answerImage = R.drawable.normalansxlviii,
            answer =" Anna used up 1 - (1/3) x (1/3) x (1/3) = 26/27 of the soap within " +
                    "26 days. Anna still has 1/27 of soap for the 27th day. There is no" +
                    " soap for the 28th day.",
            hint = " Calculate the volume ...")

        questionsList.add(normalQuestion48)

        val normalQuestion49 = Question(
            id = 49,
            question = " Every robot collects only those screw-nuts which are somehow" +
                    " connected with it. Find this relationship to answer which robot can" +
                    " collect the most screw-nuts?",
            questionImage = R.drawable.normalquesxlix,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconxlix,
            lockIconImage = R.drawable.lnormaliconxlix,
            name = "normal49",
            answerImage = R.drawable.normalansxlix,
            answer =" Robots collect only screw-nuts with the number of side faces equal" +
                    " to the number of their antennas. The answer is in the picture. ",
            hint = " Antennas… antennas…")

        questionsList.add(normalQuestion49)

        val normalQuestion50 = Question(
            id = 50,
            question = " Which number should replace the question mark?",
            questionImage = R.drawable.normalquesl,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.normaliconl,
            lockIconImage = R.drawable.lnormaliconl,
            name = "normal50",
            answerImage = R.drawable.normalansl,
            answer =" The answer is shown in the picture.",
            hint = " Just sum them up…")

        questionsList.add(normalQuestion50)

        val normalQuestion51 = Question(
            id = 51,
            question = " Which shape does not fit the sequence?",
            questionImage = R.drawable.normalquesli,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.normaliconli,
            lockIconImage = R.drawable.lnormaliconli,
            name = "normal51",
            answerImage = R.drawable.normalansli,
            answer =" The answer is shown in the picture.",
            hint = " Check the order…")

        questionsList.add(normalQuestion51)


        val normalQuestion52 = Question(
            id = 52,
            question = " Every next day the hotel has twice the number of guests. " +
                    "On the sixth day, the entire hotel was full. On what day were" +
                    " half of all rooms unoccupied?",
            questionImage = R.drawable.normalqueslii,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.normaliconlii,
            lockIconImage = R.drawable.lnormaliconlii,
            name = "normal52",
            answerImage = R.drawable.normalanslii,
            answer =" On the fifth day. During the night, the number of guests doubled" +
                    " and filled the second half of the hotel.",
            hint = " Not on the first day…")

        questionsList.add(normalQuestion52)


        val normalQuestion53 = Question(
            id = 53,
            question = " Weights and balloons are positioned on the hanging scale" +
                    " in such a way that the scales are in equilibrium and balanced" +
                    " as well. What is the mass of the yellow cube?",
            questionImage = R.drawable.normalquesliii,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.normaliconliii,
            lockIconImage = R.drawable.lnormaliconliii,
            name = "normal53",
            answerImage = R.drawable.normalansliii,
            answer =" The answer is shown in the picture.",
            hint = " Not A. Ignore the pyramid…")

        questionsList.add(normalQuestion53)


        return questionsList
    }

    fun getHardQuestions(): ArrayList<Question> {
        val questionsList = arrayListOf<Question>()

        val hardQuestion1 = Question(
            id = 1,
            question = " Which of the three exits (green cubes) can you reach if you start" +
                    " with the “Start” red cube and follow the rule: “if the number is even," +
                    " half it; if the number is odd, add five”?",
            questionImage = R.drawable.hardquesi,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconi,
            lockIconImage = R.drawable.lhardiconi,
            name = "hard1",
            answerImage = R.drawable.hardansi,
            answer =" The answer is shown in the picture.",
            hint = " It's not difficult, just follow the rule. There is only one correct option...")

        questionsList.add(hardQuestion1)

        val hardQuestion2 = Question(
            id = 2,
            question = " Which letter stands for the exit from the maze?",
            questionImage = R.drawable.hardquesii,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.hardiconii,
            lockIconImage = R.drawable.lhardiconii,
            name = "hard2",
            answerImage = R.drawable.hardansii,
            answer =" The answer is shown in the picture.",
            hint = " Follow the path from start to finish…")

        questionsList.add(hardQuestion2)

        val hardQuestion3 = Question(
            id = 3,
            question = " Which shape comes next in this sequence?",
            questionImage = R.drawable.hardquesiii,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.hardiconiii,
            lockIconImage = R.drawable.lhardiconiii,
            name = "hard3",
            answerImage = R.drawable.hardansiii,
            answer =" The dark star in the first row is moving to the left by one, and in the" +
                    " second and third to the right by one. The value of the numbers changes" +
                    " by plus two in the second row and by minus one in the third row." +
                    " Both numbers are moving to the left by one.",
            hint = " Consider each pattern separately ...")

        questionsList.add(hardQuestion3)

        val hardQuestion4 = Question(
            id = 4,
            question = " Weights and balloons are positioned on the hanging scale in such a" +
                    " way that the scales are in equilibrium and balanced as well. What" +
                    " is the mass of the yellow cube?",
            questionImage = R.drawable.hardquesiv,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.hardiconiv,
            lockIconImage = R.drawable.lhardiconiv,
            name = "hard4",
            answerImage = R.drawable.hardansiv,
            answer =" The answer is shown in the picture.",
            hint = " If the weight weighs 2 and its counterweight weighs 4, " +
                    "then the whole scale weighs 6...")

        questionsList.add(hardQuestion4)

        val hardQuestion5 = Question(
            id = 5,
            question = " Which combination of 3 shapes should be instead of a question mark?",
            questionImage = R.drawable.hardquesv,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconv,
            lockIconImage = R.drawable.lhardiconv,
            name = "hard5",
            answerImage = R.drawable.hardansv,
            answer =" The color of each shape alternates; there is one small shape for every" +
                    " two large shapes. Considering only the order of the figures of the" +
                    " star, one can immediately understand that the answer is B, since it" +
                    " contains the only one with a dark large star.",
            hint = " Don't look at 3 but look at 1...")

        questionsList.add(hardQuestion5)

        val hardQuestion6 = Question(
            id = 6,
            question = " Hoju is a mirk from planet Charma. All friends of Hoju are purple," +
                    " except for their babies. All mirk-babies are blue. What is" +
                    " true about mirks? A. Green mirks do not exist. B. Some of" +
                    " the mirks are green. C. Even if green mirks exist their" +
                    " babies would be blue. D. Mirks are three-eyed.",
            questionImage = R.drawable.hardquesvi,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconvi,
            lockIconImage = R.drawable.lhardiconvi,
            name = "hard6",
            answerImage = R.drawable.hardansvi,
            answer =" Nothing has been written about the color of adult mirks." +
                    " The fact that Hoju does not know any green mirks does not" +
                    " exclude their existence. But the children of these mirks would" +
                    " still be blue, because ALL child mirks are blue.",
            hint = " Find the connection between all statements… ")

        questionsList.add(hardQuestion6)

        val hardQuestion7 = Question(
            id = 7,
            question = " Which shape comes next in this sequence?",
            questionImage = R.drawable.hardquesvii,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconvii,
            lockIconImage = R.drawable.lhardiconvii,
            name = "hard7",
            answerImage = R.drawable.hardansvii,
            answer =" Each time the circle rotates at a certain angle.",
            hint = " Find an angle…")

        questionsList.add(hardQuestion7)

        val hardQuestion8 = Question(
            id = 8,
            question = " Will the box covers attached to the mechanism move up" +
                    " or down if the lever is pulled in the direction" +
                    " indicated by the blue arrow?",
            questionImage = R.drawable.hardquesviii,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.hardiconviii,
            lockIconImage = R.drawable.lhardiconviii,
            name = "hard8",
            answerImage = R.drawable.hardansviii,
            answer =" The answer is shown in the picture.",
            hint = " Move from gear to gear to reach the answer…")

        questionsList.add(hardQuestion8)

        val hardQuestion9 = Question(
            id = 9,
            question = " Which shape should replace the question mark?",
            questionImage = R.drawable.hardquesix,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.hardiconix,
            lockIconImage = R.drawable.lhardiconix,
            name = "hard9",
            answerImage = R.drawable.hardansix,
            answer =" Red is under turquoise. The heart is between the star and the circle.",
            hint = " Consider each pattern separately. Not F ...")

        questionsList.add(hardQuestion9)

        val hardQuestion10 = Question(
            id = 10,
            question = " Andrew has the biggest amount of friends. Chris is not friends" +
                    " with Andrew. Smith is not friends with Chris. Stephen is" +
                    " hiding under the letter E, and Joe is not hiding under the letter " +
                    "B. Nothing is known about Mark. Where is Mark?",
            questionImage = R.drawable.hardquesx,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconx,
            lockIconImage = R.drawable.lhardiconx,
            name = "hard10",
            answerImage = R.drawable.hardansx,
            answer =" Andrew is C, as he has the most friends. The only letter that is" +
                    " not linked to C is A, so Chris is A. Smith can only be F or" +
                    " E since he is not friends with Chris (A). E is Stephen, so F" +
                    " is Smith. Mark should be B, as Joe cannot be B.",
            hint = " Andrew is C…")

        questionsList.add(hardQuestion10)

        val hardQuestion11 = Question(
            id = 11,
            question = " Four sages and a brick wall are located as in the picture." +
                    " Sages can look only forward. E.g., sage #1 sees the hats of #2 & #3." +
                    " They cannot communicate, and only know that two of them are in red hats," +
                    " and two are in blue hats. Which of them will be the first to tell which" +
                    " hat he is wearing?",
            questionImage = R.drawable.hardquesxi,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconxi,
            lockIconImage = R.drawable.lhardiconxi,
            name = "hard11",
            answerImage = R.drawable.hardansxi,
            answer =" Sage #1 would say what hat he is in if he saw sages #2 and #3 in" +
                    " hats of the same color. If they were in 2 red hats, he" +
                    " would say that he is in a blue one. But the hats are of" +
                    " different colors. #2 realizes that #1 is silent → his hat" +
                    " color is different from the color of #3’s hat. The answer is #2.",
            hint = " Sages # 3 and # 4 only see the wall and nothing else...")

        questionsList.add(hardQuestion11)

        val hardQuestion12 = Question(
            id = 12,
            question = " How many triangles are shown in this figure?",
            questionImage = R.drawable.hardquesxii,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.hardiconxii,
            lockIconImage = R.drawable.lhardiconxii,
            name = "hard12",
            answerImage = R.drawable.hardansxii,
            answer =" The answer is shown in the picture.",
            hint = " The large triangle contains small ones…")

        questionsList.add(hardQuestion12)

        val hardQuestion13 = Question(
            id = 13,
            question = " There are paths between points 1 and 0 that go through" +
                    " points 2-9 and lead only in the direction indicated by the arrows." +
                    " How many different paths (e.g. 1→2→7→0) are there between points 1 and 0?",
            questionImage = R.drawable.hardquesxiii,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.hardiconxiii,
            lockIconImage = R.drawable.lhardiconxiii,
            name = "hard13",
            answerImage = R.drawable.hardansxiii,
            answer =" The number of options can be found using graph theory. The initial point " +
                    "is indexed \"1\". Each subsequent point has an index equal to the number " +
                    "of roads leading to it, taking into account the index of the point from " +
                    "which the road comes. The index of the destination will be the answer.",
            hint = " Use graph theory or count the options...")

        questionsList.add(hardQuestion13)

        val hardQuestion14 = Question(
            id = 14,
            question = " Only one of three blue shapes can be transformed into the red one just" +
                    " by rotations. Which one?",
            questionImage = R.drawable.hardquesxiv,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconxiv,
            lockIconImage = R.drawable.lhardiconxiv,
            name = "hard14",
            answerImage = R.drawable.hardansxiv,
            answer =" The answer is shown in the picture.",
            hint = " Mental rotation skills are important here. Consider details...")

        questionsList.add(hardQuestion14)

        val hardQuestion15 = Question(
            id = 15,
            question = " Which shape of polyhedra net cannot be folded correctly to become" +
                    " a dodecahedron (a 3D shape shown in the picture)?",
            questionImage = R.drawable.hardquesxv,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.hardiconxv,
            lockIconImage = R.drawable.lhardiconxv,
            name = "hard15",
            answerImage = R.drawable.hardansxv,
            answer =" It is impossible to unfold the dodecahedron in such a way " +
                    "that the five pentagons (as shown in the figure) were oriented " +
                    "in the same direction.",
            hint = " Calculate possible nets…")

        questionsList.add(hardQuestion15)

        val hardQuestion16 = Question(
            id = 16,
            question = " Find an analogy and replace the question mark.",
            questionImage = R.drawable.hardquesxvi,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.hardiconxvi,
            lockIconImage = R.drawable.lhardiconxvi,
            name = "hard16",
            answerImage = R.drawable.hardansxvi,
            answer =" The lines from the first and second shapes are summed up. The line" +
                    " from the third shape is added to the answer in case there is no" +
                    " such line in the first two shapes. Otherwise, this line is" +
                    " subtracted from the answer.",
            hint = " The first two shapes and then the third one…")

        questionsList.add(hardQuestion16)

        val hardQuestion17 = Question(
            id = 17,
            question = " The red checker jumps over the black checkers," +
                    " as shown in the picture on the left. If a red checker" +
                    " jumps over a black one, then this black checker disappears." +
                    " Find a maximum number of black checkers that can be jumped" +
                    " over by the red checker in the picture on the right?",
            questionImage = R.drawable.hardquesxvii,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.hardiconxvii,
            lockIconImage = R.drawable.lhardiconxvii,
            name = "hard17",
            answerImage = R.drawable.hardansxvii,
            answer =" The answer is shown in the picture.",
            hint = " The red checker cannot jump over all black ones...")

        questionsList.add(hardQuestion17)

        val hardQuestion18 = Question(
            id = 18,
            question = " Each way contains a number indicating the number " +
                    "of obstacles along this way. What is the total number of " +
                    "obstacles from start to finish for the most optimal path? " +
                    "The optimal path has the least number of obstacles.",
            questionImage = R.drawable.hardquesxviii,
            numberOfQuestions = 6,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxviii,
            lockIconImage = R.drawable.lhardiconxviii,
            name = "hard18",
            answerImage = R.drawable.hardansxviii,
            answer =" The answer is shown in the picture.",
            hint = " The optimal path can be very long...")

        questionsList.add(hardQuestion18)

        val hardQuestion19 = Question(
            id = 19,
            question = " Which shape comes next in this sequence?",
            questionImage = R.drawable.hardquesxix,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconxix,
            lockIconImage = R.drawable.lhardiconxix,
            name = "hard19",
            answerImage = R.drawable.hardansxix,
            answer =" The answer is shown in the picture.",
            hint = " Not C…")

        questionsList.add(hardQuestion19)

        val hardQuestion20 = Question(
            id = 20,
            question = " Only one of three blue shapes cannot be transformed" +
                    " into the red one just by rotations. Which one?",
            questionImage = R.drawable.hardquesxx,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxx,
            lockIconImage = R.drawable.lhardiconxx,
            name = "hard20",
            answerImage = R.drawable.hardansxx,
            answer =" The answer is shown in the picture.",
            hint = " Be attentive to detail. That’s it...")

        questionsList.add(hardQuestion20)

        val hardQuestion21 = Question(
            id = 21,
            question = " Which shapes will fit into a cube with parameters" +
                    " 1000: 1000: 1000 in greater number: A. Spheres with a diameter of" +
                    " 1. B. Cubes with parameters 1: 1: 1. C. Cylinders with a height" +
                    " of 1 and a diameter of 1? D. The same number of cubes, balls, " +
                    "and cylinders will fit into the cube.",
            questionImage = R.drawable.hardquesxxi,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.hardiconxxi,
            lockIconImage = R.drawable.lhardiconxxi,
            name = "hard21",
            answerImage = R.drawable.hardansxxi,
            answer =" The spheres can be placed not only on top of one another but also by " +
                    "alternate stackings, as shown in the picture. Thus, the spheres can be packed" +
                    " in tighter lattices. To know more," +
                    " look for \"Close-packing of equal spheres\" topics.",
            hint = " One over the other? Don't think so...")

        questionsList.add(hardQuestion21)

        val hardQuestion22 = Question(
            id = 22,
            question = " The half-life time is the time required for 50% of the atomic nuclei" +
                    " of a radioactive sample to decay. The 100 atomic nuclei decayed in" +
                    " the box within half an hour. How many nuclei will decay in the " +
                    "following half an hour?",
            questionImage = R.drawable.hardquesxxii,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconxxii,
            lockIconImage = R.drawable.lhardiconxxii,
            name = "hard22",
            answerImage = R.drawable.hardansxxii,
            answer =" The 100 nuclei decayed (one half) and 100 nuclei remained " +
                    "untouched (second half) in half an hour. Over the next half hour," +
                    " half of the remaining 100 nuclei will decay: 100 * 0.5 = 50…",
            hint = " Consider how many nuclei are left after the first half-hour ...")

        questionsList.add(hardQuestion22)

        val hardQuestion23 = Question(
            id = 23,
            question = " Which number should replace the question mark?",
            questionImage = R.drawable.hardquesxxiii,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.hardiconxxiii,
            lockIconImage = R.drawable.lhardiconxxiii,
            name = "hard23",
            answerImage = R.drawable.hardansxxiii,
            answer ="(Left one plus right one) minus (top one plus bottom one).",
            hint = " There is no need to divide…")

        questionsList.add(hardQuestion23)

        val hardQuestion24 = Question(
            id = 24,
            question = "Joe has 2 friends. Smith is a friend of Andrew; Andrew is not a friend of " +
                    "Mark. Letter E stands for Chris. Steven is friends with Joe. Chris and Stephen " +
                    "have no mutual friends. Where is Mark?",
        questionImage = R.drawable.hardquesxxiv,
        numberOfQuestions = 6,
        correctAnswer = 6,
        iconImage = R.drawable.hardiconxxiv,
        lockIconImage = R.drawable.lhardiconxxiv,
        name = "hard24",
        answerImage = R.drawable.hardansxxiv,
        answer =" If Chris is E, then Stephen is A (since they have no mutual friends). " +
                "The only way for Smith and Andrew to be friends is when C and D (or C and B) " +
                "are Smith and Andrew. B or D is Joe (who is friends with Stephen). " +
                "The remaining letter F is Mark.",
        hint = " Stephen is A…")

        questionsList.add(hardQuestion24)

        val hardQuestion25 = Question(
            id = 25,
            question = " Which shape (polyhedra net) is correct for this dice?",
            questionImage = R.drawable.hardquesxxv,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.hardiconxxv,
            lockIconImage = R.drawable.lhardiconxxv,
            name = "hard25",
            answerImage = R.drawable.hardansxxv,
            answer =" The answer is shown in the picture. Only one net has the " +
                    "correct alignment of the squares.",
            hint = " Watch out for 2, 3, and 6 ...")

        questionsList.add(hardQuestion25)

        val hardQuestion26 = Question(
            id = 26,
            question = " Guess what color of the central square should be" +
                    " instead of a question mark?",
            questionImage = R.drawable.hardquesxxvi,
            numberOfQuestions = 6,
            correctAnswer = 6,
            iconImage = R.drawable.hardiconxxvi,
            lockIconImage = R.drawable.lhardiconxxvi,
            name = "hard26",
            answerImage = R.drawable.hardansxxvi,
            answer =" Shapes with 9 squares are changed according to the" +
                    " logic shown in the figure (rotation by 90 degrees; the" +
                    " right and central squares interchange their positions).",
            hint = " Conversion in 2 steps ...")

        questionsList.add(hardQuestion26)

        val hardQuestion27 = Question(
            id = 27,
            question = " What color is the most?",
            questionImage = R.drawable.hardquesxxvii,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.hardiconxxvii,
            lockIconImage = R.drawable.lhardiconxxvii,
            name = "hard27",
            answerImage = R.drawable.hardansxxvii,
            answer =" The answer is shown in the picture.",
            hint = " You will need knowledge of geometry ...")

        questionsList.add(hardQuestion27)

        val hardQuestion28 = Question(
            id = 28,
            question = " Find an analogy and replace the question mark.",
            questionImage = R.drawable.hardquesxxviii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconxxviii,
            lockIconImage = R.drawable.lhardiconxxviii,
            name = "hard28",
            answerImage = R.drawable.hardansxxviii,
            answer =" The answer is shown in the picture.",
            hint = " Repeat the same for every...")

        questionsList.add(hardQuestion28)

        val hardQuestion29 = Question(
            id = 29,
            question = " Which number should replace the question mark?",
            questionImage = R.drawable.hardquesxxix,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxxix,
            lockIconImage = R.drawable.lhardiconxxix,
            name = "hard29",
            answerImage = R.drawable.hardansxxix,
            answer =" The answer is in the picture. It is truncated Pascal's triangle, in which" +
                    " each member of the row is multiplied by the sequence number of the " +
                    "row in which it is located.",
            hint = " Don't forget the coefficient…")

        questionsList.add(hardQuestion29)

        val hardQuestion30 = Question(
            id = 30,
            question = " The river flows south. There is a one-way bridge across the river. " +
                    "Cars are coming towards you. The river flows from the right to the left " +
                    "mirrors of the cars. You start to cross the road. A fly hits your " +
                    "right ear. In which direction was it flying? A. South. B. North. C." +
                    " East. D. West..",
            questionImage = R.drawable.hardquesxxx,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxxx,
            lockIconImage = R.drawable.lhardiconxxx,
            name = "hard30",
            answerImage = R.drawable.hardansxxx,
            answer =" The fly flew east. The answer is shown in the picture.",
            hint = " Don’t trust the picture...")

        questionsList.add(hardQuestion30)

        val hardQuestion31 = Question(
            id = 31,
            question = " What piece should White start with to checkmate in 3 moves?",
            questionImage = R.drawable.hardquesxxxi,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconxxxi,
            lockIconImage = R.drawable.lhardiconxxxi,
            name = "hard31",
            answerImage = R.drawable.hardansxxxi,
            answer =" The answer is shown in the picture.",
            hint = " Check the king...")

        questionsList.add(hardQuestion31)

        val hardQuestion32 = Question(
            id = 32,
            question = " The octagon is in the center row. The rhombus is not at the top. " +
                    "The heart is on the left. The star is on the right. The circle is near" +
                    " the lune. What shape is described?",
            questionImage = R.drawable.hardquesxxxii,
            numberOfQuestions = 6,
            correctAnswer = 6,
            iconImage = R.drawable.hardiconxxxii,
            lockIconImage = R.drawable.lhardiconxxxii,
            name = "hard32",
            answerImage = R.drawable.hardansxxxii,
            answer = "Only one shape fits the description.",
                    hint = " The triangle is at the top...")

        questionsList.add(hardQuestion32)

        val hardQuestion33 = Question(
            id = 33,
            question = " Which shape does not fit the sequence?",
            questionImage = R.drawable.hardquesxxxiii,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxxxiii,
            lockIconImage = R.drawable.lhardiconxxxiii,
            name = "hard33",
            answerImage = R.drawable.hardansxxxiii,
            answer =" The answer is shown in the picture.",
            hint = " It is not about letters…")

        questionsList.add(hardQuestion33)

        val hardQuestion34 = Question(
            id = 34,
            question = " Which cube is correct for this unfolded flat template (polyhedra net)?",
            questionImage = R.drawable.hardquesxxxiv,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.hardiconxxxiv,
            lockIconImage = R.drawable.lhardiconxxxiv,
            name = "hard34",
            answerImage = R.drawable.hardansxxxiv,
            answer =" The answer is shown in the picture. Only one cube has the " +
                    "correct alignment of the squares.",
            hint = " Correct alignment of the squares is important…")

        questionsList.add(hardQuestion34)

        val hardQuestion35 = Question(
            id = 35,
            question = " Two gold coins are in one box, two silver coins are in the " +
                    "second box, and a gold coin and a silver coin are in the third box." +
                    " You choose one box at random and pick one coin at random. It is a" +
                    " gold coin! What is the probability that the second coin is silver?",
            questionImage = R.drawable.hardquesxxxv,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconxxxv,
            lockIconImage = R.drawable.lhardiconxxxv,
            name = "hard35",
            answerImage = R.drawable.hardansxxxv,
            answer =" Bertrand paradox. There are only 3 probabilities. I. You took " +
                    "the first gold coin from the box, where 2 coins are gold. II. " +
                    "You took the second gold coin from the same box. III. You took " +
                    "a gold coin from the box with gold and silver coins. The answer " +
                    "is 1 of 3 that the second coin is silver.",
            hint = " Don't trust your intuition ...")

        questionsList.add(hardQuestion35)

        val hardQuestion36 = Question(
            id = 36,
            question = " If you pull the ends, which rope will form a knot?",
            questionImage = R.drawable.hardquesxxxvi,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.hardiconxxxvi,
            lockIconImage = R.drawable.lhardiconxxxvi,
            name = "hard36",
            answerImage = R.drawable.hardansxxxvi,
            answer =" The answer is shown in the picture.",
            hint = " Not XXX...")

        questionsList.add(hardQuestion36)

        val hardQuestion37 = Question(
            id = 37,
            question = " One of the seven gold bars is counterfeit and weighs" +
                    " lesser than each of the other six. What is the minimum " +
                    "number of weightings is required to determine which of the" +
                    " gold bars is counterfeit?",
            questionImage = R.drawable.hardquesxxxvii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconxxxvii,
            lockIconImage = R.drawable.lhardiconxxxvii,
            name = "hard37",
            answerImage = R.drawable.hardansxxxvii,
            answer =" Let's place 3 gold bars on each side of the scale. If the scale" +
                    " is balanced, then the 7th bar is fake. If not, let's take three" +
                    " bars that weighed lesser than 3 genuine gold bars, select any " +
                    "2 bars from them and weigh them. If the scale is balanced, then" +
                    " the third bar is fake. The answer is 2.",
            hint = " You can weigh more than one bar at once ...")

        questionsList.add(hardQuestion37)

        val hardQuestion38 = Question(
            id = 38,
            question = " You have 3 pairs of hourglasses: for 3, 4, and 5 minutes." +
                    " Using these hourglasses, you need to cook the egg for exactly" +
                    " 2 minutes. Which pair of hourglasses you don't need for this " +
                    "task (if your goal is to save time)?",
            questionImage = R.drawable.hardquesxxxviii,
            numberOfQuestions = 3,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconxxxviii,
            lockIconImage = R.drawable.lhardiconxxxviii,
            name = "hard38",
            answerImage = R.drawable.hardansxxxviii,
            answer =" You can set the 3- and 5-minute hourglasses at the same time. " +
                    "When the 3 minutes are over, you will start boiling the egg. " +
                    "You will stop boiling the egg when the remaining 2 minutes have" +
                    " passed. You don't need a 4-minute hourglass.",
            hint = " Do not boil it immediately… First, wait…")

        questionsList.add(hardQuestion38)

        val hardQuestion39 = Question(
            id = 39,
            question = " Which of the prints can be made with the stamp " +
                    "shown in the center of the picture?",
            questionImage = R.drawable.hardquesxxxix,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxxxix,
            lockIconImage = R.drawable.lhardiconxxxix,
            name = "hard39",
            answerImage = R.drawable.hardansxxxix,
            answer =" The answer is shown in the picture.",
            hint = " Flip it …")

        questionsList.add(hardQuestion39)

        val hardQuestion40 = Question(
            id = 40,
            question = " Every day John eats two desserts which he marks down on his calendar " +
                    "with two symbols. Which desserts " +
                    "(encoded with \"G\" and \"E\") did John eat on the 7th day?",
            questionImage = R.drawable.hardquesxl,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.hardiconxl,
            lockIconImage = R.drawable.lhardiconxl,
            name = "hard40",
            answerImage = R.drawable.hardansxl,
            answer =" G can only be a wrapped candy. The cake next to it appeared earlier as ." +
                    " Only one answer contains a wrapped.",
            hint = " The same dessert can be present more than once...")

        questionsList.add(hardQuestion40)

        val hardQuestion41 = Question(
            id = 41,
            question = " Which die is incorrect for this unfolded flat template (polyhedra net)?",
            questionImage = R.drawable.hardquesxli,
            numberOfQuestions = 6,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxli,
            lockIconImage = R.drawable.lhardiconxli,
            name = "hard41",
            answerImage = R.drawable.hardansxli,
            answer =" The answer is shown in the picture. Only one dice has the" +
                    " incorrect alignment of the squares.",
            hint = " Correct alignment of the squares is important…")

        questionsList.add(hardQuestion41)

        val hardQuestion42 = Question(
            id = 42,
            question = " Which two patterns can interconvert just by rotations?",
            questionImage = R.drawable.hardquesxlii,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxlii,
            lockIconImage = R.drawable.lhardiconxlii,
            name = "hard42",
            answerImage = R.drawable.hardansxlii,
            answer =" The answer is shown in the picture.",
            hint = " Mental rotation skills are important here...")

        questionsList.add(hardQuestion42)

        val hardQuestion43 = Question(
            id = 43,
            question = " Which of these three pictures contains a hidden " +
                    "regular five-pointed star?",
            questionImage = R.drawable.hardquesxliii,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxliii,
            lockIconImage = R.drawable.lhardiconxliii,
            name = "hard43",
            answerImage = R.drawable.hardansxliii,
            answer =" The answer is shown in the picture.",
            hint = " Take a closer look at the triangles.")

        questionsList.add(hardQuestion43)

        val hardQuestion44 = Question(
            id = 44,
            question = " A piece of sugar falls from a wooden block into the" +
                    " water (see picture), and water completely dissolves it. " +
                    "The density of the water does not change. Is the water level " +
                    "is affected? A. It rises. B. It falls. C. It is the same as before.",
            questionImage = R.drawable.hardquesxliv,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxliv,
            lockIconImage = R.drawable.lhardiconxliv,
            name = "hard44",
            answerImage = R.drawable.hardansxliv,
            answer =" According to Archimedes' law, a buoyant force acts on a body" +
                    " immersed in a liquid, equal to the weight of displaced liquid." +
                    " The dissolved sugar will increase the volume of the water. But" +
                    " the piece of wood floats up and compensates for the change. The" +
                    " answer: level will not change.",
            hint = " Archimedes' principle…")

        questionsList.add(hardQuestion44)

        val hardQuestion45 = Question(
            id = 45,
            question = " N17I and C14B were scouting the uninhabited planet of Ense." +
                    " They took 20 spare screw-nuts. After a while, C14B gave to " +
                    "N17I four nuts. The N17I used these four nuts for self-repair." +
                    " After that, each robot had the same number of spare nuts. How many" +
                    " spare nuts did the N17I have at the beginning?",
            questionImage = R.drawable.hardquesxlv,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxlv,
            lockIconImage = R.drawable.lhardiconxlv,
            name = "hard45",
            answerImage = R.drawable.hardansxlv,
            answer =" (20 – 4)/2 = 8.",
            hint = " N17I always had a constant number of spare nuts ...")

        questionsList.add(hardQuestion45)

        val hardQuestion46 = Question(
            id = 46,
            question = " Which number should replace the question mark?",
            questionImage = R.drawable.hardquesxlvi,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.hardiconxlvi,
            lockIconImage = R.drawable.lhardiconxlvi,
            name = "hard46",
            answerImage = R.drawable.hardansxlvi,
            answer =" The dice values of \"2\" and \"3\" are located on the side " +
                    "faces if the bottom and up faces are \"6\" and \"1\". The sticker " +
                    "covers the value \"6\". Finally, all the visible values" +
                    " (including those covered with a sticker) are added up." +
                    " Answer: 2 + 3 + 6 = 11.",
            hint = " Examples will help to look behind the sticker...")

        questionsList.add(hardQuestion46)

        val hardQuestion47 = Question(
            id = 47,
            question = " Nick made himself a full cup of tea and added 8 sugar cubes to it. " +
                    "Then he drank half a cup and added hot water and 8 sugar cubes. " +
                    "Nick drank half a cup, adding sugar and water 2 more times. " +
                    "Then Nick drank the whole cup. How many sugar cubes were in this last cup?",
            questionImage = R.drawable.hardquesxlvii,
            numberOfQuestions = 6,
            correctAnswer = 3,
            iconImage = R.drawable.hardiconxlvii,
            lockIconImage = R.drawable.lhardiconxlvii,
            name = "hard47",
            answerImage = R.drawable.hardansxlvii,
            answer =" The first time, Nick left half a cup with 4 sugar cubes (half of" +
                    " eight). Then, Nick added 8 sugar cubes (the sum is 12) and drank " +
                    "half of it to leave 6. Another step made (6 + 8) / 2 = 7. The last cup" +
                    " contained 15 (7 + 8) sugar cubes.",
            hint = " Nick loves sweet tea...")

        questionsList.add(hardQuestion47)

        val hardQuestion48 = Question(
            id = 48,
            question = " Which tetrahedron does not fit the sequence?",
            questionImage = R.drawable.hardquesxlviii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconxlviii,
            lockIconImage = R.drawable.lhardiconxlviii,
            name = "hard48",
            answerImage = R.drawable.hardansxlviii,
            answer =" Only one tetrahedron cannot be interconverted to others just by rotations.",
            hint = " Are they all the same?...")

        questionsList.add(hardQuestion48)

        val hardQuestion49 = Question(
            id = 49,
            question = " Which fragment was cut from the wooden block?",
            questionImage = R.drawable.hardquesxlix,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.hardiconxlix,
            lockIconImage = R.drawable.lhardiconxlix,
            name = "hard49",
            answerImage = R.drawable.hardansxlix,
            answer =" The answer is shown in the picture.",
            hint = " Just be careful. Follow the lines and patterns...")

        questionsList.add(hardQuestion49)

        val hardQuestion50 = Question(
            id = 50,
            question = " An ostrich consumes a bag of wheat in one day, a chicken in two days, " +
                    "and a sparrow in three days. In how many hours (approximately) will " +
                    "all three birds eat a bag of wheat?",
            questionImage = R.drawable.hardquesl,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.hardiconl,
            lockIconImage = R.drawable.lhardiconl,
            name = "hard50",
            answerImage = R.drawable.hardansl,
            answer ="1 ÷ (1 + 0.5 + 0.33) × 24 hours ≈ 13 hours",
            hint = " Sum up in the denominator...")

        questionsList.add(hardQuestion50)

        return questionsList
    }

    fun getTrickyQuestions(): ArrayList<Question> {
        val questionsList = arrayListOf<Question>()
        val trickyQuestion1 = Question(
            id = 1,
            question = " The king divided the prize (180 golds) among five knights " +
                    "who won the most duels. He gave the winner knight 20% of 180 coins." +
                    " He gave the second knight 20% of the remaining coins. In the same" +
                    " way, the king gave gold coins to knights #3, #4, and #5. How many" +
                    " golds did the king keep for himself?",
            questionImage = R.drawable.trickyquesi,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.trickyiconi,
            lockIconImage = R.drawable.ltrickyiconi,
            name = "tricky1",
            answerImage = R.drawable.trickyansi,
            answer ="180 х (0.8) х (0.8) х (0.8) х (0.8) х (0.8) = 59. This is how" +
                    " percentages work.",
            hint = null)

                    questionsList.add(trickyQuestion1)

            val trickyQuestion2 = Question(
                id = 2,
        question = " The girl's favorite necklace was torn into 6 identical parts" +
                " (see picture). The local jeweler is a very honest person; he always " +
                "does his job so that his clients do not overpay. The jeweler charges one " +
                "dollar to open and close one link. How much money did the jeweler take " +
                "from the girl to restore the chain?",
        questionImage = R.drawable.trickyquesii,
        numberOfQuestions = 4,
        correctAnswer = 3,
        iconImage = R.drawable.trickyiconii,
        lockIconImage = R.drawable.ltrickyiconii,
        name = "tricky2",
        answerImage = R.drawable.trickyansii,
        answer =" The jeweler will remove the link from the sixth part and insert it between " +
                "the other two parts, so he can finish the job in 5 operations ($5).",
        hint = null)

        questionsList.add(trickyQuestion2)

        val trickyQuestion3 = Question(
            id = 3,
            question = " Choose #3.",
            questionImage = R.drawable.trickyquesiii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.trickyiconiii,
            lockIconImage = R.drawable.ltrickyiconiii,
            name = "tricky3",
            answerImage = R.drawable.trickyansiii,
            answer ="#3 is 4.",
            hint = null)

                    questionsList.add(trickyQuestion3)

            val trickyQuestion4 = Question(
                id = 4,
        question = " What animal is hiding in this picture?",
        questionImage = R.drawable.trickyquesiv,
        numberOfQuestions = 4,
        correctAnswer = 3,
        iconImage = R.drawable.trickyiconiv,
        lockIconImage = R.drawable.ltrickyiconiv,
        name = "tricky4",
        answerImage = R.drawable.trickyansiv,
        answer =" A crocodile is hiding. The lion does not hide; he is the king of all animals " +
                "who simply examines his possessions.",
        hint = null)

        questionsList.add(trickyQuestion4)

        val trickyQuestion5 = Question(
            id = 5,
            question = " Which shape does not fit the sequence? ",
            questionImage = R.drawable.trickyquesv,
            numberOfQuestions = 6,
            correctAnswer = 1,
            iconImage = R.drawable.trickyiconv,
            lockIconImage = R.drawable.ltrickyiconv,
            name = "tricky5",
            answerImage = R.drawable.trickyansv,
            answer = "The first shape does not fit as it is “perfect” and it does not have the " +
                    "distinctive features that other figures have. For example, " +
                    "the second shape is without a frame, the third shape is round, " +
                    "the last shape is without a shadow, etc.",
        hint = null)

        questionsList.add(trickyQuestion5)

        val trickyQuestion6 = Question(
            id = 6,
            question = " Which elevator button is pressed most often in a 12-story building," +
                    " if 12 people live on the first floor, and 2 more people live on each " +
                    "floor upper than the previous one (first floor -> 12 people, second" +
                    " floor -> 14 people, third floor -> 16 people, etc.). ",
            questionImage = R.drawable.trickyquesvi,
            numberOfQuestions = 6,
            correctAnswer = 1,
            iconImage = R.drawable.trickyiconvi,
            lockIconImage = R.drawable.ltrickyiconvi,
            name = "tricky6",
            answerImage = R.drawable.trickyansvi,
            answer =" More often than not, people will press the button for the " +
                    "first floor to go down.",
            hint = null)

                    questionsList.add(trickyQuestion6)

            val trickyQuestion7 = Question(
                id = 7,
        question = " Which sequence should replace the question mark?",
        questionImage = R.drawable.trickyquesvii,
        numberOfQuestions = 4,
        correctAnswer = 2,
        iconImage = R.drawable.trickyiconvii,
        lockIconImage = R.drawable.ltrickyiconvii,
        name = "tricky7",
        answerImage = R.drawable.trickyansvii,
        answer =" It is well known “Look-and-say” sequence. 1a is read off" +
                " as \"one 1 and one a\" or 111a. 111a is read off as" +
                " \"three 1s and one a\" or 311a, etc.",
        hint = null)

        questionsList.add(trickyQuestion7)

        val trickyQuestion8 = Question(
            id = 8,
            question = " How many squares are shown in this figure (not standard " +
                    "screen? Red shape is a square!)",
            questionImage = R.drawable.trickyquesviii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.trickyiconviii,
            lockIconImage = R.drawable.ltrickyiconviii,
            name = "tricky8",
            answerImage = R.drawable.trickyansviii,
            answer =" Two squares. The brown shape is a diamond (not a square) and" +
                    " the blue one is a rectangle.",
            hint = null)

                    questionsList.add(trickyQuestion8)

            val trickyQuestion9 = Question(
                id = 9,
        question = " Which three coins should be moved to carry out the transformation" +
                " shown in the picture?",
        questionImage = R.drawable.trickyquesix,
        numberOfQuestions = 3,
        correctAnswer = 1,
        iconImage = R.drawable.trickyiconix,
        lockIconImage = R.drawable.ltrickyiconix,
        name = "tricky9",
        answerImage = R.drawable.trickyansix,
        answer =" The answer is shown in the picture.",
        hint = null)

        questionsList.add(trickyQuestion9)

        val trickyQuestion10 = Question(
            id = 10,
            question = " How many times you need to rotate the Rubik's cube to solve it, " +
                    "starting from the position shown in the picture.",
            questionImage = R.drawable.trickyquesx,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.trickyiconx,
            lockIconImage = R.drawable.ltrickyiconx,
            name = "tricky10",
            answerImage = R.drawable.trickyansx,
            answer =" It is impossible to solve this Rubik's cube.",
            hint = null)

                    questionsList.add(trickyQuestion10)

            val trickyQuestion11 = Question(
                id = 11,
        question = " Black starts. Who will checkmate if both sides play smart?",
        questionImage = R.drawable.trickyquesxi,
        numberOfQuestions = 4,
        correctAnswer = 2,
        iconImage = R.drawable.trickyiconxi,
        lockIconImage = R.drawable.ltrickyiconxi,
        name = "tricky11",
        answerImage = R.drawable.trickyansxi,
        answer =" Black checkmates in one move. The board needs to be turned over, " +
                "numbers are used to number rows, not columns.",
        hint = null)

        questionsList.add(trickyQuestion11)

        val trickyQuestion12 = Question(
            id = 12,
            question = " Blue yacht (A) did not arrive first. Yellow yacht (C) " +
                    "came in fourth. The rest of the yachts were moving at the same speed. " +
                    "Which yacht arrived first?",
            questionImage = R.drawable.trickyquesxii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.trickyiconxii,
            lockIconImage = R.drawable.ltrickyiconxii,
            name = "tricky12",
            answerImage = R.drawable.trickyansxii,
            answer =" It is shown in the picture that the green yacht D came first. " +
                    "It is ahead of yachts E and B at the moment. Yachts E, B, and D " +
                    "move at the same speed all the time. ",
            hint = null)

                    questionsList.add(trickyQuestion12)

            val trickyQuestion13 = Question(
                id = 13,
        question = " How to cut a rectangle (1 x 5) into five pieces so that these " +
                "pieces can be recombined into a square (the area of the square should " +
                "be equal to the area of the initial rectangle).",
        questionImage = R.drawable.trickyquesxiii,
        numberOfQuestions = 4,
        correctAnswer = 1,
        iconImage = R.drawable.trickyiconxiii,
        lockIconImage = R.drawable.ltrickyiconxiii,
        name = "tricky13",
        answerImage = R.drawable.trickyansxiii,
        answer =" The answer is shown in the picture.",
        hint = null)

        questionsList.add(trickyQuestion13)

        val trickyQuestion14 = Question(
            id = 14,
            question = " The gift is hidden in one of the boxes. The first box has " +
                    "a note: “in the second”; the second has a note: “in the third”;" +
                    " the third box has a note: “not in this”. Only one note doesn't " +
                    "lie. Which box contains a gift?",
            questionImage = R.drawable.trickyquesxiv,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.trickyiconxiv,
            lockIconImage = R.drawable.ltrickyiconxiv,
            name = "tricky14",
            answerImage = R.drawable.trickyansxiv,
            answer =" If only one note does not lie, then the gift is in the first box." +
                    " The third box has the only correct note.",
            hint = null)

                    questionsList.add(trickyQuestion14)

            val trickyQuestion15 = Question(
                id = 15,
        question = " Seven flasks of pink substance can be synthesized from 2 flasks of" +
                " red substance and 5 flasks of purple substance. You have 11 flasks of " +
                "red substance and 11 flasks of purple substance. How many flasks of pink" +
                " substance can be synthesized?",
        questionImage = R.drawable.trickyquesxv,
        numberOfQuestions = 6,
        correctAnswer = 1,
        iconImage = R.drawable.trickyiconxv,
        lockIconImage = R.drawable.ltrickyiconxv,
        name = "tricky15",
        answerImage = R.drawable.trickyansxv,
        answer =" There is an excess of the red substance, so we can consider only the " +
                "purple substance. 11 flasks of the purple substance are not divisible by 5." +
                " Therefore, we can use 10 flasks of purple and 4 flasks of red substance" +
                " to obtain 14 flasks of the pink substance.",
        hint = null)

        questionsList.add(trickyQuestion15)

        val trickyQuestion16 = Question(
            id = 16,
            question = " Choose the correct statement from the list with the following 4 statements." +
                    " \"One of the statements in the list is true\" (A). \"Two out of four " +
                    "statements are true\" (B). \"Three out of four statements " +
                    "are true\" (C). \"All statements are true or all " +
                    "statements are false\" (D).",
            questionImage = R.drawable.trickyquesxvi,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.trickyiconxvi,
            lockIconImage = R.drawable.ltrickyiconxvi,
            name = "tricky16",
            answerImage = R.drawable.trickyansxvi,
            answer =" Only “One of the statements in the list is true” is true.",
            hint = null)

                    questionsList.add(trickyQuestion16)

            val trickyQuestion17 = Question(
                id = 17,
        question = " Find an analogy and replace the question mark.",
        questionImage = R.drawable.trickyquesxvii,
        numberOfQuestions = 4,
        correctAnswer = 3,
        iconImage = R.drawable.trickyiconxvii,
        lockIconImage = R.drawable.ltrickyiconxvii,
        name = "tricky17",
        answerImage = R.drawable.trickyansxvii,
        answer =" The answer is fish. Like balls in a basket, it is the result of a process.",
        hint = null)

        questionsList.add(trickyQuestion17)

        val trickyQuestion18 = Question(
            id = 18,
            question = " What number is under the car?",
            questionImage = R.drawable.trickyquesxviii,
            numberOfQuestions = 6,
            correctAnswer = 5,
            iconImage = R.drawable.trickyiconxviii,
            lockIconImage = R.drawable.ltrickyiconxviii,
            name = "tricky18",
            answerImage = R.drawable.trickyansxviii,
            answer =" 87! ",
            hint = null)

                    questionsList.add(trickyQuestion18)

            val trickyQuestion19 = Question(
                id = 19,
        question = " Find an analogy and replace the question mark.",
        questionImage = R.drawable.trickyquesxix,
        numberOfQuestions = 4,
        correctAnswer = 1,
        iconImage = R.drawable.trickyiconxix,
        lockIconImage = R.drawable.ltrickyiconxix,
        name = "tricky19",
        answerImage = R.drawable.trickyansxix,
        answer =" See the sequence in the figure.",
        hint = null)

        questionsList.add(trickyQuestion19)

        val trickyQuestion20 = Question(
            id = 20,
            question = " In the morning, cucumbers weighed 100 kg and contained 99% of water. " +
                    "It was a hot day and the cucumbers withered. In the evening, they contained " +
                    "only 98% of water. How much did the cucumbers weigh in the evening?",
            questionImage = R.drawable.trickyquesxx,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.trickyiconxx,
            lockIconImage = R.drawable.ltrickyiconxx,
            name = "tricky20",
            answerImage = R.drawable.trickyansxx,
            answer =" The solid content was initially 100 kg x 99% (or 0.99) = 1 kg. This one " +
                    "kilogram became two percent by evening. Cucumbers in the evening weighed " +
                    "1kg / 2% or 1kg / 0.02 = 50 kg. The answer is 50 kg. ",
            hint = null)

                    questionsList.add(trickyQuestion20)

            val trickyQuestion21 = Question(
                id = 21,
        question = " The scientist was working in his laboratory when an accident happened: " +
                "the power went out and the passages were blocked. He can only evacuate through " +
                "a poisonous snake laboratory, a poison gas laboratory, or a room with terrible" +
                " murderers. What should he choose?",
        questionImage = R.drawable.trickyquesxxi,
        numberOfQuestions = 4,
        correctAnswer = 4,
        iconImage = R.drawable.trickyiconxxi,
        lockIconImage = R.drawable.ltrickyiconxxi,
        name = "tricky21",
        answerImage = R.drawable.trickyansxxi,
        answer =" It easy to see that the laboratory is on the first/second floor. The" +
                " correct answer is to stay out of trouble and exit through the window.",
        hint = null)

        questionsList.add(trickyQuestion21)

        val trickyQuestion22 = Question(
            id = 22,
            question = " How many rabbits?",
            questionImage = R.drawable.trickyquesxxii,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.trickyiconxxii,
            lockIconImage = R.drawable.ltrickyiconxxii,
            name = "tricky22",
            answerImage = R.drawable.trickyansxxii,
            answer =" Be careful not to count the cat! 44.",
            hint = null)

                    questionsList.add(trickyQuestion22)

            val trickyQuestion23 = Question(
                id = 23,
        question = " All my friends except two are Americans. All my friends except three" +
                " are Frenchmen. All my friends except four are Russian. How many" +
                " friends do I have?",
        questionImage = R.drawable.trickyquesxxiii,
        numberOfQuestions = 6,
        correctAnswer = 5,
        iconImage = R.drawable.trickyiconxxiii,
        lockIconImage = R.drawable.ltrickyiconxxiii,
        name = "tricky23",
        answerImage = R.drawable.trickyansxxiii,
        answer =" I have 4 friends, 2 of them are Americans, 1 of them is a Frenchman." +
                " None of them is Russian.",
        hint = null)

        questionsList.add(trickyQuestion23)

        val trickyQuestion24 = Question(
            id = 24,
            question = " Which fruit does not fit the sequence?",
            questionImage = R.drawable.trickyquesxxiv,
            numberOfQuestions = 6,
            correctAnswer = 3,
            iconImage = R.drawable.trickyiconxxiv,
            lockIconImage = R.drawable.ltrickyiconxxiv,
            name = "tricky24",
            answerImage = R.drawable.trickyansxxiv,
            answer =" The one without a green leaf.",
            hint = null)

                    questionsList.add(trickyQuestion24)

            val trickyQuestion25 = Question(
                id = 25,
        question = " What should replace the question mark?",
        questionImage = R.drawable.trickyquesxxv,
        numberOfQuestions = 4,
        correctAnswer = 2,
        iconImage = R.drawable.trickyiconxxv,
        lockIconImage = R.drawable.ltrickyiconxxv,
        name = "tricky25",
        answerImage = R.drawable.trickyansxxv,
        answer =" The answer is shown in the picture.",
        hint = null)

        questionsList.add(trickyQuestion25)

        val trickyQuestion26 = Question(
            id = 26,
            question = " Six glasses (three empty and three full) are arranged as in " +
                    "the picture. By picking up only one glass, you can make the empty " +
                    "and full glasses alternate. Which glass should you take?",
            questionImage = R.drawable.trickyquesxxvi,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.trickyiconxxvi,
            lockIconImage = R.drawable.ltrickyiconxxvi,
            name = "tricky26",
            answerImage = R.drawable.trickyansxxvi,
            answer =" Take the second glass and pour its content into the fifth glass." +
                    " The answer is glass # 2.",
            hint = null)

                    questionsList.add(trickyQuestion26)

            val trickyQuestion27 = Question(
                id = 27,
        question = " You are standing in front of the maze (red dot in the picture). What" +
                " is the minimum number of turns you need to make to get to the exit from " +
                "the maze (green dot in the picture)?",
        questionImage = R.drawable.trickyquesxxvii,
        numberOfQuestions = 4,
        correctAnswer = 1,
        iconImage = R.drawable.trickyiconxxvii,
        lockIconImage = R.drawable.ltrickyiconxxvii,
        name = "tricky27",
        answerImage = R.drawable.trickyansxxvii,
        answer =" If the task is to make the minimum number of turns, then the" +
                " answer is to bypass the maze.",
        hint = null)

        questionsList.add(trickyQuestion27)

        val trickyQuestion28 = Question(
            id = 28,
            question = " Where is the Blue hiding?",
            questionImage = R.drawable.trickyquesxxviii,
            numberOfQuestions = 4,
            correctAnswer = 1,
            iconImage = R.drawable.trickyiconxxviii,
            lockIconImage = R.drawable.ltrickyiconxxviii,
            name = "tricky28",
            answerImage = R.drawable.trickyansxxviii,
            answer =" If you look at the blue color through a yellow lens, you will " +
                    "see the green color. ",
            hint = null)

                    questionsList.add(trickyQuestion28)

            val trickyQuestion29 = Question(
                id = 29,
        question = " Which switch lights the bulb?",
        questionImage = R.drawable.trickyquesxxix,
        numberOfQuestions = 4,
        correctAnswer = 3,
        iconImage = R.drawable.trickyiconxxix,
        lockIconImage = R.drawable.ltrickyiconxxix,
        name = "tricky29",
        answerImage = R.drawable.trickyansxxix,
        answer =" The wire can change color; it can start with one color and ends" +
                " with a different color.",
        hint = null)

        questionsList.add(trickyQuestion29)

        val trickyQuestion30 = Question(
            id = 30,
            question = " Rosie is the gray queen cat that you can see in the picture." +
                    " Sometimes Rosie can get into the paint. It happens ... What color is Rosie?",
            questionImage = R.drawable.trickyquesxxx,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.trickyiconxxx,
            lockIconImage = R.drawable.ltrickyiconxxx,
            name = "tricky30",
            answerImage = R.drawable.trickyansxxx,
            answer =" The picture shows Rosie to be ginger. She may have been gray " +
                    "initially, but now she is ginger.",
            hint = null)

                    questionsList.add(trickyQuestion30)

            val trickyQuestion31 = Question(
                id = 31,
        question = " What shape has this red round ball? A. Round B. Square C. Sphere D. Red ",
        questionImage = R.drawable.trickyquesxxxi,
        numberOfQuestions = 4,
        correctAnswer = 3,
        iconImage = R.drawable.trickyiconxxxi,
        lockIconImage = R.drawable.ltrickyiconxxxi,
        name = "tricky31",
        answerImage = R.drawable.trickyansxxxi,
        answer =" The answer is Sphere.",
        hint = null)

        questionsList.add(trickyQuestion31)

        val trickyQuestion32 = Question(
            id = 32,
            question = " Which is heavier underwater a pound of bananas or a pound of" +
                    " gold? A. A pound of bananas is heavier. B. A pound of gold is " +
                    "heavier. C. Both weigh the same.",
            questionImage = R.drawable.trickyquesxxxii,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.trickyiconxxxii,
            lockIconImage = R.drawable.ltrickyiconxxxii,
            name = "tricky32",
            answerImage = R.drawable.trickyansxxxii,
            answer =" According to Archimedes' law, a larger object with a lower density" +
                    " will be pushed out from the water strongly (feels easier underwater)." +
                    " As a result, the scales will outweigh in the direction of gold.",
            hint = null)

                    questionsList.add(trickyQuestion32)

            val trickyQuestion33 = Question(
                id = 33,
        question = " Which of the figures (I or II) contains 2 spirals? A. First. B. Second. " +
                "C. None. D. Both.",
        questionImage = R.drawable.trickyquesxxxiii,
        numberOfQuestions = 3,
        correctAnswer = 1,
        iconImage = R.drawable.trickyiconxxxiii,
        lockIconImage = R.drawable.ltrickyiconxxxiii,
        name = "tricky33",
        answerImage = R.drawable.trickyansxxxiii,
        answer =" The answer is shown in the picture.",
        hint = null)

        questionsList.add(trickyQuestion33)

        val trickyQuestion34 = Question(
            id = 34,
            question = " What should replace the question mark?",
            questionImage = R.drawable.trickyquesxxxiv,
            numberOfQuestions = 6,
            correctAnswer = 1,
            iconImage = R.drawable.trickyiconxxxiv,
            lockIconImage = R.drawable.ltrickyiconxxxiv,
            name = "tricky34",
            answerImage = R.drawable.trickyansxxxiv,
            answer =" The answer is shown in the picture.",
            hint = null)

                    questionsList.add(trickyQuestion34)

            val trickyQuestion35 = Question(
                id = 35,
        question = " How many faces are here in the picture?",
        questionImage = R.drawable.trickyquesxxxv,
        numberOfQuestions = 4,
        correctAnswer = 3,
        iconImage = R.drawable.trickyiconxxxv,
        lockIconImage = R.drawable.ltrickyiconxxxv,
        name = "tricky35",
        answerImage = R.drawable.trickyansxxxv,
        answer =" The answer is shown in the picture.",
        hint = null)

        questionsList.add(trickyQuestion35)

        val trickyQuestion36 = Question(
            id = 36,
            question = " How many holes can one count in this t-shirt?",
            questionImage = R.drawable.trickyquesxxxvi,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.trickyiconxxxvi,
            lockIconImage = R.drawable.ltrickyiconxxxvi,
            name = "tricky36",
            answerImage = R.drawable.trickyansxxxvi,
            answer =" The answer is shown in the picture.",
            hint = null)

                    questionsList.add(trickyQuestion36)

            val trickyQuestion37 = Question(
                id = 37,
        question = " Which number should replace the question mark?",
        questionImage = R.drawable.trickyquesxxxvii,
        numberOfQuestions = 6,
        correctAnswer = 5,
        iconImage = R.drawable.trickyiconxxxvii,
        lockIconImage = R.drawable.ltrickyiconxxxvii,
        name = "tricky37",
        answerImage = R.drawable.trickyansxxxvii,
        answer =" The answer is in the picture. If you look closely, the 2nd and " +
                "3rd equations contain 4 bananas; the last equation contains 3 bananas.",
        hint = null)

        questionsList.add(trickyQuestion37)

        val trickyQuestion38 = Question(
            id = 38,
            question = " How many phones can one charge if there is only one socket?",
            questionImage = R.drawable.trickyquesxxxviii,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.trickyiconxxxviii,
            lockIconImage = R.drawable.ltrickyiconxxxviii,
            name = "tricky38",
            answerImage = R.drawable.trickyansxxxviii,
            answer =" The answer is shown in the picture. Working adapters are shown " +
                    "in green, and non-working adapters are shown in red.",
            hint = null)

                    questionsList.add(trickyQuestion38)

            val trickyQuestion39 = Question(
                id = 39,
        question = " Which number should replace the question mark?",
        questionImage = R.drawable.trickyquesxxxix,
        numberOfQuestions = 6,
        correctAnswer = 5,
        iconImage = R.drawable.trickyiconxxxix,
        lockIconImage = R.drawable.ltrickyiconxxxix,
        name = "tricky39",
        answerImage = R.drawable.trickyansxxxix,
        answer =" This is a childish task in which you need to count the round pieces " +
                "that make up the numbers.",
        hint = null)

        questionsList.add(trickyQuestion39)

        val trickyQuestion40 = Question(
            id = 40,
            question = " Which items are different from the rest?",
            questionImage = R.drawable.trickyquesxl,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.trickyiconxl,
            lockIconImage = R.drawable.ltrickyiconxl,
            name = "tricky40",
            answerImage = R.drawable.trickyansxl,
            answer =" The peanut only is not a true nut (legume).",
            hint = null)

        questionsList.add(trickyQuestion40)



        val trickyQuestion41 = Question(
            id = 41,
            question = " Which number should replace the question mark?",
            questionImage = R.drawable.trickyquesxli,
            numberOfQuestions = 6,
            correctAnswer = 3,
            iconImage = R.drawable.trickyiconxli,
            lockIconImage = R.drawable.ltrickyiconxli,
            name = "tricky41",
            answerImage = R.drawable.trickyansxli,
            answer =" The answer is shown in the picture.",
            hint = null)

                    questionsList.add(trickyQuestion41)

            val trickyQuestion42 = Question(
                id = 42,
        question = " Find an analogy and replace the question mark.",
        questionImage = R.drawable.trickyquesxlii,
        numberOfQuestions = 4,
        correctAnswer = 1,
        iconImage = R.drawable.trickyiconxlii,
        lockIconImage = R.drawable.ltrickyiconxlii,
        name = "tricky42",
        answerImage = R.drawable.trickyansxlii,
        answer =" There are 9 squares in the left example, and there are 2 " +
                "cubes in the right one. It's that simple!",
        hint = null)

        questionsList.add(trickyQuestion42)

        val trickyQuestion43 = Question(
            id = 43,
            question = " What is the minimum number of points you need to put," +
                    " provided that at least one of these points " +
                    "should be on each line in the figure?",
            questionImage = R.drawable.trickyquesxiiil,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.trickyiconxliii,
            lockIconImage = R.drawable.ltrickyiconxliii,
            name = "tricky43",
            answerImage = R.drawable.trickyansxliii,
            answer ="3. The answer is shown in the picture.",
            hint = null)

                    questionsList.add(trickyQuestion43)

            val trickyQuestion44 = Question(
                id = 44,
        question = " The captain Jack needs to sail for the treasure chest" +
                " to the nearby island and return. On the first day," +
                " the wind will speed him up on the way to the island by 10%," +
                " on the second day by 20%, on the third day by 30%. On what" +
                " day is it the less time-consuming to sail for the treasure chest?",
        questionImage = R.drawable.trickyquesxliv,
        numberOfQuestions = 4,
        correctAnswer = 1,
        iconImage = R.drawable.trickyiconxliv,
        lockIconImage = R.drawable.ltrickyiconxliv,
        name = "tricky44",
        answerImage = R.drawable.trickyansxliv,
        answer =" It is best to sail on the day #1. Let's say your speed without" +
                " wind is 100. The wind will accelerate you towards the island by 10%" +
                " and slow you on the backway by 10%. Your total speed will be 100 × 0.9" +
                " × 1.1 = 99. On the second day, 100 × 0.8 × 1.2 = 96; and on the third day, " +
                "100 × 0.7 × 1.3 = 91.",
        hint = null)

        questionsList.add(trickyQuestion44)

        val trickyQuestion45 = Question(
            id = 45,
            question = " One night the ship's crew lowered a rope ladder, and the last rung" +
                    " barely touched a water surface. The distance between rungs is one foot." +
                    " Each night the tide raised the water level by two feet, and each day the " +
                    "ebb lowered the water level by a foot. In how many days 4 rungs" +
                    " went under the water?",
            questionImage = R.drawable.trickyquesxlv,
            numberOfQuestions = 4,
            correctAnswer = 4,
            iconImage = R.drawable.trickyiconxlv,
            lockIconImage = R.drawable.ltrickyiconxlv,
            name = "tricky45",
            answerImage = R.drawable.trickyansxlv,
            answer =" The ship rises with the tide. All the time the last " +
                    "rung will be at the level of the water surface. The answer is \"never\".",
            hint = null)

                    questionsList.add(trickyQuestion45)


            return questionsList
    }

    fun getImpossibleQuestions(): ArrayList<Question> {

        val questionsList = arrayListOf<Question>()

        val impossibleQuestion1 = Question(
            id = 1,
            question = "How many shapes can be made from four sticks with sticky ends," +
                    " if each sticky end can attach no more than three sticks, and the angle " +
                    "between the sticks cannot be 0 degrees. An example is given for three sticks " +
                    "for which 3 shapes are possible.",
            questionImage = R.drawable.impossiblequesi,
            numberOfQuestions = 6,
            correctAnswer = 2,
            iconImage = R.drawable.impossibleiconi,
            lockIconImage = R.drawable.limpossibleiconi,
            name = "impossible1",
            answerImage = R.drawable.impossibleansi,
            answer = "The answer is shown in the picture.",
            hint = "Calculate possible shapes. Not 3..."
        )

        questionsList.add(impossibleQuestion1)

        val impossibleQuestion2 = Question(
            id = 2,
            question = " How many tubes of glue were used to assemble the 3D " +
                    "figure in the 3rd row?",
            questionImage = R.drawable.impossiblequesii,
            numberOfQuestions = 6,
            correctAnswer = 3,
            iconImage = R.drawable.impossibleiconii,
            lockIconImage = R.drawable.limpossibleiconii,
            name = "impossible2",
            answerImage = R.drawable.impossibleansii,
            answer = " The answer is shown in the picture.",
            hint = " Each small cube requires a different amount of glue ..."
        )

        questionsList.add(impossibleQuestion2)

        val impossibleQuestion3 = Question(
            id = 3,
            question = "How many shapes (approximately), containing a cycle, can" +
                    " be made from six sticks with sticky ends, if each sticky end " +
                    "can attach no more than three sticks, and the angle between the " +
                    "sticks cannot be 0 degrees. An example is given for four" +
                    " sticks for which 2 shapes are possible.",
            questionImage = R.drawable.impossiblequesiii,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.impossibleiconiii,
            lockIconImage = R.drawable.limpossibleiconiii,
            name = "impossible3",
            answerImage = R.drawable.impossibleansiii,
            answer = "The answer is shown in the picture.",
            hint = "Do not forget about figures with several cycles (for example, a tetrahedron) …"
        )

        questionsList.add(impossibleQuestion3)

        val impossibleQuestion4 = Question(
            id = 4,
            question = "An arbitrary point was placed randomly inside of the square. " +
                    "Four lines were drawn from the middle of each side of the square" +
                    " to this point (see figure). You are given the areas of three of the " +
                    "four formed quadrangles. What is the area of the fourth quadrangle?",
            questionImage = R.drawable.impossiblequesiv,
            numberOfQuestions = 6,
            correctAnswer = 3,
            iconImage = R.drawable.impossibleiconiv,
            lockIconImage = R.drawable.limpossibleiconiv,
            name = "impossible4",
            answerImage = R.drawable.impossibleansiv,
            answer = "Draw a line segment from each vertex of the square to an arbitrary point " +
                    "and compare the resulting triangles. Triangles of the same color are" +
                    " equal. Let's create a system of 3 equations and find the" +
                    " area of the 4th quadrangle.",
            hint = "Draw a line segment from each vertex of the square to an arbitrary point…"
        )

        questionsList.add(impossibleQuestion4)

        val impossibleQuestion5 = Question(
            id = 5,
            question = "Each card, depending on its rank and suit, has its numeric " +
                    "value (see an example for the jack of hearts). Using the" +
                    " information about the values for other cards and their combinations," +
                    " replace a question mark with a number.",
            questionImage = R.drawable.impossiblequesv,
            numberOfQuestions = 4,
            correctAnswer = 3,
            iconImage = R.drawable.impossibleiconv,
            lockIconImage = R.drawable.limpossibleiconv,
            name = "impossible5",
            answerImage = R.drawable.impossibleansv,
            answer = "The answer is shown in the picture.",
            hint = "Create an equation…"
        )

        questionsList.add(impossibleQuestion5)

        val impossibleQuestion6 = Question(
            id = 6,
            question = "Weights are positioned on the hanging scale in such a way that" +
                    " the scales are in equilibrium and balanced as well." +
                    " What is the mass of the turquoise cone?",
            questionImage = R.drawable.impossiblequesvi,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.impossibleiconvi,
            lockIconImage = R.drawable.limpossibleiconvi,
            name = "impossible6",
            answerImage = R.drawable.impossibleansvi,
            answer = "The answer is shown in the picture.",
            hint = "The yellow cube is greater than 8 and less than 13..."
        )

        questionsList.add(impossibleQuestion6)

        val impossibleQuestion7 = Question(
            id = 7,
            question = "An alchemist can make 5 ounces of gold from 20 ounces of lead" +
                    " in 2 hours without a catalyst. For every 5% of catalyst, the conversion " +
                    "time is reduced by 3 times, and the yield increases by 20%. How much " +
                    "gold can an alchemist get in an hour if he starts with 40 ounces " +
                    "of lead and 20% of catalyst?",
            questionImage = R.drawable.impossiblequesvii,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.impossibleiconvii,
            lockIconImage = R.drawable.limpossibleiconvii,
            name = "impossible7",
            answerImage = R.drawable.impossibleansvii,
            answer = "All lead will be turned into gold in less than an hour (actually in a" +
                    " couple of minutes). 40 ounces of lead would be turned into 10 ounces " +
                    "of gold without a catalyst. With a catalyst, the yield increases by" +
                    " 20% * 4 = 80%. That's 10 * 180% = 18 ounces of gold.",
            hint = "By using the catalyst, the alchemist will also have time to smoke a pipe..."
        )

        questionsList.add(impossibleQuestion7)

        val impossibleQuestion8 = Question(
            id = 8,
            question = "The clocks are placed in a logical sequence. Which time should" +
                    " replace the question mark?",
            questionImage = R.drawable.impossiblequesviii,
            numberOfQuestions = 3,
            correctAnswer = 1,
            iconImage = R.drawable.impossibleiconviii,
            lockIconImage = R.drawable.limpossibleiconviii,
            name = "impossible8",
            answerImage = R.drawable.impossibleansviii,
            answer = "The answer is shown in the picture.",
            hint = "More complex than the usual addition..."
        )

        questionsList.add(impossibleQuestion8)

        val impossibleQuestion9 = Question(
            id = 9,
            question = "Andrew, Chris, and Steffen competed in archery. Each " +
                    "scored 1420 points in 6 shots. Who got in the \"1000\", if Andrew" +
                    " scored 440 points in 2 shots, and Steffen got in the \"60\"?",
            questionImage = R.drawable.impossiblequesix,
            numberOfQuestions = 3,
            correctAnswer = 3,
            iconImage = R.drawable.impossibleiconix,
            lockIconImage = R.drawable.limpossibleiconix,
            name = "impossible9",
            answerImage = R.drawable.impossibleansix,
            answer = "There is only one combination in which all the" +
                    " conditions shown in the figure are met.",
            hint = "Consider the possible options, there are not so many of them..."
        )

        questionsList.add(impossibleQuestion9)

        val impossibleQuestion10 = Question(
            id = 10,
            question = "How many triangles are shown in this figure?",
            questionImage = R.drawable.impossiblequesx,
            numberOfQuestions = 6,
            correctAnswer = 3,
            iconImage = R.drawable.impossibleiconx,
            lockIconImage = R.drawable.limpossibleiconx,
            name = "impossible10",
            answerImage = R.drawable.impossibleansx,
            answer = "The answer is shown in the picture.",
            hint = "Use combinatorics to solve the main triangle, count the small ones ..."
        )

        questionsList.add(impossibleQuestion10)

        val impossibleQuestion11 = Question(
            id = 11,
            question = "In how many ways a 3x4 rectangle can be cut into two equal parts " +
                    "so that the parts are of different colors and integral? Note," +
                    " you should not count two rectangles if they can be transformed" +
                    " from one type to another just by rotations of any type. " +
                    "See examples of rules in the figure. ",
            questionImage = R.drawable.impossiblequesxi,
            numberOfQuestions = 4,
            correctAnswer = 2,
            iconImage = R.drawable.impossibleiconxi,
            lockIconImage = R.drawable.limpossibleiconxi,
            name = "impossible11",
            answerImage = R.drawable.impossibleansxi,
            answer = "The answer is shown in the picture.",
            hint = "Use combinatorics to solve this task…"
        )

        questionsList.add(impossibleQuestion11)

        val impossibleQuestion12 = Question(
            id = 12,
            question = "The two cars started moving at the same time at constant speeds. A" +
                    " blue car moved from city V to city U, and a green car from U to V." +
                    " When these cars met, the blue car was 9 hours away from U," +
                    " and the green car was 4 hours away from V. How long did the driver" +
                    " of the green car spend behind the wheel?",
            questionImage = R.drawable.impossiblequesxii,
            numberOfQuestions = 6,
            correctAnswer = 4,
            iconImage = R.drawable.impossibleiconxii,
            lockIconImage = R.drawable.limpossibleiconxii,
            name = "impossible12",
            answerImage = R.drawable.impossibleansxii,
            answer = "The answer is shown in the picture.",
            hint = "Do not know how to solve? Then just go from 6 possible answers…"
        )
        questionsList.add(impossibleQuestion12)

        return questionsList
    }


    }