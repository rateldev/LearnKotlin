package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 高阶函数比较元素操作
 */
fun main(args: Array<String>) {
    val list = listOf(-2, 0, 0, 1, 1, 2)
    println("--------查找最大值--------")
    println(list.maxByOrNull { it })
    println("--------查找最小值--------")
    println(list.minByOrNull { it })
    println("--------集合去重--------")
    println(list.distinctBy { it })
}