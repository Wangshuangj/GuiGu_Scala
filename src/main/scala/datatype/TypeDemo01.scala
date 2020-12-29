package datatype
//Scala中一切数据类都是对象
object TypeDemo01 extends App {

  var num1:Int = 10
  //因为Int是一个类，因此他的一个实例，可以有很多方法
  //在Scala中如果一个方法没有实参，可以省略()
  println(num1.toDouble+"\t"+num1.toString)


}
