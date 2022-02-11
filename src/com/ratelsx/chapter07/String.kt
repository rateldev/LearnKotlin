package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/11
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可空类型的子类型
 * 非空类型是可空类型的子类型
 */
fun print(str: String?) {
    println(str)
}

fun main(args: Array<String>) {
    val str1 = "非空"
    val str2: String? = null
    print(str1)
    print(str2)
}