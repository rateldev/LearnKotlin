package com.ratelsx.chapter03

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 函数的定义
 */


fun main(args: Array<String>) {
    // result变量存放doubleValue()的返回值
    val result = doubleValue(2)
    // 打印doubleValue()的返回值
    println("doubleValue()的返回值为$result")
}

// 定义一个doubleValue()函数，参数为x，参数为Int类型，返回值为Int类型
fun doubleValue(x: Int): Int {
    // 返回值是传递过来的参数*2的值
    return 2 * x
}
