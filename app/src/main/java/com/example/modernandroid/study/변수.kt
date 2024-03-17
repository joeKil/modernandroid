package com.example.modernandroid.study

/**
 * 코틀린은 타입 추론 시스템을 가지고 있어서 타입을 쓰지 않아도 타입을 안다.
 */

fun main() {
    var x = 10 // int 형 변수
    var str = "Hello"
    var isMarried = true

    print("${str} World")

    print(myMethod(10, 20))

    x = 20
    str = "world"

    var a: Int = 10
//  var a: Int // 이런 코드는 코틀린에서 선호하지 않는다. 선언과 동시에 초기화하는게 코틀린의 스타일이다.
    a = 10
// 코틀린에서는 데이터타입을 대문자로 써준다.
// 변수명은 카멜케이스로 써준다.

    var b = 10
    b = 20
}

// 다른 메소드 만드려면 fun을 쓰면됨.
//fun myMethod(a: Int, b: Int): Int {
//    return a + b
//} 이렇게 한 줄로 끝날 수 있는 코드는 한 줄로 쓰면됨.

//fun myMethod(a: Int, b: Int) = a + b

// 리턴이 없는 함수
fun myMethod(a: Int, b: Int) { // Unit은 void와 같은 의미 리턴이 없을 땐 안써주는게 일반적인 케이스
    println(a + b)
}