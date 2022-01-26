package com.ratelsx.chapter02.array

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 查找数组中第1个为4元素的角标
 */
fun main(args: Array<String>) {
    val newArr = intArrayOf(6, 4, 3, 4, 9)
    // 查找数组中的第一个元素为4的对应元素
    val index = newArr.indexOfFirst {
        // 将需要查找的元素赋值给it
        it == 4
    }
    println("第一个元素4的角标为$index")
}