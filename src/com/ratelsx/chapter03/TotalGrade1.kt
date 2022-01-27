package com.ratelsx.chapter03

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可变参数
 * 在实参中传递数组时，需要使用“*”前缀操作符，
 * 意思是将数组展开，它只能展开数组，不能展开集合。
 */

fun main(args: Array<String>) {
    val scores = intArrayOf(100, 99, 98, 100, 96)
    sum("江小白", * scores)
}

fun sum(name: String, vararg scores: Int) {
    var result = 0
    scores.forEach {
        result += it
    }
    println("江小白的总成绩：$result")
}
