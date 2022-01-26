package com.ratelsx.chapter02.cycle

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * continue语句
 */
fun main(args: Array<String>) {
    // 定义一个变量sum，用于记录奇数的和
    var sum = 0
    // 循环100次，且步长为1的递增，1 until 101表示[1,101]，其中不包含数字101
    for (i in 1 until 101) {
        // 判断i是一个偶数
        if (i % 2 == 0) {
            // 结束本次循环
            continue
        }
        // 实现sum和i的累加
        sum += i
    }
    // 打印奇数的和
    print("sum=$sum")
}