package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 函数作为参数使用以及优化
 *
 * 1.省略小括号
 * 2.将参数移动到小括号外面
 * 3.使用it关键字
 */

// 给区间定义一个扩展方法
fun IntRange.pickNum(function: (Int) -> Boolean): List<Int> {
// fun IntRange.pickNum(need: Int, function: (Int) -> Boolean): List<Int> {
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
    // 定义区间范围1~20
    val list = 1..50
    println("--------能被10整除的数--------")
    // 省略之前
    // println(list.pickNum({ x: Int -> x % 10 == 0 }))
    // 省略之后
    // println(list.pickNum { x: Int -> x % 10 == 0 })

    // 将参数从括号中移出之前
    // println(list.pickNum(1, { x: Int -> x % 10 == 0 }))
    // 将参数从括号中移出之后
    // println(list.pickNum(1) { x: Int -> x % 10 == 0 })

    // 使用it关键字之前
    println(list.pickNum { x: Int -> x % 10 == 0 })
    // 使用it关键字之后
    println(list.pickNum { it % 10 == 0 })
}