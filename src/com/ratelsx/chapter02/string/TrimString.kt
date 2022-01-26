package com.ratelsx.chapter02.string

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 字符串去空格
 */
fun main(args: Array<String>) {
    val str = "         Hello World!         "
    // 删除字符串前的字符
    println(str.trim())
    // 删除字符串后面的字符
    println(str.trimEnd())
}