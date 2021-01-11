package ifelse

import scala.io.StdIn

object Demo01 {
  def main(args: Array[String]): Unit = {
    println("请输入年龄")
    val age = StdIn.readInt()
    if (age > 18) println("age>18")   //单分支
    if (age > 18) println("age>18") else println("age<=18")  //多分枝


  }

}
