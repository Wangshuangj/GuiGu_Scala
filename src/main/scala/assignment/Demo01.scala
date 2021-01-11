package assignment

object Demo01 {
  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2 //左移并赋值
    num >>= 1 //右移并赋值
    println(num)


    //在Scala中支持代码块返回一个值
    var res = {
      90
    }

    println(res)


    //（1）交换a,b的值
    var a = 20
    var b = 10
    a = a + b
    b = a - b //b=a
    a = a - b //a = b
    println(a + "···" + b)

    //（2）
    a ^= b
    b ^= a
    a ^= b
    println(a + "···" + b)

    //求2个数或者三个数的最大值
    val n1 = 20
    val n2 = 55
    var res1 = if (n1 > n2) n1 else n2
    println(res1)

    val n4 =11
    var res2=if (res1>n4) res1 else n4
    println(res2)




  }

}
