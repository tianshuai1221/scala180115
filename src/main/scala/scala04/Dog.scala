package scala04

import scala.beans.BeanProperty

// 使用class声明类
// 类名后面没有增加小括号，其实就等同于由编译器给当前类提供默认的主构造方法
/*
    class User {
       public User() {

       }
    }
 */
class Dog {

    // 类体
    // scala中的主构造方法的逻辑其实就是类体

    // 声明属性
    @BeanProperty var leg = 4
    // 声明方法
    def shout(content: String) {
        println(content)
    }

    // 声明方法
    def currentLeg = leg

}
class ClassConstructor ( @BeanProperty var name: String, price: Double){
    def myPrintln = println(name + "," + price)
}
class Person {
    private var name = ""
    private var age = 0

    def this(name: String) {
        this()
        this.name = name

    }
    def this(name: String, age: Int) {
        this(name)
        this.name = name
        this.age = age
    }

    def description = name + " is " + age + " years old"
}

