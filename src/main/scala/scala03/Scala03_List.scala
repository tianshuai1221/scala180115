package scala03

object Scala03_List {
    def main(args: Array[String]): Unit = {

        // 创建空列表
        //val a1 = Nil
        // 创建有初始值的列表
        // apply
        var a1 = List(1,2,3)
       // println(a1(1))

        // 访问元素
       // println(a1.head) // 头
       // println(a1.last) // 最后
        //println(a1.tail.tail.tail) // 尾部 （包含排除第一个以后的所有元素的新列表）

        // 增加元素
        // 增加元素需要考虑列表的位置以及对应的符号位置
        //val list2 = a1 :+ 99
        //val list2 = 98 +: a1
        //println(list2)

        // List(4, 5, 6, List(1,2,3))
        //val list4 = 1 :: 2 :: 3 :: a1 :: Nil
        // List(4, 5, 6, 1,2,3)
        //val list4 = 4 :: 5 :: 6 :: a1
        // 使用两个冒号可以增加元素，如果使用三个冒号可以将集合中的元素增加的新的列表中
        val list4 = 1 :: 2 :: 3 :: a1 ::: Nil
        println(list4)



    }
}
