package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 泛型约束＜T:类或接口＞
 */
fun <T : Number> List<T>.sum(): Double? {
    // 定义一个Double类型的变量
    var sum: Double? = 0.0
    // 遍历传递过来的集合中的数据
    for (i in this.indices) {
        // 转化为Double类型再与sum相加
        sum = sum?.plus(this[i].toDouble())
    }
    return sum
}

fun main(args: Array<String>) {
    // 创建一个集合变量list
    val list = arrayListOf(1, 2, 3, 4, 5)
    println("求和：${list.sum()}")
}