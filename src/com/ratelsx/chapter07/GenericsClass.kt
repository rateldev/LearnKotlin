package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 自定义泛型
 */
class Box<T> {
    private var t: T? = null
    fun add(t: T) {
        this.t = t
    }

    fun get(): T? {
        return t
    }
}

// Apple数据类
data class Apple(val name: String)

fun main(args: Array<String>) {
    val box = Box<Apple>()
    box.add(Apple("红富士苹果"))
    val apple = box.get()
    println(apple.toString())
}