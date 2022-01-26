package com.ratelsx.chapter02.array

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 数组的定义
 */
fun main(args: Array<String>) {
    // 声明变量并初始化
    val intArr: IntArray = intArrayOf(1, 2, 3)
    // 访问数组中的第一个元素
    println("intArr[0]=" + intArr[0])
    println("intArr[1]=" + intArr[1])
    println("intArr[2]=" + intArr[2])
    // 打印数组长度
    println("数组的长度是：" + intArr.size)
}