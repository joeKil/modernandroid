package com.example.modernandroid

/**
 * 코틀린은 타입 추론 시스템을 가지고 있어서 타입을 쓰지 않아도 타입을 안다.
 */

//fun main() {
//    var x = 10 // int 형 변수
//    var str = "Hello"
//    var isMarried = true
//
//    print("${str} World")
//
//    print(myMethod(10, 20))

//    x = 20
//    str = "world"
//
//    var a: Int = 10
//    var a: Int // 이런 코드는 코틀린에서 선호하지 않는다. 선언과 동시에 초기화하는게 코틀린의 스타일이다.
//    a= 10
// 코틀린에서는 데이터타입을 대문자로 써준다.
// 변수명은 카멜케이스로 써준다.

//    var b = 10
//    b = 20
//}

// 다른 메소드 만드려면 fun을 쓰면됨.
//fun myMethod(a: Int, b: Int): Int {
//    return a + b
//} 이렇게 한 줄로 끝날 수 있는 코드는 한 줄로 쓰면됨.
/// fun myMethod(a: Int, b: Int) = a + b

// 리턴이 없는 함수
//fun myMethod(a: Int, b: Int) { // Unit은 void와 같은 의미 리턴이 없을 땐 안써주는게 일반적인 케이스
//    println(a + b)
//}

// Unit, 배열, 리스트
fun main() {
    // 코틀린은 자바의 에러를 최대한 줄이기 위해 만든 언어. 에러를 줄이기 위해선 변수를 최대한 줄인다.
    //  val items =  arrayOf(1, 2, 3, 4, 5) // 배열, arrayOf는 잘 쓰지 않는다
    var items = listOf(1, 2, 3, 4, 5) // 리스트는 한번 생성되면 불변임.
    // 불변x 변경o
    var items2 = arrayListOf(1, 2, 3, 4, 5)

    items2.add(6)
    items2.remove(1)

    items2[0] = 10 // 인덱스 참조해서 값을 할당
    print(items2)
}
