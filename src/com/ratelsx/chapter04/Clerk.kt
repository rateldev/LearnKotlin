package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/7
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 主构造函数
 * 构造函数使用constructor定义
 */
class Clerk constructor(username: String) {
    var name: String

    init {
        name = username
        println("我叫$name")
    }
}

fun main(args: Array<String>) {
    val clerk = Clerk("江小白")
}