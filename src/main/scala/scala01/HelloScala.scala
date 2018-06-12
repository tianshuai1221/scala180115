package scala01
// 类对象，其中声明的都是类似于java中静态的方法，可以直接调用
// Scala是一个完全面向对象的语言，所以没有静态的关键字，所以需要采用object声明
object HelloScala {
    // 类似于java中的main方法
    // def关键字用于声明函数
    //
    // public static void main( String[] args ) {}
    def main(args: Array[String]): Unit = {
        //System.out.println("Hello Scala");
        println("*" * 10)
    }

}
