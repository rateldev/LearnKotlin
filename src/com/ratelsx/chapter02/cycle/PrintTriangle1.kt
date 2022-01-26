package com.ratelsx.chapter02.cycle

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * for循环语句
 */
fun main(args: Array<String>) {
    // 循环6次，且步长1的递增，0..5表示[0,5]之间
    for (i in 0..5) {       // 外层循环
        for (j in 0..i) {   // 内层循环
            print("*")          // 打印*
        }
        print("\n")             // 换行
    }

}