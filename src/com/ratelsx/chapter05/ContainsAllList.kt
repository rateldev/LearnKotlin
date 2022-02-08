package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 批量操作
 */
fun main(args: Array<String>) {
    val list1: List<Int> = listOf(0, 1, 2)
    val list2: List<Int> = listOf(0, 1, 2, 3)
    // 判断list2是否包含list1
    if (list2.containsAll(list1)) {
        println("list2集合包含list1集合")
    }
}