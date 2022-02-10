package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * run()函数的返回值
 * 调用run()函数时返回值为函数体的最后一条语句，
 * 和普通的Lambda表达式一样。
 */
fun main(args: Array<String>) {
    val list = ArrayList<String>()
    val value = list.run {
        add("金星")
        size
    }
    println("返回值：${value}")
    println("集合数据：${list}")
}