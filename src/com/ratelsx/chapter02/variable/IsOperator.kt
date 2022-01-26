package com.ratelsx.chapter02.variable

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 智能类型转换
 */
fun main(args: Array<String>) {
    val a: Any = "hello"
    if (a is String) {
        println("a is String")
        // 操作时，a自动转换为String类型
        println("字符串长度：${a.length}")
    } else if (a !is Int) {
        println("a !is Int")
    } else {
        println("I don't know")
    }
}