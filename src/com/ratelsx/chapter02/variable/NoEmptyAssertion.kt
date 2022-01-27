package com.ratelsx.chapter02.variable

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 非空断言!!.
 */
fun main(args: Array<String>) {
    // 声明可空类型变量
    val telephone: String? = null
    val result = telephone!!.length
    println(result)
}