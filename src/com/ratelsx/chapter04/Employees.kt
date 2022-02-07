package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/7
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * this关键字
 */
class Employees constructor(name: String) {
    var name: String

    init {
        this.name = name
        println("我叫$name")
    }
}

fun main(args: Array<String>) {
    val employees = Employees("江小白")
}