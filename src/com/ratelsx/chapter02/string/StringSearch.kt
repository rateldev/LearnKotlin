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
    // 获取第1个元素
    println(str.first())
    // 获取最后1个元素
    println(str.last())
    // 获取第5个元素
    println(str[4])
    // 查找字符串在原字符串中第1次出现的角标
    println(str.indexOf('o'))
    // 查找字符串在原字符串中最后1次出现的角标
    println(str.lastIndexOf('o'))

}