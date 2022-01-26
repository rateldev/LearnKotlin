package com.ratelsx.chapter02.string

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 字符串分隔
 */
fun main(args: Array<String>) {
    // 字符串
    val str = "hello.kotlin"
    // 根据点号进行拆分
    val split = str.split(".")
    // 打印拆分结果
    println(split)
}