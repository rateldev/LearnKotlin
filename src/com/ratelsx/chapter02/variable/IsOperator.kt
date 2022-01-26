package com.ratelsx.chapter02.variable

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 类型检查
 */
fun main(args: Array<String>) {
    val a: Any = "hello"
    val result1 = a is String
    val result2 = a !is String
    println(result1)
    println(result2)
}