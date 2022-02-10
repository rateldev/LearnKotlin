package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 标准库中的高阶函数
 * repeat()函数用于重复执行某条语句
 */
fun main(args: Array<String>) {
    println("--------第1个参数为2时--------")
    repeat(2) {
        println("中国")
    }
    println("--------第1个参数为1时--------")
    repeat(1) {
        println("中国")
    }
    println("--------第1个参数为0时--------")
    repeat(0) {
        println("中国")
    }
}