package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * Lambda表达式返回值
 */
fun main(args: Array<String>) {
    println("--------------------1--------------------")
    val result1 = {
        println("输出语句1")
        "字符串"
    }()
    println("返回值：$result1")
    println("返回值类型：${result1.javaClass}")
    println("--------------------2--------------------")
    val result2 = {
        println("输出语句1")
        println("输出语句2")
        18
    }()
    println("返回值：$result2")
    println("返回值类型：${result2.javaClass}")
    println("--------------------3--------------------")
    val result3 = {
        println("输出语句1")
        println("输出语句2")
        true
    }()
    println("返回值：$result3")
    println("返回值类型：${result3.javaClass}")
}