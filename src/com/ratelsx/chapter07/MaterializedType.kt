package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/11
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 实化类型
 */
inline fun <reified T> Any.isType(): Boolean {
    if (this is T) {
        return true
    }
    return false
}

fun main(args: Array<String>) {
    println("abc".isType<String>())
    println(123.isType<String>())
}