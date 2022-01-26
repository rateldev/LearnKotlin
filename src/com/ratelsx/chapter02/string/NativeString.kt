package com.ratelsx.chapter02.string

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 原生字符串
 */
fun main(args: Array<String>) {
    // 转义字符串
    val str1 = "您\n好"
    println(str1)
    // 原生字符串
    val str2 = """您\n好"""
    println(str2)
}