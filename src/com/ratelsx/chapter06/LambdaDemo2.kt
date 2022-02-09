package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 有参数有返回值Lambda表达式
 */
fun main(args: Array<String>) {
    val sum = { a: Int, b: Int ->
        a + b
    }
    println(sum(6, 8))
}