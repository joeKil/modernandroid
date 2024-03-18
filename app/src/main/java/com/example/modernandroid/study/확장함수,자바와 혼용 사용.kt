package com.example.modernandroid.study

/*
코틀린을 쓰는 중요한 이유는 에러를 내지 않기 위함이다.
코틀린은 null에 안전한 타입을 사용하고 있다.
 */


fun main() {
    val str = "Hello"
    // 코틀린에서 이런식으로 자바를 쓸 수 있다.
    // 주의점들은 있다.
    val item = Item("항아리")
    println(str.myLength())
    print(item)
}

// 확장함수를 사용하면 상속을 받지 않아도 사용 가능
// 이렇게 쓰면 String 클래스가 myLength 메소드가 생긴다.
fun String.myLength(): Int {
    return this.length
}

