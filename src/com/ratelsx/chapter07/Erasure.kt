package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/11
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 泛型擦除
 */
fun main(args: Array<String>) {
    // 定义一个类型为List<String>的集合
    val list1 = listOf("a", "b", "c")
    // 定义一个类型为List<Int>的集合
    val list2 = listOf<Int>(1, 2, 3)
    // 打印集合的类型
    println(list1.javaClass)
    println(list2.javaClass)
    println(list1.javaClass == list2.javaClass)
}