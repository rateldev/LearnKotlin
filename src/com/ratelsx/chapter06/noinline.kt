package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 禁用内联函数
 */
inline fun check(noinline function: (Int) -> Boolean) {
    test(function)
}

fun test(function: (Int) -> Boolean) {
    println("编译通过")
}

fun main(args: Array<String>) {
    check { x: Int -> x == 2 }
}
