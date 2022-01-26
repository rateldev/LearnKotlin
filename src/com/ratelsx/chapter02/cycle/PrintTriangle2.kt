package com.ratelsx.chapter02.cycle

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 跳出外层循环
 */
fun main(args: Array<String>) {
    // 循环9次，且步长为1的递增，0..9表示0~9，其中不包含数字9
    loop@ for (i in 0..9) {     // 外层循环
        for (j in 0..i) {       // 内存循环
            if (i > 4) {            // 判断i的值是否大于4
                break@loop          // 跳出外层循环
            }
            print("*")              // 打印*
        }
        print("\n")                 // 换行
    }
}