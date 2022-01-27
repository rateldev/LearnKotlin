package com.ratelsx.chapter02.variable

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * Elvis操作符?:
 */
fun main(args: Array<String>) {
    val telephone: String? = null
    val result = telephone?.length ?: "18800008888"
    println(result)
}