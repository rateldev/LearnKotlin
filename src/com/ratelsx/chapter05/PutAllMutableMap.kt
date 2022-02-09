package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可变MutableMap批量操作
 */
fun main(args: Array<String>) {
    val muMap1 = mutableMapOf(1 to "花", 2 to "草", 3 to "树")
    val muMap2 = mutableMapOf(4 to "猫", 5 to "狗", 6 to "猪")
    muMap1.putAll(muMap2)
    val muMapEntry = muMap1.entries
    muMapEntry.forEach {
        println("key：${it.key}，value：${it.value}")
    }
    muMap1.clear()
    println("集合中元素的个数=" + muMap1.size)
}