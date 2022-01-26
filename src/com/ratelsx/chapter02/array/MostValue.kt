package com.ratelsx.chapter02.array

/**
 * @author Ratel
 * @date 2022/1/26
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 数组最值
 */
fun main(args: Array<String>) {
    // 定义数组arr并初始化
    val arr = intArrayOf(1, 2, 3, 4)
    // 定义一个整形变量max存放最大值
    var max: Int
    // 首先假设数组中第1个元素为最大值
    max = arr[0]
    // 通过一个for循环遍历数组中的元素
    for (i in arr) {
        // 比较数组中的元素i是否大于max
        if (i > max) {
            // 条件成立，则将i赋给max
            max = i
        }
    }
    // 打印最大值max
    println("max=$max")
}