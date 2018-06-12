package scala02


object Scala07_Exception {
    def main(args: Array[String]): Unit = {

        def divider(x: Int, y: Int): Float= {
            //if(y == 0) throw new Exception("0作为了除数")
            //else x / y
            x / y
        }

        val a = new Array[Nothing](10)

        // scala中的异常处理采用模式匹配方式，类似于java中的switch操作
        try {
            println(divider(10, 0))
        } catch {
            case ex: Exception => println("捕获了异常：" + ex)
            case ex1 : ArithmeticException =>  println("捕获了算术异常：" + ex1)
            case ex2 : RuntimeException => println("捕获了RuntimeException异常：" + ex2)


        } finally {}
        println("after catch")

    }
}
