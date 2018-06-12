package scala03

object Scala09_Adv {
    def main(args: Array[String]): Unit = {

        //var a1 = Array(1 , 2 ,3)

        //println(a1.mkString(";"))

        /*
        def runInThread(f1:  => Unit): Unit = {
            new Thread {
                override def run(): Unit = {
                    f1
                }
            }.start()
        }

        runInThread {
                println("干活咯！")
                Thread.sleep(3000)
                println("干完咯！")
        }
        */

        def until(condition: => Boolean)(block: => Unit) {
            if (!condition) {
                block
                until(condition)(block)
            }
        }

        var x = 10
        until(x == 0) {
            x -= 1
            println(x)
        }


    }
}

