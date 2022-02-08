package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可变MutableList遍历操作
 */
fun main(args: Array<String>) {
    val muList: MutableList<String> = mutableListOf("春天", "夏天", "秋天", "冬天")
    // 获取集合的迭代器
    val iterator1 = muList.listIterator()
    // 获取从位置1开始的集合的迭代器
    val iterator2 = muList.listIterator(1)
    println("遍历集合中的元素：")
    while (iterator1.hasNext()) {
        print(iterator1.next() + "\t")
    }
    println("\n" + "从索引为1处开始遍历集合中的元素：")
    while (iterator2.hasNext()) {
        print(iterator2.next() + "\t")
    }
}