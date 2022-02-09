package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 函数作为返回值
 */

// 声明枚举，定义两种类型
enum class USER {
    NORMAL, VIP
}

fun getPrice(userType: USER): (Double) -> Double {
    // 判断类型是不是普通类型
    if (userType == USER.NORMAL) {
        return { it }
    }
    return { price -> 0.88 * price }
}

fun main(args: Array<String>) {
    val normalUserPrice = getPrice(USER.NORMAL)(200.0)
    println("普通用户价格：$normalUserPrice")
    val vipPrice = getPrice(USER.VIP)(200.0)
    println("超级会员价格：$vipPrice")
}