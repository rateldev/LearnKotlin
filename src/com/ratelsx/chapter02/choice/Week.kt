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
    val week = 3
    when (week) {
        1 -> println("星期一")
        2 -> println("星期二")
        3 -> println("星期三")
        4 -> println("星期四")
        5 -> println("星期五")
        6 -> println("星期六")
        7 -> println("星期日")
        else -> {
            println("输入的数字不正确......")
        }
    }
}