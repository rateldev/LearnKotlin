package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 自定义异常
 */

class MyException(override val message: String?) : Throwable()

fun main(args: Array<String>) {
    val name: String? = null
    try {
        name?.length ?: throw MyException("变量name的值为null")
        println("name.length=${name.length}")
    } catch (e: MyException) {
        println(e.message)
    }
}