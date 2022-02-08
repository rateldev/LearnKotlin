package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * MutableList修改操作
 */
fun main(args: Array<String>) {
    val muList: MutableList<Int> = mutableListOf(1, 2, 3)
    muList.add(4)
    println("向集合中添加元素4：$muList")
    muList.remove(1)
    println("移除集合中的元素1：$muList")
    muList.set(1, 7)
    println("用7替换索引为1的元素：$muList")
    muList.add(1, 5)
    println("在索引为1处添加元素5：$muList")
    muList.removeAt(2)
    println("移除索引为2的元素：$muList")

}