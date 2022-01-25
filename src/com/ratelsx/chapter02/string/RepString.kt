package com.ratelsx.chapter02.string

/**
 * @author Ratel
 * @date 2022/1/25
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 */
fun main(args: Array<String>) {
    val str = "Hello World! Hello World!"
    println(str.replace("World", "Kotlin"))
    println(str.replaceFirst("World", "Kotlin"))
    println(str.replaceBefore("!", "Kotlin"))
    println(str.replaceAfter("Hello ", "Kotlin!"))
}