package scala03

object Scala06_Set {
    def main(args: Array[String]): Unit = {

        val set = Set(1, 2, 3)
        println(set)

        import scala.collection.mutable
        val mutableSet = mutable.Set(1, 2, 3)

        mutableSet.add(4)
        mutableSet += 6
        mutableSet += 6

        val mutableSet1 = mutableSet + 5

        println(mutableSet1)

        mutableSet1 -= 1
        mutableSet1.remove(2)

        println(mutableSet1)

        for(x <- mutableSet1) {
            println(x)
        }

    }
}
