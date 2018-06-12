package scala03

import scala.collection.mutable._

object Scala07_MapFunction {
    def main(args: Array[String]): Unit = {

        //val a1 = Array(1, 2, 3);
        // Array(2, 4, 6)
        /*
        List<Integer> nums = new ArrayList<Integer>();
        for ( Integer i : ints ) {
            nums.add(i*2);
        }
         */

        /*
        val a2 = for (i <- a1) yield 2 * i
        for ( i <- a2 ) {
            println(i)
        }
        */

        // 如果希望集合的元素可以根据规则变成新的集合，可以采用集合的map方法实现
        val a1 = List("1", "2", "3")
        /*
        def f1(i:Int) : Int = {
            i * 2
        }

        (i) => i * 2
        i => i * 2
        _ * 2
        */


        // scala中函数也可以作为参数传递
        //println(a1.map(_ * 2))
        /*

          *
          * *
          * * *
          * * * *

         */

        //a1.map(_ * "*" ).foreach(println(_))

        //val names = List("Alice", "Bob", "Nick")
        //println(names.map(_.toUpperCase))
        //println(names.flatMap(_.toUpperCase))

        val list = List(1, 2, 3, 4, 5)
        // name like '__b%'
        // 函数中如果使用下划线简化参数的话，第一个下划线表示第一个参数，依此类推
        //  （((（1 - 2) - 3) - 4) - 5)
        val i1 = list.reduceLeft(_ - _)
        //  (1 - (2 - (3 - (4 - 5))))
        val i2 = list.reduceRight(_ - _)
        println(i1)
        println(i2)

        //val list2 = List(5, 1, 9, 2, 8)
        val list2 = List(1, 9, 2, 8)
        // tail.tail
        //val i4 = list2.fold(5)((sum,y) => )
        //println(i4);

        // List(100, 1, 9, 2, 8)
        //  1 9 2 8 100
        // (8 - (2 - (9 - (1 - 100))))
        /*
        val list3 = List(1, 9, 2, 8)
        val i5 = list3.foldRight(100)(_ - _)
        println(i5);


        val sentence = "一首现一代诗《笑里藏刀》:哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈刀哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈"
        val i7 = (Map[Char, Int]() /: sentence)((m, c) => m + (c -> (m.getOrElse(c, 0) + 1)))
       // println(i7)

        val i88 = (1 to 10).foldLeft(0)(_ + _)
        val i8 = (1 to 10).scanLeft(0)(_ + _)
        //println("i88 = " + i88)
       // println("i8 = " + i8)

        val list11 = List("1", "2", "3")
        val list22 = List(4, 5, 6)
        var z1 = list11 zip list22
        println(z1)

        val iterator = List(1, 2, 3, 4, 5).iterator
        while (iterator.hasNext) {
            println(iterator.next())
        }
        */

        /*
        def numsForm(n: BigInt) : Stream[BigInt] = n #:: numsForm(n + 1)

        val tenOrMore = numsForm(10)
        println(tenOrMore)

        println(tenOrMore.tail.head)
        //println(tenOrMore)
        */

        // 11 33 22 131
        // 集合中的view方法可以让集合在使用的时候执行逻辑操作，否则不执行
        /*
        val viewSquares = (1 to 100)
            .map(x => {
                println("x = " + x)
                x
            }).filter(x => {
            x.toString == x.toString.reverse
        })

        println("*****************")

        for(x <- viewSquares){
            print(x + "，")
        }

        */
        //(1 to 5).foreach(println(_))

       // (1 to 5).par.foreach(println(_))

        val result1 = (0 to 10000).map{case _ => Thread.currentThread.getName}.distinct
        val result2 = (0 to 10000).par.map{case _ => Thread.currentThread.getName}.distinct
        println(result1)
        println(result2)

    }
}
