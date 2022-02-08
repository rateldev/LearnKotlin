package com.ratelsx.chapter04

/**
 * @author Ratel
 * @date 2022/2/8
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 嵌套类与内部类
 *
 * 在类中没有使用inner修饰的类为嵌套类，不能访问外部类的成员变量
 * 使用inner修饰的类为内部类，可以访问外部类的成员变量
 */
class Outer {
    val name = "江小白"

    inner class Nested {
        fun sayHello() {
            // 调用外部类的成员变量
            println("Hello!我叫$name")
        }
    }
}

fun main(args: Array<String>) {
    // 调用内部类的成员函数
    Outer().Nested().sayHello()
}