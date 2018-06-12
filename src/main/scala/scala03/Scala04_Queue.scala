package scala03

import scala.collection.mutable

object Scala04_Queue {
    def main(args: Array[String]): Unit = {

        // 创建队列
        val q1 = new mutable.Queue[Int]
        println(q1)

        q1 += (1)
        q1 ++= List(2, 3, 4)
        println(q1)

        //q1.dequeue()

        q1.enqueue(9, 8, 7)
        println(q1)

    }
}
