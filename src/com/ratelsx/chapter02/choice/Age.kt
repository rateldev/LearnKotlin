package com.ratelsx.chapter02.choice

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * if…else if…else
 */
fun main(args: Array<String>) {
    // 定义一个人的年龄
    val age: Int = 22
    if (age > 66) {
        // 满足条件age>66
        println("这个人年龄阶段为老年")
    } else if (age > 41) {
        // 不满足条件age>66，但满足条件age>41
        println("这个人年龄阶段为中年")
    } else if (age > 18) {
        // 不满足条件age>41，但满足条件age>18
        println("这个人年龄阶段为青年")
    } else if (age > 7) {
        // 不满足条件age>18，但满足条件age>7
        println("这个人年龄阶段为少年")
    } else {
        // 不满足条件age>7
        println("这个人年龄阶段为童年")
    }
}