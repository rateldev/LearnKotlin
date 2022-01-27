package com.ratelsx.chapter03

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 递归函数
 */

fun main(args: Array<String>) {
    // 调用递归函数
    println(sum(4))
}

// 定义一个sum()函数
fun sum(num: Int): Int {
    // num为1时，则指定返回值为1
    return if (num == 1) {
        1
    } else {
        // num不为1时，返回num与sum()返回值之和
        num + sum(num - 1)
    }
}