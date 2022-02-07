package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/7
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 类的继承
 */
open class Father {
    fun sayHello() {
        println("Hello")
    }
}

class Son : Father() {

}

fun main(args: Array<String>) {
    val son = Son()
    son.sayHello()
}