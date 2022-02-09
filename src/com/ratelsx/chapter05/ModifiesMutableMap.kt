package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可变MutableMap修改操作
 */
fun main(args: Array<String>) {
    val muMap = mutableMapOf(1 to "江小白", 2 to "小小白", 3 to "江小小")
    muMap.put(4, "江江")
    println("添加元素后的集合：$muMap")
    muMap.remove(4)
    println("删除元素后的集合：$muMap")
    println("集合中元素的个数威威：${muMap.size}")
}