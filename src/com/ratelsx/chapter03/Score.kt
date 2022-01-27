package com.ratelsx.chapter03

import cn.ratelsx.chapter03.stuInfo

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 调用顶层函数
 */
fun main(args: Array<String>) {
    stuInfo("江小白", 18)
    sum(100, 9, 100)
}

fun sum(math: Int, chinese: Int, english: Int) {
    val result = math + chinese + english
    println("成绩：$result")
}