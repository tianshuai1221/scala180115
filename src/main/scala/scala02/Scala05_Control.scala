package scala02

import scala.util.control.Breaks

object Scala05_Control {
    def main(args: Array[String]): Unit = {

        // 控制结构
        // if else

        /*
        var s = "";

        // 如果大括号内的逻辑代码只有一行，大括号可以省略
        val r = if ( s == "" ) {
            //s = "123"; // 赋值操作，赋值操作的返回值就是void
            s = "123";"456"
        } else {
            //s = "456"
            "456"
        }

        // 赋值的意思
        val r1 = if ( s == "" ) "111" else "789"
        val r2 = if ( s != "" ) "222"

        println(r2.getClass.getName + ":" + r2)
        */

        // while
        /*
        var n = 1;
        val while1 = while(n <= 10){
            n += 1
        }

        println(while1)
        println(n)

        var n = 1;
        val loop = new Breaks
        var loop1 = new Breaks;

        // 可以实现嵌套循环
        loop.breakable{
            loop1.breakable{

                while(n <= 20){
                    n += 1;
                    if(n == 18){
                        loop.break()
                    }
                }

            }
        }

        println(n);
        */

        // for循环
        // for ( int i = 0; i < 10; i++ ) {}
        // for ( User user : users ) {}
        // for ( user <- users ) {}

        /*
        for ( i <- 1 to 3 ) {
            println("i = " + i)
        }
        */

        /*
        for ( i <- 1 until 3 ) {
            println("i = " + i)
        }
        */

        /* 守卫保护表达式，类似于continue
        for ( i <- 1 to 3 if ( i != 2 ) ) {
            println("i = " + i);
        }
        */

        // scala语法中小括号可以使用大括号代替
        // 只有一行代码，就使用小括号
        // 如果有多行代码，就使用大括号
        // for循环的表达式可以根据场景增加不同的逻辑操作

        // for循环的返回值可以使用yield关键字获取新的集合
        var f1 = for {
            i <- 1 to 3
            j <- 1 to 3
        }  yield i+j


        println(f1.getClass.getName + "=" + f1);

        /*
           for ( int i =0 ; i<3;i++ ) {
               for ( int j = 0; j < 3; j++ ) {
                   out.println(i + "=" + j);
               }
           }

         */

        val for5 = for(i <- 1 to 10) yield i
        println(for5)

        // 字符串也是集合（字符序列），可以循环遍历
        val s = "Hello";
        for ( i <- s ) {
           println(i)
        }

    }
}
