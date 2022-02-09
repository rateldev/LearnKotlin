package com.ratelsx.chapter06

/**
 * @author Ratel
 * @date 2022/2/9
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * Lambda表达式使用注意事项
 *
 * 在每次调用Lambda表达式时，不管方法体里面的语句执行多少条，
 * 返回值的类型和返回值都是由方法体中最后一条语句决定的，因此
 * 在实际返回值后不要编写任何语句。
 */
fun main(args: Array<String>) {
    val sum = { a: Int, b: Int ->
        a + b
        "我是捣乱的"
    }
    println(sum(9, 7))
}