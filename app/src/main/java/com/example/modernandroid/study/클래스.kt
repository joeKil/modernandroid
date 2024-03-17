package com.example.modernandroid.study

fun main() {
    // Person person = new Person(); 자바에서는 이렇게 씀.
    val person = Person("홍길동") // 코틀린에서는 이렇게 씀.
    println(person.name) // psrson.getName() 자바에서는 이런식으로 쓰는데 코틀린도 내부적으로는 이런 코드로 접근 한다고 보면 된다.
}

// var name: String 이 부분이 생성자다. 바로 선언할 수 있다.
class Person(var name: String) { // var라고 지정해 놓으면 언제든 변경 가능 하지만 val라고 쓰면 변경이 안된다.
    // 내용이 있고 없고에 따라 중괄호는 생략 가능하다.
    init {
        println(name) // 생성자 호출 이 후에 실행되는 블럭
    }
}
