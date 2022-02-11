package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/11
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 泛型通配符
 */
open class Food(val name: String)
open class Flower(val name: String)

class Rice : Food("大米")
class Rose : Flower("玫瑰")
class Container<T>(var content: T)

fun printInfo(container: Container<*>) {
    val content = container.content
    if (content is Food) {
        println(content.name)
    } else if (content is Flower) {
        println(content.name)
    }
}

fun main(args: Array<String>) {
    val riceContainer = Container(Rice())
    val roseContainer = Container(Rose())
    printInfo(riceContainer)
    printInfo(roseContainer)
}