package com.example.modernandroid.study

fun main() {
    val person = Person1("홍길동", 20)

    print(person)
}

data class Person1(
    val name: String,
    val age: Int
)

/*
* data class는 데이터를 담는 클래스를 만들 때 사용한다.
 */

