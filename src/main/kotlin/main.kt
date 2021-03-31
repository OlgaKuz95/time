package  ru.netology

fun main() {

    //val lastTime = 360




    val result = agoToText()
    println("   $result")


}


fun agoToText(

    lastTime: Int= 56,
    timeSeveral: Int= 10,
    sec: IntRange = 0..60,
    minute: IntRange= 61..60 * 60,
    hour: IntRange = 60 * 60 + 1..24 * 60 * 60,
    oneDay: IntRange= 24 * 60 * 60 + 1..24 * 60 * 60 * 2,
    twoDay: IntRange= 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3,
    threeDay: Int= 24 * 60 * 60 * 3 + 1,


    ) {

    val lastAgo = lastTime % timeSeveral


       val result = when (lastAgo) {
        1 ->  "$lastTime минуту "
        2, 3, 4 -> ("$lastTime минуты ")
        0,5,6,7,8,9 -> ("$lastTime минут")

           else -> "error"
       }
    val lastHour = lastTime % timeSeveral
   val res = when (lastHour) {
        1 -> " час "
        2, 3, 4 -> "часа "
        0,5,6,7,8,9 -> "часов "
       else->"error"
    }

    when (lastTime) {

        in sec -> println("был(а) только что")
        in minute -> println("был(а):   $result  назад")
        in hour -> println("был(а):  $res  назад")
        in oneDay -> println("был(а) сегодня")
        in twoDay -> println("был(а) вчера")
        threeDay -> println("был(а) давно")


    }

}










