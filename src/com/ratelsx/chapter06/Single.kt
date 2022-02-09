package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 高阶函数查找元素操作
 * Single()方法
 *
 * 满足条件的元素只能有一个，多个或者没有都会抛出异常。
 */
fun main(args: Array<String>) {
    val list = listOf(-2, -1, 0, 1, 2)
    println(
        "大于1的元素：${
            list.single {
                it > 1
            }
        }"
    )
    println(
        "大于-2的元素：${
            list.single {
                it > 0
            }
        }"
    )
}