package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可变MutableList批量操作
 */
fun main(args: Array<String>) {
    val muList1: MutableList<String> = mutableListOf("北京", "上海")
    val muList2: MutableList<String> = mutableListOf("北京", "上海", "深圳")
    muList2.removeAll(muList1)
    println("muList2移除muList1后的元素为：$muList2")
    muList2.addAll(muList1)
    println("muList2添加muList1后的元素为：$muList2")
    if (muList2.retainAll(muList1)) {
        println("muList2包含muList1")
    } else {
        println("muList2不包含muList1")
    }
    muList2.clear()
    println("muList2清除所有元素后，该集合的元素个数为：${muList2.size}")
}