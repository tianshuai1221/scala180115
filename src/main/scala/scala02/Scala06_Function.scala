package scala02

object Scala06_Function {
    def main(args: Array[String]): Unit = {

        // 函数的声明
        // public void methodName([param list]) : {
        //   method body
        // }
        // scala 声明函数
        // 函数声明采用def声明
        // 函数是可以嵌套的
        def test( s : String ): String = {
            s + "123"
        }

        val r1 = test("111");
        println(r1);

        // scala可以根据方法的返回值结果自动推断出方法返回值类型
        // 所以返回值类型可以省略
        def test1 ( s : String ) = {
            s + "123"
        }

        val r2 = test1("222");
        println(r2);

        def test2 ( s : String ) = {
           if ( s == "1" ) {
               "456"
           } else {
               123
           }
        }

        val r3 = test2("1")
        val r4 = test2("2")
        println("r3 = " + r3.getClass.getName + ":" +r3)
        println("r4 = " + r4.getClass.getName + ":" +r4)

        // 方法可以传递多个参数，参数可以设定默认值，如果在调用方法时，没有传递指定参数，就会采用默认值
        def test5( s1 : String, s2 : String = "1" ): String = {
            s1 + s2
        }

        def test6( s : String, start : String = "<<<", end : String = ">>>") : String = {
            start + s + end
        }

        //println(test5("a", "b"))
        // @RequestParam
        //println(test5("a"))
        //println(test6("Scala", "[[[", "]]]"));
        // 带名参数:根据参数名称传递参数值
        println(test6("Scala", start="]]]", end="[[["));

        def test7( args : Int* ) : Unit = {
            var result = 0
            for(arg <- args)
                result += arg
            result
        }

        println( test7(1,2,3) );

        // 递归函数在使用时必须有明确的返回值类型
        def factorial(n: Int) : Int = {
            if(n <= 0)
                1
            else
                n * factorial(n - 1)
        }
        println("*************")
        def test8(s : String) {
            //println(s)
            "123"
        }

        println(test8("1"))

        def test9 (): Unit = {
            println("lazy test9");
        }

        lazy val r9 = test9()
        println("after invoke...");
        println(r9)

    }
}
