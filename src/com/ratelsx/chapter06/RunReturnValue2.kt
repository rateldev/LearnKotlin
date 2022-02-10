package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * run()函数提前结束
 * 在run()函数中可以使用return来结束当前语句。
 */
fun main(args: Array<String>) {
    val list = ArrayList<String>()
    val value = list.run {
        // 添加数据
        add("金星")
        println("集合数据：${list}")
        return
        // 集合的长度
        size
    }
    println("返回值：${value}")
    println("集合数据：${list}")
}