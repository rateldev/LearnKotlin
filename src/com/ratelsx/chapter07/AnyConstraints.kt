package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/10
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 泛型约束＜T:Any?＞与＜T:Any＞
 */
fun <T : Any?> nullAbleProcessor(value: T) {
    value?.hashCode()
}

fun <T : Any> nullDisableProcessor(value: T?) {
    // 编译通过
    value?.hashCode()
}

fun main(args: Array<String>) {
    nullAbleProcessor(null)
    // 编译错误
    nullDisableProcessor(null)
}