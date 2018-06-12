package scala04

object Scala01_Class {

    def main(args: Array[String]): Unit = {
        // 调用类中的属性或方法需要创建对象
        // User user = new User();
        val dog = new Dog
        dog shout "汪汪汪"
        //dog.shout("")
        //1 + 1
        // 1.+(1)

        println(dog currentLeg)
        // 属性在scala类中都存在setter,getter方法
        // 直接调用的属性名其实就是getter方法名称
        // getter ==> leg()
        //println(dog.leg)
        // setter ==> leg_=()
        // 如果类的属性声明为val(不可变)，那么scala只会生成属性getter方法，不会有setter
        // 这样的属性称之为只读属性
        dog.leg_=(20)

        //println(dog.leg)
        //println(dog.)
        //test

        // 声明主构造方法时，如果方法参数没有使用var,val声明，表示局部变量，不会在外部访问
        // 但是如果方法参数使用var, val声明，这个时候，scala会将局部变量升级为类的属性字段
        //var test = new ClassConstructor("HelloScala", 100)
        //test.get
        //test.myPrintln
        //test.myPrintln

        // 辅助构造方法
        // 在实现逻辑中一定要调用主构造方法。而且是必须放在第一行，保证类体全都执行过
        val person = new Person("zhangsan", 20);

        println(person.description)
    }

    // 方法声明时没有参数，也就可以省略小括号，那么在调用时，就不能增加小括号
    def test(): Unit = {
        println("123")
    }

}
package society {
    package professional {
        class Executive {
            private[professional] var workDetails = null
            private[society] var friends = null
            private[this] var secrets = null

            def help(another: Executive) {
                println(another.workDetails)
                //println(this.secrets)
            }
        }
    }
}

