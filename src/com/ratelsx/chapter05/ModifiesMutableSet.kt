package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可变MutableSet修改操作
 */
fun main(args: Array<String>) {
    val muSet: MutableSet<Int> = mutableSetOf(5, 6, 7)
    muSet.add(8)
    println("添加元素8后的集合：$muSet")
    muSet.remove(6)
    println("移除元素6后的集合：$muSet")
}