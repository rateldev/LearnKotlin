package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 延迟加载
 */
fun main(args: Array<String>) {
    val content by lazy {
        println("Hello")
        // 第一次初始化后，再次调用该变量时，只会输出最后一行代码的内容
        "World"
    }
    println(content)
    println(content)
}