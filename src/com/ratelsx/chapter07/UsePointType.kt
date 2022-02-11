package com.ratelsx.chapter07

/**
 * @author Ratel
 * @date 2022/2/11
 * GitHub：https://github.com/rateldev
 * WebSite：https://ratelsx.com
 * email：ratels@foxmail.com
 *
 * 点变型
 */
open class Fruit(val name: String)
open class Mammal(val name: String)

class Banana : Fruit("香蕉")
class Pear : Fruit("梨子")
class Lion : Mammal("狮子")
class Tiger : Mammal("老虎")
class Forest<T>(var content: T)

// 打印
fun printFruit(forest: Forest<out Fruit>) {
    println(forest.content.name)
}

fun printMammal(forest: Forest<out Mammal>) {
    println(forest.content.name)
}

fun main(args: Array<String>) {
    val bananaForest = Forest(Banana())
    val pearForest = Forest(Pear())
    val lionForest = Forest(Lion())
    val tigerForest = Forest(Tiger())
    printFruit(bananaForest)
    printFruit(pearForest)
    printMammal(lionForest)
    printMammal(tigerForest)
}