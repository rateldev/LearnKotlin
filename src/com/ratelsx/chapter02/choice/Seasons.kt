package com.ratelsx.chapter02.choice

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * when条件语句
 */
fun main(args: Array<String>) {
    val month = 7
    when (month) {
        12, 1, 2 -> println("冬季")
        3, 4, 5 -> println("春季")
        6, 7, 8 -> println("夏季")
        9, 10, 11 -> println("秋季")
        else -> {
            println("没有这个月份，请重新输入......")
        }
    }
}