package com.ratelsx.chapter03

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可变参数
 */
fun main(args: Array<String>) {
    sum(100, 99, 98, 100, 96, name = "江小白")
}

fun sum(vararg scores: Int, name: String) {
    var result = 0
    scores.forEach {
        result += it
    }
    println("江小白的总成绩：$result")
}