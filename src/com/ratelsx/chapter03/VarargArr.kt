package com.ratelsx.chapter03

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可变参数
 */
fun main(args: Array<String>) {
    val result = add(1, 2, 3)
    println(result)
}

fun add(vararg arr: Int): Int {
    // 定义一个变量sum
    var sum = 0
    // 对可变参数进行遍历
    arr.forEach {
        // 每循环一次会加上可变参数arr中的值
        sum += it
    }
    // 循环结束，返回参数值的和
    return sum
}
