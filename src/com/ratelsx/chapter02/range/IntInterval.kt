package com.ratelsx.chapter02.range

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 *  正向区间
 */
fun main(args: Array<String>) {
    // 与1<=i<=4相同
    for (i in 1.rangeTo(4)) {
        print(i.toString() + "\t")
    }
    print("\n")
    // 与1<=i<=4相同
    for (i in 1..4) {
        print(i.toString() + "\t")
    }
}