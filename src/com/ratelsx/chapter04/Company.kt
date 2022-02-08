package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 伴生对象
 */
class Company {
    companion object Factory {
        fun sayHello() {
            println("我是一个伴生对象，与类相生相伴")
        }
    }
}

fun main(args: Array<String>) {
    // 调用伴生对象中的函数
    // 第一种调用方式：类名.伴生对象名.成员函数名
    Company.Factory.sayHello()
    // 第二种调用方式：类名.成员函数名
    Company.sayHello()
}