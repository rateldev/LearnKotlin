package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 不可变list查询操作
 */
fun main(args: Array<String>) {
    val list: List<Int> = listOf(0, 1, 2)
    if (list.isEmpty()) {
        println("集合中没有元素")
        return
    } else {
        println("集合中有元素，元素个数为：" + list.size)
    }
    if (list.contains(1)) {
        println("集合中包含元素1")
    }
    println("遍历集合中的所有元素：")
    // 获取集合中元素的迭代器
    val mIndex = list.iterator()
    while (mIndex.hasNext()) {
        print(mIndex.next().toString() + "\t")
    }

}