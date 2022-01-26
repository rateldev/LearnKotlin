package com.ratelsx.chapter02.cycle

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 普通的forEach语句
 */
fun main(args: Array<String>) {
    // 定义数组arr并初始化
    val arr = intArrayOf(1, 2, 3, 4)
    arr.forEach {
        print(it.toString() + "\t")
    }
}