package com.ratelsx.chapter02.variable

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 强制类型转换
 */
fun main(args: Array<String>) {
    val a = 1
    // 将字符串类型变量a强制转换为String类型
    val b: String? = a as? String
    print(b?.length)
}