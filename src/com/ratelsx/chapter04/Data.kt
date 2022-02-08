package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 数据类
 */
data class Man(val name: String, val age: Int)

fun main(args: Array<String>) {
    // 创建类的对象并传递参数
    val man = Man("江小白", 20)
    println("man:$man")
}