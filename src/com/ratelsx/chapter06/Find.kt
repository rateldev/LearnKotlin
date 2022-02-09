package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 高阶函数查找元素操作
 */
fun main(args: Array<String>) {
    val list = listOf(-2, -1, 0, 1, 2)
    println("--------find--------")
    println("找出大于0的元素：${
        list.find { it > 0 }
    }")
    println("找出等于3的元素：${
        list.find { it == 3 }
    }")
}