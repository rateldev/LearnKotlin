package com.ratelsx.chapter03

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 成员函数
 */
// 创建一个Person类
class Person {
    // 定义一个成员函数
    fun hello() {
        println("Hello")
    }
}

fun main(args: Array<String>) {
    // 创建Person类的实例
    val person = Person()
    // 调用Person类中的成员函数hello()
    person.hello()
}