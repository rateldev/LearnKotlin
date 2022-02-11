package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 继承与子类型
 */
open class Animal {
    fun bathe() {
        println("洗澡...")
    }
}

class Cat : Animal()

fun work(animal: Animal): Unit {
    animal.bathe()
}

fun main(args: Array<String>) {
    val cat = Cat()
    work(cat)
}