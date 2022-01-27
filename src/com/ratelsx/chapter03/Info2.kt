package com.ratelsx.chapter03

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 默认参数
 */

fun main(args: Array<String>) {
    // 调用introduce()函数，并指定函数中的形参与实参
    introduce(age = 20)
}

fun introduce(name: String = "江小白", age: Int) {
    // 打印传递的姓名
    println("姓名：$name")
    // 打印传递的年龄
    println("年龄：$age")
}
