package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 高阶函数查找元素操作
 * count()方法
 * 用于查找满足于当前条件的元素个数
 */
fun main(args: Array<String>) {
    val list = listOf(60, 80, 100, 120, 140)
    println(
        "查找大于100的元素个数：${
            list.count {
                it > 100
            }
        }"
    )
    println(
        "查找小于60的元素个数：${
            list.count {
                it < 60
            }
        }"
    )
}