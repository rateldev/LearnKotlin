package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/11
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 接口与子类型
 */
fun export(str: CharSequence) {
    println(str)
}

fun main(args: Array<String>) {
    val str = "Hello Kotlin"
    export(str)
}