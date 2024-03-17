package com.example.modernandroid.study

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
