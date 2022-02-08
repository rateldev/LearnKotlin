package com.ratelsx.chapter04

import kotlin.reflect.KProperty

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 属性委托
 */
class Parent() {
    private var money: Int = 0
    operator fun getValue(child: Child, property: KProperty<*>): Int {
        println("getValue()方法被调用，修改的属性：${property.name}")
        return money
    }

    operator fun setValue(child: Child, property: KProperty<*>, value: Int) {
        println("setValue()方法被调用，修改的属性：${property.name}")
        money = value
    }
}

class Child {
    // 将压岁钱委托给父母
    var money: Int by Parent()
}

fun main(args: Array<String>) {
    val child = Child()
    println("(1)父母给孩子100元压岁钱")
    child.money = 100
    println("(2)买玩具花了50")
    child.money -= 50
    println("(3)自己还剩${child.money}")
}