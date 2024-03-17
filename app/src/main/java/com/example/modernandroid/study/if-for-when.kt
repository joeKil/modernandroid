package com.example.modernandroid.study

// if, for, when
fun main() {
    val x = 2
    if (x % 2 == 0) {
        println("짝수")
    }

    val isEven = if (x % 2 == 0) "짝" else "홀" // 이런식의 문법도 가능 if문이라 안하고 if식이라 하지만 말이 이상해서 if문이라 부름

    val numbers = listOf(1, 2, 3, 4, 5)

    for (i in numbers) {
        println(i)
    }

    for (i in 0..9) {
        println(i)
    }
}

fun main2() {
    var x = 1

    // when도 다 식이다.
    when (x) {
        1 -> print("1입니다.")
        2 -> print("2입니다.")
        3, 4, 5 -> print("3이나 4 5입니다.")
        in 6..20 -> print("6부터 20 사이의 값입니다.")
        !in 8..10 -> print("")
        else -> print("else")
    }

    // 이런식으로도 표현 가능
//    val y = when (x) {
//        1 -> print("1입니다.")
//        2 -> print("2입니다.")
//        3, 4, 5 -> print("3이나 4 5입니다.")
//        in 6..20 -> print("6부터 20 사이의 값입니다.")
//        !in 8..10 -> print("")
//        else -> print("else")
//    }
}