package com.ratelsx.chapter02.range

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 步长
 */
fun main(args: Array<String>) {
    // i in [1,4]
    for (i in 1..4 step 2) {
        print(i.toString() + "\t")
    }
    print("\n")
    // i in [4,1]
    for (i in 4 downTo 1 step 2) {
        print(i.toString() + "\t")
    }
}