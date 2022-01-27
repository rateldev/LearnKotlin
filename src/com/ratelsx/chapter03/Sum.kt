package com.ratelsx.chapter03

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 局部函数
 */

fun main(args: Array<String>) {
    // 调用total()函数，传递实参额为3
    total(3)
}

// 定义一个函数total()
fun total(a: Int) {
    // 定义一个变量b，并将其初始值设置为5
    val b = 5

    // 定义个局部函数add()
    fun add(): Int {
        // 返回变量a与b的和
        return a + b
    }
    println(add())
}