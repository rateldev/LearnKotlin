package com.ratelsx.chapter02.cycle

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 带角标的forEachIndexed语句
 */
fun main(args: Array<String>) {
    // 定义数组arr并初始化
    val arr = intArrayOf(1, 2, 3, 4)
    arr.forEachIndexed { index, it ->
        println("角标=$index 元素=${it}")
    }

}