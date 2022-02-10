package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 自定义泛型方法
 */
fun <T> printInfo(content: T) {
    when (content) {
        is Int -> println("传入的$content,是一个Int类型")
        is String -> println("传入的$content,是一个String类型")
        else -> println("传入的$content,不是Int类型，也不是String类型")
    }
}

fun main(args: Array<String>) {
    printInfo(10)
    printInfo("hello world")
    printInfo(true)
}