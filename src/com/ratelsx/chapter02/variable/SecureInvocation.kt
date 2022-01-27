package com.ratelsx.chapter02.variable

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 安全调用符?.
 */
fun main(args: Array<String>) {
    val name = "Tom"
    val telephone: String? = null
    val result = telephone?.length
    println(result)
}