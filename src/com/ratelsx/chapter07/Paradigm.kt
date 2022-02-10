package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 泛型方法
 */
fun main(args: Array<String>) {
    val letters = ('a'..'z').toList()
    // 调用泛型方法，显式地指定类型实参
    println(letters.slice<Char>(0..2))
    // 调用泛型方法，编译器推导出T是Char
    println(letters.slice(10..13))
}