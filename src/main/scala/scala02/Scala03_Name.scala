package scala02

object Scala03_Name {
    def main(args: Array[String]): Unit = {

        // java 标识符的命名规则：
        // 1) 数字，字母，下划线，美元$符号
        // 2) 数字不能开头
        // 3) 不能使用关键字包括保留字（goto）
        //     public
        // 4) 区分大小写 Public
        // 5) 长度没有限制，最好见名知意
        // 6) 驼峰标识
        // java.lang.String
        // scala中标识符可以使用运算符
        val % = "1123";
        println(%)
        val i1 : Int = 1;
        val i2 = i1 / 1 // i1./(1)
        //sval i3 = i2++
    }
}
