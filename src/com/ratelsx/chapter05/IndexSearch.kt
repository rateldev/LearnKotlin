package com.ratelsx.chapter05

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 检索操作
 */
fun main(args: Array<String>) {
    val list: List<Int> = listOf(2, 3, 1, 3, 2, 1, 2)
    println("集合中索引为0的元素是：" + list.get(0))
    println("元素1第一次出现的位置是：" + list.indexOf(1))
    println("元素1最后一次出现的位置是：" + list.lastIndexOf(1))
    println("截取集合中索引为1~4的元素：" + list.subList(1, 4))
}