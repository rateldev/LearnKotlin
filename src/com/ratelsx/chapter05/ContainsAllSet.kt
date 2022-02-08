package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 不可变Set批量操作
 */
fun main(args: Array<String>) {
    val set1: Set<Int> = setOf(0, 9, 13)
    val set2: Set<Int> = setOf(0, 7, 9, 13)
    // 判断list2是否包含list1
    if (set2.containsAll(set1)) {
        println("set2集合包含set1集合")
    }
}