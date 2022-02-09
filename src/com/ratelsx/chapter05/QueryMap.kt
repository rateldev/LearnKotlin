package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 不可变Map查询操作
 */
fun main(args: Array<String>) {
    val map = mapOf(1 to "江小白", 2 to "小小白", 3 to "江小小")
    if (map.isEmpty()) {
        println("map集合中没有元素")
        return
    } else {
        println("map集合中有元素，元素个数为：" + map.size)
    }
    if (map.containsKey(2)) {
        println("map集合中的Key包含2")
    } else {
        println("map集合中的Key不包含2")
    }

    if (map.containsValue("3")) {
        println("map集合中的Value包含3")
    } else {
        println("map集合中的Value不包含3")
    }
    println("map集合中key为1对应的Value是：" + map[1])
}