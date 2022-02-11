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
/*
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
    var cat = Cat()
    work(cat)
}*/

/*
B是A的子类型，但Xxx＜B＞不是Xxx＜A＞的子类型
open class Animal {
    fun bathe() {
        println("开开心心地洗澡...")
    }
}
class Cat : Animal()     //猫类
class PetShop<T : Animal>(var animals: List<T>)//宠物店类
//帮所有的宠物洗澡
fun batheAll(petShop: PetShop<Animal>) {
    for (animal: Animal in petShop.animals) {
        animal.bathe()    //开始洗澡
    }
}
fun main(args: Array<String>) {
    val cat1 = Cat() //第1只猫
    val cat2 = Cat() //第2只猫
    val animals = listOf<Cat>(cat1, cat2) //宠物装入一个集合
    val petShop=PetShop<Cat>(animals)      //将宠物送到宠物店
    // batheAll(petShop)  编译器报错
}*/

/*
协变
open class Animal {
    fun bathe() {
        println("开开心心地洗澡...")
    }
}
class Cat : Animal()     //猫类
class PetShop<T : Animal>(var animals: List<T>)//宠物店类
//帮所有的宠物洗澡
fun batheAll(petShop: PetShop<out Animal>) {
    for (animal: Animal in petShop.animals) {
        animal.bathe()    //开始洗澡
    }
}
fun main(args: Array<String>) {
    val cat1 = Cat() //第1只猫
    val cat2 = Cat() //第2只猫
    val animals = listOf<Cat>(cat1, cat2) //宠物装入一个集合
    val petShop = PetShop<Cat>(animals) //将宠物送到宠物店
    batheAll(petShop)
}*/

/**
 * 逆变
 */
open class Animal
class Cat : Animal() {}
class Dog : Animal() {}

//定义宠物店类
class PetShop<in T> {
    fun feed(animal: T) {
        if (animal is Cat) {
            println("喂食小猫...")
        } else if (animal is Dog) {
            println("喂食小狗...")
        }
    }
}

//定义喂猫的方法
fun feedCat(petShop: PetShop<Cat>) {
    petShop.feed(Cat())
}

fun main(args: Array<String>) {
    feedCat(PetShop<Animal>())
}
