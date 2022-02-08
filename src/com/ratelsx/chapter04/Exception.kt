package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 异常
 */
fun divide(a: Int, b: Int): Int {
    if (b == 0) throw ArithmeticException("发生异常")
    return a / b
}

fun main(args: Array<String>) {
    try {
        // 调用divide()
        val result = divide(5, 0)
        println(result)
    } catch (e: Exception) {
        println(e.message)
    }
}