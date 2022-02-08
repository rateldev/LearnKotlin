package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 单例模式
 */
object Singleton {
    var name = "单例模式"
    fun sayHello() {
        println("Hello!,我是一个$name,浑身充满正能量")
    }
}

fun main(args: Array<String>) {
    Singleton.name = "小太阳"
    Singleton.sayHello()
}