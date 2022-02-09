package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 高阶函数查找元素操作
 * first()与last()方法
 */
fun main(args: Array<String>) {
    val list = listOf(-2, -1, 0, 1, 2)
    println("--------first--------")
    println(
        "大于0的元素：${
            list.first {
                it > 0
            }
        }"
    )
    println(
        "大于0的元素：${
            list.last {
                it > 0
            }
        }"
    )
    println(
        "等于3的元素：${
            list.first {
                it == 3
            }
        }"
    )
}