package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/7
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 类的定义
 */
class Person {
    // name属性，默认是公有属性
    var name: String = ""

    // age属性，是私有属性
    private var age: Int = 0

    fun setAge(age: Int) {
        if (age >= 0) {
            this.age = age
        } else {
            println("输入年龄有误!")
        }
    }

    // 默认sayHello()方法为公有方法
    fun sayHello(): Unit {
        println("我叫${name},我今年${age}岁。")
    }
}

fun main(args: Array<String>) {
    val person = Person()
    person.name = "小雷"  // 访问公有属性
    person.setAge(-4)   // 访问私有属性age
    person.sayHello()   // 范文公有方法sayHello()
}