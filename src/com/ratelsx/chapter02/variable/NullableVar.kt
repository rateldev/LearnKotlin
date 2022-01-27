package com.ratelsx.chapter02.variable

/**
 * @author Ratel
 * @date 2022/1/27
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 可空类型变量?
 */
fun main(args: Array<String>) {
    // 非空变量
    val name = "Tom"
    // 可空变量
    var telephone: String? = null
    if (telephone != null) {
        print(telephone.length)
    } else {
        telephone = "18800008888"
        print("telephone=$telephone")
    }
}