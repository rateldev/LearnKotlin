package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * try…catch…finally作为表达式
 */
fun main(args: Array<String>) {
    val age: Int? = try {
        // 正常运行，返回10
        10
    } catch (e: NumberFormatException) {
        12
        null
    } finally {
        // finally代码块不会影响表达式结果
        13
    }

    val score: Int? = try {
        Integer.parseInt("s" + 1)
    } catch (e: NumberFormatException) {
        60
        // 捕获异常，返回null
        null
    } finally {
        // finally代码块不会影响表达式结果
        70
    }
    println("年龄age=${age}")
    println("分数score=${score}")
}