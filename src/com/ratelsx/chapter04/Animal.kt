package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/7
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 抽象类、接口
 */
interface Animal {
    fun eat()
}

class Monkey(private val food: String) : Animal {
    override fun eat() {
        println("猴子正在吃$food")
    }
}

fun main(args: Array<String>) {
    val monkey = Monkey("香蕉")
    monkey.eat()
}