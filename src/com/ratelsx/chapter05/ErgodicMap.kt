package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 不可变Map遍历操作
 */
fun main(args: Array<String>) {
    val map = mapOf(1 to "江小白", 2 to "小小白", 3 to "江小小")
    val mapKey = map.keys
    val mapValue = map.values
    println("集合中所有的Key：$mapKey")
    println("集合中所有的Value：$mapValue")
    val mapEntry = map.entries
    mapEntry.forEach {
        println("key：${it.key}，value：${it.value}")
    }
}