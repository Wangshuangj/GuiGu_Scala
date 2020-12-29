package datatype

import vars.VarDemo02.Dog

object UnitNullNothing {
  def main(args: Array[String]): Unit = {
    var res = sayHello()
    println(res)
  }


  def sayHello():Unit={

  }

  //null可以赋值给引用类型(AnyRef),但是不能赋值给值类型(AnyVal)
  val dog:Dog = null
  var c:Char = null  //会报错

  println("~~~~~~~")

}
