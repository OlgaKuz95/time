package  ru.netology

fun main() {

    val sec = 0..60
    val minute = 61..60 * 60
    val hour = 60 * 60 + 1..24 * 60 * 60
    val oneDay = 24 * 60 * 60 + 1..24 * 60 * 60 * 2
    val twoDay = 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3
    val threeDay = 24 * 60 * 60 * 3 + 1
    val lastTime = 3601
    val timeSeveral = 10

    val result = agoToText(lastTime, timeSeveral, sec, minute, hour, oneDay, twoDay, threeDay)
    println("   $result")


}


fun agoToText(

    lastTime: Int,
    timeSeveral: Int,
    sec: IntRange,
    minute: IntRange,
    hour: IntRange,
    oneDay: IntRange,
    twoDay: IntRange,
    threeDay: Int,


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










