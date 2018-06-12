package scala02

object Scala01_Var {
    def main(args: Array[String]): Unit = {

        // 声明变量
        // String s = "Hello Scala"; ==> java
        // java final
        //val s : String = "Hello Scala";
        var s1 :String = "Hello ";
        // 变量一定要初始化
        // Scala可以根据变量值推断变量类型
        // 所以变量类型可以省略
        val s2 :String = "Scala"
        // Scala中运算符其实是对象的方法
        val s3 = s1 + s2
        //val s2 = s.+(s1)
        //s = "Hello World";
       // println(s);
        println(s1);

        var s = "123";

    }
}
