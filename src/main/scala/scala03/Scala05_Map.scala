package scala03

import scala.collection.mutable

object Scala05_Map {
    def main(args: Array[String]): Unit = {

        // HashMap
        // hashMap默认容量？ 16
        // hashMap默认的扩容方式？ 2倍
        //    （数据容量）>=极限值 0.75 * (16) = 12
        // HashMap扩容为什么是2倍
        // ArrayList 1.5
        // JDK1.8之后HashMap什么时候转换为二叉树
        // 8(16) ==> 9(32) ==> 10(64) ==> 11(TreeNode)

        // Scala中Map
        // 不可变Map集合无法添加KV数据
        val map = Map( "A" -> 1, "B" -> 2, "C" -> 3 )

        println(map)
        // 可变Map集合，可以添加KV数据
        val map2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
        //map2 += ("D"->4, "E" -> 5)
        val map3 = new scala.collection.mutable.HashMap[String, Int]

        // 对偶元组
        val map4 = Map(("Alice", 10), ("Bob", 20), ("Kotlin", 30))

        // 获取集合中的元素
        // 获取不存在的key的场合，scala会发生错误
        //println(map4("Bob1"));
        // 采用get方法获取的结果要么是None（无值）或Some(有值),采用get方法获取即可
        //println(map4.get("Bob").get);
        // 采用getOrElse方法获取的结果如果不存在，不会发生错误，而是将第二个参数作为默认值返回
       // println(map4.getOrElse("Bob1", 100))

        map2("Bob") = 50
        //println(map2)

        map2 -= ("Bob")
        //println(map2)

        // 循环遍历
        //for ((k, v) <- map2) println(k + " is mapped to " + v)
        //for (v <- map2.keys) println(v)
        //for (v <- map2.values) println(v)
        for (v <- map2) println(v._1 + "=>" + v._2)

    }
}
