package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 调用泛型上界类中的方法
 */
fun <T : Number> twice(value: T): Double {
    return value.toDouble() * 2
}

fun main(args: Array<String>) {
    // 将4.0f传递到twice()中并打印结果
    println("4.0的两倍：${twice(4.0f)}")
    // 将4传递到twice()中并打印结果
    println("4的两倍：${twice(4)}")
}