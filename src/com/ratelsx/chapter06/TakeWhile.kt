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
 * takeWhile()方法
 *
 * 当调用takeWhile()方法时，匹配条件必须是
 * 第1个元素满足条件才可以继续向下查找
 */
fun main(args: Array<String>) {
    val list = listOf(-2, -1, 0, 1, 2)
    println(
        "大于-3的元素${
            list.takeWhile {
                // 第1个需求
                it > -3
            }
        }"
    )
    println(
        "大于0的元素${
            list.takeWhile {
                // 第1个需求
                it > 0
            }
        }"
    )
    println(
        "小于1的元素${
            list.takeWhile {
                // 第1个需求
                it < 1
            }
        }"
    )
}