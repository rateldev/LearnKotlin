package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * run()函数提前结束指定方法并返回值
 *
 * 通过使用return@run可以结束当前的run()函数，并且
 * 不会结束main()方法，这样就解决了使用return直接
 * 结束main()方法的问题。此处需要注意，结束run()方法
 * 使用“return@run”是固定格式，中间不需要空格分开，并且
 * 所有在Standard类中的方法都可以通过“return@方法名”
 * 这种格式结束当前方法。
 */
fun main(args: Array<String>) {
    val list = ArrayList<String>()
    val value = list.run {
        // 添加数据
        add("金星")
        println("集合数据：${list}")
        // 集合的长度
        return@run size
        add("火星")
        println("集合数据：${list}")
    }
    println("返回值：${value}")
    println("集合数据：${list}")
}