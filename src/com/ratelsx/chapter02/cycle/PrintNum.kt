package com.ratelsx.chapter02.cycle

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * while循环语句
 */
fun main(args: Array<String>) {
    var n = 5           // 定义变量n，初始值为5
    while (n > 0) {     // 循环成立
        println("n=$n") // 条件成立，打印n的值
        n--             // 将n的值自减
    }
}