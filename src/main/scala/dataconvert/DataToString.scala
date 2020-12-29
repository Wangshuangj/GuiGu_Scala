package dataconvert

object DataToString {
  def main(args: Array[String]): Unit = {
    val d1 = 1.2
    println(d1.toInt)
    //基本数据类型转string
    val s1 = d1 + ""

    //string转基本数据类型
    //println(s1.toInt)  //err:NumberFormatException
    println(s1.toDouble)
    println(s1.toFloat)
    println(s1.toByte)  //err:NumberFormatException


  }

}
