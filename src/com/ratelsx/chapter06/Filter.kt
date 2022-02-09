package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 高阶函数查找元素操作
 *
 * filter()方法
 */
fun main(args: Array<String>) {
    val list = listOf(-2, -1, 0, 1, 2)
    println(
        "大于-3的元素：${
            list.filter {
                // 第1个需求
                it > -3
            }
        }"
    )
    println(
        "大于0的元素：${
            list.filter {
                // 第2个需求
                it > 0
            }
        }"
    )
    println(
        "小于0的元素：${
            list.filter {
                // 第3个需求
                it < 0
            }
        }"
    )
}