package scala03

import scala.collection.mutable.ArrayBuffer


object Scala01_Array {
    def main(args: Array[String]): Unit = {

        // Array是一个数组，需要设定数组的长度
        // int[] is = new int[10]
        // is[0] = 1

        // scala访问集合使用的是小括号
        // scala==>.class
        // scala中数组一定要声明类型
        //val a1 = new Array[Int](10)
        // 创建数组并进行数据初始化

        // 通过 类型名() 这种方式创建的集合 默认调用了集合的apply方法
        // Array是定长数组，无法改变数组的长度
        val a1 = Array(1,2,3)
        a1(0) = 1

        // 定长数组无法使用运算增加数据
        //a1 = a1 + 4

        println("a1 = " + a1)
        //a1.update(0, 1)

        //a1.
        //for ( i <- a1 ) println(i);
        // 变长数组, 类似于JAVA中ArrayList
        val arr2 = ArrayBuffer[Int]()

        // += 运算符和以增加元素或多个元素
        // ++=运算符可以将其他集合中的元素增加到当前的数组中
        arr2 ++= a1

        println("arr2 = " + arr2)

        arr2.append(1)
        arr2.append(2)

        // 下面的代码其实是update方法的简化
        arr2(0) = 7

        println("a2 = " + arr2)
        println(a1.toBuffer)
        println(arr2.toArray)

        // [[1,2], [3,4], [], []]
        // new int[][]

        val arr3 = Array.ofDim[Double](2,3)
        arr3(1)(1) = 11.11
        for ( i <- 0 to 1; j <- 0 to 2 ) {
            println( arr3(i)(j) );
        }

        val arr4 = ArrayBuffer("1", "2", "3")
        //Scala to Java
        import scala.collection.JavaConversions.bufferAsJavaList
        val javaArr = new ProcessBuilder(arr4)
        println(javaArr.command())

        import scala.collection.JavaConversions.asScalaBuffer
        import scala.collection.mutable.Buffer
        val scalaArr: Buffer[String] = javaArr.command()
        println(scalaArr)

        //import java.util.HashMap
        //import scala.collection.immutable.HashMap

        //val map = HashMap

    }
}
