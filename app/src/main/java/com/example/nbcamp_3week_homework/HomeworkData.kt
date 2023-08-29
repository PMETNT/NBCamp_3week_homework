package com.example.nbcamp_3week_homework

data class HomeworkData(
    val homeworkPhoto: Int,
    val homeworkName: String,
    val homeworkPhoneNumber: String,
    var homeworkBookmark: Boolean




)

object HomeworkUserDB {

    var homeworkUserList = mutableListOf<HomeworkData>()

    init {
        homeworkUserList.add(HomeworkData(R.drawable.user1, "A철수", "01020231111", false ))
        homeworkUserList.add(HomeworkData(R.drawable.user2, "B철수", "01020232222", false ))
        homeworkUserList.add(HomeworkData(R.drawable.user3, "C철수", "01020233333", false ))
        homeworkUserList.add(HomeworkData(R.drawable.user4, "D철수", "01020234444", false ))
        homeworkUserList.add(HomeworkData(R.drawable.user5, "E철수", "01020235555", false ))
        homeworkUserList.add(HomeworkData(R.drawable.user6, "F철수", "01020236666", false ))
        homeworkUserList.add(HomeworkData(R.drawable.user7, "G철수", "01020237777", false ))
        homeworkUserList.add(HomeworkData(R.drawable.user8, "H철수", "01020238888", false ))
        homeworkUserList.add(HomeworkData(R.drawable.user9, "I철수", "01020239999", false ))
        homeworkUserList.add(HomeworkData(R.drawable.user10, "J철수", "01020231010", false ))

    }


}
