package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 受检异常
 */
fun getAge(): Int? {
    return try {
        val age = "Age=18岁"
        Integer.parseInt(age)
    } catch (e: NumberFormatException) {
        0
    }
}

fun main(args: Array<String>) {
    val age = getAge()
    println("年龄：${age}岁")
}