package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/7
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 次构函数
 */
class Workers constructor(name: String) {
    var name: String

    init {
        this.name = name
        println("我叫${name}")
    }

    constructor(name: String, age: Int) : this(name) {
        println("我叫${name},我今年${age}岁。")
    }

    constructor(name: String, age: Int, sex: String) : this(name, age) {
        println("我叫${name},我今年${age}岁,我是${sex}生。")
    }
}

fun main(args: Array<String>) {
    val person = Workers("江小白", 18, "男")
}