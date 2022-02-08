package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 类委托
 */

interface Wash {
    fun washDishes()
}

class Child : Wash {
    override fun washDishes() {
        println("委托大头儿子洗碗，耶!")
    }
}

// 第一种委托方式
// class Parent : Wash by Child()
// 第二种委托方式
class Parent(washer: Wash) : Wash by washer

fun main(args: Array<String>) {
    val child = Child()
    Parent(child).washDishes()
}