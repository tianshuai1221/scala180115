package scala04

import scala.collection.mutable.ArrayBuffer

object Scala02_InnerClass {

    def main(args: Array[String]): Unit = {
        //创建两个局域网(外部类)
        val chatter1 = new Network
        val chatter2 = new Network

        // 内部类在scalaz中从属于对象，所以对象不一样，内部类就不一样
        val tom = chatter1.join("Tom")
        val jack = chatter1.join("Jack")

        val bob = chatter2.join("Bob")

        // chatter1.Member
        tom.contacts += jack
        // chatter2.Member
       // tom.contacts += bob

    }


}
class Network {
    class Member(val name: String) {
        val contacts = new ArrayBuffer[Member]
    }
    private val members = new ArrayBuffer[Member]
    def join(name: String) = {
        val m = new Member(name)
        members += m
        m
    }
}


