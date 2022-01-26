package com.ratelsx.chapter02.cycle

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * for循环
 */
fun main(args: Array<String>) {
    // 循环4次，且步长为1的递增，0..3表示[0,3] 之间的数字
    for (i in 0..3) {   //i的值会在0~3之间变化
        println("i => $i \t")
    }
}