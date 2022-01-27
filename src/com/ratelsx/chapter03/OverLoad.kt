package com.ratelsx.chapter03

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 函数重载
 */
fun main(args: Array<String>) {
    val a1 = totalNum(5)
    val a2 = totalNum(5F)
    val a3 = totalNum(5, 0)
    println("a1=$a1")
    println("a2=$a2")
    println("a3=$a3")
}

/**
 * 定义一个函数totalNum()，函数有一个参数，参数类型为Int
 */
fun totalNum(num: Int): Int {
    return if (num == 1) {
        1
    } else {
        num + totalNum(num - 1)
    }
}

/**
 * 定义一个函数totalNum()，函数有一个参数，参数类型为Float
 */
// 重载函数参数类型不同
fun totalNum(num: Float): Float {
    return if (num == 1F) {
        1F
    } else {
        num + totalNum(num - 1F)
    }
}

/**
 * 定义一个函数totalNum()，函数有2个参数，参数类型是Int
 */
// 重载函数参数个数不同
fun totalNum(num: Int, total: Int = 0): Int {
    return if (num == 1) {
        1 + total
    } else {
        totalNum(num - 1, num + total)
    }
}
