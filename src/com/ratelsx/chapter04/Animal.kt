package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/7
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 接口定义与继承
 */
interface Animal {
    fun eat()
}

interface Monkey : Animal {
    fun sleep()
}

class GoldenMonkey(private val food: String) : Monkey {
    override fun sleep() {
        println("我是金丝猴，我喜欢吃$food")
    }

    override fun eat() {
        println("我是金丝猴，我喜欢睡觉")
    }
}

fun main(args: Array<String>) {
    val goldenMonkey = GoldenMonkey("香蕉")
    goldenMonkey.eat()
    goldenMonkey.sleep()
}