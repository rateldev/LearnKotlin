package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/11
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 非子类型
 */
fun output(number: Number) {
    println(number)
}

fun main(args: Array<String>) {
    val i = 1
    output(i)
    val str = "Hello"
    // output(str) 编译器会提示错误
}