package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 遍历操作
 */
fun main(args: Array<String>) {
    val list: List<Int> = listOf(1, 2, 3, 4)
    // 获取一个集合的迭代器
    val iterator1 = list.listIterator()
    // 获取从索引开始的集合的迭代器
    val iterator2 = list.listIterator(1)
    println("遍历集合中的元素：")
    while (iterator1.hasNext()) {
        print(iterator1.next().toString() + "\t")
    }
    println("\n" + "从索引1开始遍历集合中的元素：")
    while (iterator2.hasNext()) {
        print(iterator2.next().toString() + "\t")
    }
}