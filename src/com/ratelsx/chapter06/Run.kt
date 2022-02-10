package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * T.run()函数
 */
fun main(args: Array<String>) {
    val list = ArrayList<String>()
    list.run {
        this.add("土星")
        add("天王星")
        add("海王星")
    }
    // 输出集合中的元素
    println(list)
}