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
    // 截取角标为3，到角标结束的字符
    println(str.substring(3))
    // 截取角标为3，到角标为6的字符
    println(str.substring(3, 7))
    // 截取角标为3，到角标为7的字符
    println(str.substring(IntRange(3, 7)))
    // 截取角标为3，到角标为6的字符
    println(str.subSequence(3, 7))
    // 截取角标为3，到角标为7的字符
    println(str.subSequence(IntRange(3, 7)))
}