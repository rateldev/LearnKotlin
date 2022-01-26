package com.ratelsx.chapter02.array

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 数组元素修改
 */
fun main(args: Array<String>) {
    // 定义数组newArr并初始化
    val newArr: IntArray = intArrayOf(1, 2, 3, 4)
    // 将角标为0对应的元素设置为10
    newArr[0] = 10
    // 将角标为3对应的元素设置为16
    newArr[3] = 16
    newArr.forEachIndexed { index, i ->
        // 打印数组中的角标和元素
        println("角标=$index 元素=$i")
    }
}