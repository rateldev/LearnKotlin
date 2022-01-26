package com.ratelsx.chapter02.array

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * for循环遍历数组中的元素以及角标
 */
fun main(args: Array<String>) {
    val intArr = intArrayOf(1, 2, 3, 4)
    for ((index, i) in intArr.withIndex()) {
        println("角标=$index 元素=$i")
    }
}