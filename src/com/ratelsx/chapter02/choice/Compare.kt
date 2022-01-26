package com.ratelsx.chapter02.choice

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * when语句匹配布尔值
 */
fun main(args: Array<String>) {
    val a = 7
    val b = 8
    when {
        a > b -> println("a大于b")
        a < b -> println("a小于b")
        else -> println("a等于b")
    }
}