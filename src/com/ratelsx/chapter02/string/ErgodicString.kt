package com.ratelsx.chapter02.string

/**
 * @author Ratel
 * @date 2022/1/25
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 */
fun main(args: Array<String>) {
    val str = "Hello World!"
    // 获取字符串长度
    println(str.length)
    // 通过索引方式访问某个字符，角标从0开始
    println(str[4])
    // 通过for循环迭代字符串
    for (c in str) {
        println(c)
    }
}