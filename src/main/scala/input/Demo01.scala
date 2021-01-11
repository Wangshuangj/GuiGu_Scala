package input

import scala.io.StdIn

object Demo01 {

  def main(args: Array[String]): Unit = {
    println("请输入姓名:")
    //伴生对象的特质，里面的方法可以直接使用
    val name = StdIn.readLine()
    println("请输入年龄")
    val age = StdIn.readInt()
    println("请输入薪水")
    val sal = StdIn.readDouble()
    printf("姓名是:%s  年龄是:%d  薪水是:%.2f", name, age, sal)

    //伴生对象以及特质里面的方法可以直接使用
    Cat.sayHi()
    Cat.sayHello()
  }

}

object Cat extends AAA {
  def sayHi(): Unit = {
    println("\r\nwwwwwww")
  }
}

trait AAA { //AAA是特质，等价于Java中的Interface+abtract Class
  def sayHello(): Unit = {
    println("mmmmmmm")
  }
}
