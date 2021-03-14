package ru.netology

fun hourTime(



) {
    val timeSeveral: Int = 10
    val lastTime: Int =61
    val lastHour = lastTime % timeSeveral
    when (lastHour) {
        1 -> println("час назад")
        2, 3, 4 -> println("часа назад")
        0, 5, 6, 7, 8, 9 ->println ("часов назад")
    }
}