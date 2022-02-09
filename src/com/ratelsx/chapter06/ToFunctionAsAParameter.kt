package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 函数作为参数使用
 */

fun IntRange.pickNum(function: (Int) -> Boolean): List<Int> {
    // 声明集合
    val resultList = mutableListOf<Int>()
    // this指向定义的区间(IntRange)范围1~20
    for (i in this) {
        // 判断传递过来的Lambda表达式是否满足条件
        if (function(i)) {
            // 符合条件的数据添加到集合中
            resultList.add(i)
        }
    }
    // 将集合返回
    return resultList
}

fun main(args: Array<String>) {
    val list = 1..20
    println("--------能被5整除的数--------")
    println(list.pickNum { x: Int -> x % 5 == 0 })
    println("--------能被10整除的数--------")
    println(list.pickNum { x: Int -> x % 10 == 0 })
}