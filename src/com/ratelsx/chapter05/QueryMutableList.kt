package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可变MutableList查询操作
 */
fun main(args: Array<String>) {
    val muList: MutableList<Int> = mutableListOf(5, 6, 7)
    if (muList.isEmpty()) {
        println("集合中没有元素")
        return
    } else {
        println("集合中有元素，元素个数为：" + muList.size)
    }
    if (muList.contains(5)) {
        println("集合中包含元素5")
    }
    println("遍历结合中的所有元素：")
    // 获取集合中元素的迭代器
    val mIndex = muList.iterator()
    while (mIndex.hasNext()) {
        print(mIndex.next().toString() + "\t")
    }
}