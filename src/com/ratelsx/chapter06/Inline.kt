package com.ratelsx.chapter06

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 内联函数
 */
inline fun <T> check(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

fun main(args: Array<String>) {
    val l = ReentrantLock()
    // l是一个Lock对象
    check(l) { println("这是内联函数方法体") }
}