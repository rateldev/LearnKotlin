package com.ratelsx.chapter02.array

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 查找数组中指定元素的最后一个角标
 */
fun main(args: Array<String>) {
    val newArr = intArrayOf(6, 4, 3, 4, 9)
    println("最后一个元素4的角标为" + newArr.lastIndexOf(4))
}