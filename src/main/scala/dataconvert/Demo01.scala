package dataconvert

object Demo01 {
  def main(args: Array[String]): Unit = {
    var  n1 = 10
    var n2 = 1.1f
    //类型的自动转换
    var n3 = n1+n2


    //（byte，short）和char之间不会自动类型转换
    var n4:Byte = 10
    //var char1:Char = n4  //err:因为Byte不能自动转换为char

    //byte，short，char 他们三者可以计算，在计算时首先转换为Int类型
  }

}
