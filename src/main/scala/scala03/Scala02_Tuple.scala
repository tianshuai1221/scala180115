package scala03

import scala.collection.mutable.ArrayBuffer

object Scala02_Tuple {
    def main(args: Array[String]): Unit = {

        // 将多个无关的数据可以封装为一个整体，称之为元组
        // 声明元组的方式为小括号中包含数据
        val t1 = (1, 2, "Hello", true, 100)
        var t2 = ("string", 100, true);

        val (f, m, e) = t2

        println("m = " + m)

        // 访问元组的数据采用下划线和位置（计数器）来位置
        println(t1._2)

        for ( i <- t1.productIterator ) {
           println(i)
        }
    }
}
