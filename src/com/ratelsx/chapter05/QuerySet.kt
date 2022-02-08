package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 不可变Set查询操作
 */
fun main(args: Array<String>) {
    val set: Set<Int> = setOf(11, 12, 13, 11)
    if (set.isEmpty()) {
        println("集合中没有元素")
        return
    } else {
        println("集合中有元素，元素个数为：" + set.size)
    }
    if (set.contains(11)) {
        println("集合中包含元素11")
    }
    println("遍历集合中的所有元素：")
    val mIndex = set.iterator()
    while (mIndex.hasNext()) {
        print(mIndex.next().toString() + "\t")
    }
}
