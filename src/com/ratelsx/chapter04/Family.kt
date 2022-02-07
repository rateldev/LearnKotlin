package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/7
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 类的继承、方法重写、super
 */
open class Father {
    open var name = "江小白"
    open var age = 35
    open fun sayHello() {
        println("Hello!我叫$name,我今年$age 岁。")
    }
}

class Son : Father() {
    override var name = "小小白"
    override var age = 5

    override fun sayHello() {
        super.sayHello()
        println("Hello!我是江小白的儿子,我叫$name,我今年$age 岁。")
    }
}

fun main(args: Array<String>) {
    val son = Son()
    son.sayHello()
}