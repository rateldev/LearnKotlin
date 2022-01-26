package com.ratelsx.chapter02.choice

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * if…else语句
 */
fun main(args: Array<String>) {
    val max: Int
    val a = 5
    val b = 6
    max = if (a > b) {
        a
    } else {
        b
    }

    println("max=$max")
}