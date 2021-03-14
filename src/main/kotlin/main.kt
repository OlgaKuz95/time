package  ru.netology

fun main() {
    val sec = 0..60
    val minute = 61..60*60
    val hour = 60*60+1..24*60*60
    val oneDay = 24 * 60 * 60+1..24*60*60*2
    val twoDay =24*60*60*2+1..24*60*60*3
    val threeDay =24*60*60*3+1
    val lastTime = 3601
    val timeSeveral =10

    val result = agoToText(lastTime, timeSeveral,sec,minute,hour, oneDay, twoDay, threeDay)
    println(" $result")


}




fun agoToText(
    lastTime: Int,
    timeSeveral: Int = 10,
    sec: IntRange =  0..60,
    minute: IntRange = 61..60*60,
    hour: IntRange = 60*60+1..24*60*60,
    oneDay: IntRange = 24 * 60 * 60+1..24*60*60*2,
    twoDay: IntRange =24*60*60*2+1..24*60*60*3,
    threeDay: Int =24*60*60*3+1,




){

    val lastAgo = lastTime%timeSeveral
    val lastHour =lastTime%timeSeveral
    val result = time(timeSeveral, lastTime)
    println("$result")


    when(lastTime){

          in sec -> println ("был(а) только что")
          in minute->println("был(а):  $lastAgo назад" )
        in  hour ->println("был(а) $lastHour  назад")
        in oneDay->println("был(а) сегодня")
        in twoDay->println("был(а) вчера")
         threeDay ->println("был(а) давно")


    }

}




fun time (
    timeSeveral: Int = 10,
    lastTime: Int = 61,

    ) {
    val lastAgo = lastTime%timeSeveral
    when(lastAgo){
        1 -> println("минуту назад")
        2,3,4->println("минуты назад")
        0,5,6,7,8,9 ->println("минут назад")
    }

}
fun hourTime(
    timeSeveral: Int = 10,
    lastTime: Int =61


) {
    val lastHour = lastTime % timeSeveral
    when (lastHour) {
        1 -> println("час назад")
        2, 3, 4 -> println("часа назад")
        0, 5, 6, 7, 8, 9 ->println ("часов назад")
    }
}






