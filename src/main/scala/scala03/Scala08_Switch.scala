package scala03

object Scala08_Switch {
    def main(args: Array[String]): Unit = {

        // scala中的模式匹配类似于java中的switch分支判断
        // scala中不需要break，因为可以自动推断处理，避免java中忘记写break所产生的问题
        var result = 0;
        val op : Char = 'A'

        op match {
            case '+' => result = 1
            case '-' => result = -1
            case _ => result = 0
        }
        //println(result)


        /*
        模式匹配中可以使用条件判断对case功能进行补充
        for (ch <- "+-3!") {
            var sign = 0
            var digit = 0

            ch match {
                case '+' => sign = 1
                case '-' => sign = -1
                case _ if ch.toString.equals("3") => digit = 3
                case _ => sign = 0
            }
            println(ch + " " + sign + " " + digit)
        }
        */

        /*
        模式匹配可以将match前表达式的值会赋给那个变量，进行逻辑判断
        val str = "+-3!"
        for (i <- str.indices) {
        //for (i <- str) {
            var sign = 0
            var digit = 0

            // string(i==> index)
            str(i) match {
                case '+' => sign = 1
                case '-' => sign = -1
                case ch if Character.isDigit(ch) => digit = Character.digit(ch, 10)
                case _ =>
            }
            println(str(i) + " " + sign + " " + digit)
        }
        */

        /*
        val a = 5
        val obj = if(a == 1) 1
        else if(a == 2) "2"
        else if(a == 3) BigInt(3)
        else if(a == 4) Map("aa" -> 1)
        else if(a == 5) Map(1 -> "aa")
        else if(a == 6) Array(1, 2, 3)
        else if(a == 7) Array("aa", 1)
        else if(a == 8) Array("aa")
        val r1 = obj match {
            case x: Int => x
            case s: String => s.toInt
            case BigInt => -1 //不能这么匹配
            case _: BigInt => Int.MaxValue
            case m: Map[String, Int] => "Map[String, Int]类型的Map集合"
            case m: Map[_, _] => "Map集合"
            case a: Array[Int] => "It's an Array[Int]"
            case a: Array[String] => "It's an Array[String]"
            case a: Array[_] => "It's an array of something other than Int"
            case _ => 0
        }
        println(r1 + ", " + r1.getClass.getName)
        */

        /*
        for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))) {
            val result = arr match {
                case Array(0) => "0"
                case Array(x, y) => x + " " + y
                case Array(x, y, z) => x + " " + y + " " + z
                case Array(0, _*) => "0..."
                case _ => "something else"
            }
            println(result)
        }
        */

        /*
        for (lst <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
            val result = lst match {
                case 0 :: Nil => "0"
                case x :: y :: Nil => x + " " + y
                case 0 :: tail => "0 ..."
                case _ => "something else"
            }
            println(result)
        }
        */

        /*
        for (pair <- Array((0, 1), (1, 0), (1, 1))) {
            val result = pair match {
                case (0, _) => "0 ..."
                case (y, 0) => y + " 0"
                case _ => "neither is 0"
            }
            println(result)
        }
        */
        // Array(1,2,3) ： apply(1,2,3)
        // case Array(n) : unapply(number) = n

        object Square {
            def unapply(z: Double): Option[Double] = Some(math.sqrt(z))
        }

        val number: Double = 36.0
        number match {
            case Square(n) => println(s"square root of $number is $n")
            case _ => println("nothing matched")
        }


        // 字符串的拼接 & 变量的值插入
        //println(a + "," + b);
        //val s = "Scala";
        //println("Hello " + s);
        // 字符串前增加s表示只使用表达式而不进行格式化
        //println(s"Hello $s %n !");
        // 字符串前增加f表示使用表达式后进行格式化
        //println(f"Hello $s %n !");

        /*
        object Names {
            def unapplySeq(str: String): Option[Seq[String]] = {
                if (str.contains(",")) Some(str.split(","))
                else None
            }
        }

        val namesString = "Alice,Bob,Thomas"
        namesString match {
            case Names(first, second, third) => {
                println("the string contains three people's names")
                println(s"$first $second $third")
            }
            case _ => println("nothing matched")
        }
        */

        /*
        val (x, y) = (1, 2)

        val (q, r) = BigInt(10) /% 3
        val arr = Array(1, 7, 2, 9)
        val Array(first, second, _*) = arr
        println(first, second)
        */

        /*
        for中可以对集合数据进行匹配后进行循环处理
        import scala.collection.JavaConverters._
        for ((k, v) <- System.getProperties.asScala)
            println(k + " -> " + v)

        for ((k, "") <- System.getProperties.asScala)
            println(k)

        for ((k, v) <- System.getProperties.asScala if v == "")
            println(k)
            */

        /*
        样例类：增加了case的类
        for (amt <- Array(Dollar(1000.0), Currency(1000.0, "EUR"), Nothing)) {
            val result = amt match {
                case Dollar(v) => "$" + v
                case Currency(_, u) => u
                case Nothing => ""
            }
            println(amt + ": " + result)
        }
        */

        /*
        copy 创建新的对象
        val amt = Currency(29.95, "EUR")
        val price = amt.copy(value = 19.95)
        println(amt)
        println(price)
        println(amt.copy(unit = "CHF"))

*/
        /*
        List(1, 7, 2, 9) match {
            case first :: second :: rest => println(first + second + rest.length)
            case _ => 0
        }

        val sale = Bundle("愚人节大甩卖系列", 10,
            Article("《九阴真经》", 40),
            Bundle("从出门一条狗到装备全发光的修炼之路系列", 20,
                Article("《如何快速捡起地上的装备》", 80),
                Article("《名字起得太长躲在树后容易被地方发现》",30)))

        val result1 = sale match {
            case Bundle(_, _, Article(descr, _), _*) => descr
        }
        //println(result1)

        val result2 = sale match {
            case Bundle(_, _, art @ Article(_, _), rest @ _*) => (art, rest)
        }
        println(result2)

        val result3 = sale match {
            case Bundle(_, _, art @ Article(_, _), rest) => (art, rest)
        }
        println(result3)

        def price(it: Item): Double = {
            it match {
                case Article(_, p) => p
                case Bundle(_, disc, its@_*) => its.map(price _).sum - disc
            }
        }

        println(price(sale))

*/
        /*
        for (color <- Array(Red, Yellow, Green))
            println(
                color match {
                    case Red => "stop"
                    case Yellow => "slowly"
                    case Green => "go"
                })
        */

        /*
        val f: PartialFunction[Char, Int] = {
            case '+' => 1
            case '-' => -1
        }
        println(f('-'))
        println(f.isDefinedAt('0'))
        println(f('+'))
        */

        /*
        val f1 = new PartialFunction[Any, Int] {
            def apply(any: Any) = any.asInstanceOf[Int] + 1

            def isDefinedAt(any: Any) = if (any.isInstanceOf[Int]) true else false
        }

        // 集合中collect方法需要传递偏函数
        val rf1 = List(1, 3, 5, "seven") collect f1
        println(rf1)
        */

        def f2: PartialFunction[Any, Any] = {
            case i: Int => i + 1
            case ch => ch
        }
        val rf2 = List(1, 3, 5, "seven") collect f2
        println(rf2)



    }
}
abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount
case object Nothing extends Amount


abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, item: Item*) extends Item

sealed abstract class TrafficLightColor
case object Red extends TrafficLightColor
case object Yellow extends TrafficLightColor
case object Green extends TrafficLightColor

