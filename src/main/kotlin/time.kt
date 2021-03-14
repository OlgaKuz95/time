package ru.netology

fun time (

) {
    val timeSeveral: Int = 10
    val lastTime: Int = 61
    val lastAgo = lastTime%timeSeveral
    when(lastAgo){
        1 -> println("минуту назад")
        2,3,4->println("минуты назад")
        0,5,6,7,8,9 ->println("минут назад")
    }

}