package datatype

object Exercise1 {
  def main(args: Array[String]): Unit = {
    //取3的平方根
    var sqrt = math.sqrt(3)
    println(sqrt)
    //取3的平方根的平方
    var res = sqrt * sqrt
    println(res)

    println(3==res)


    //scala允许字符串乘以一个值,返回一个字符串
    var a = "hello"
    println(a*3)

    //返回两个数的最大值
    println(10 max 2)
    println(10.max(2))

    //使用bigint计算2的1024次方
    val num = BigInt(3)
    println(num.pow(1024))
    println(num pow 1024)
    println(BigInt(3).pow(1024))



    //截取字符串  hello的首尾字符
    var str = "hello"
    println(str.take(1))  //取首字符
    println(str(0))  //取首字符

    println(str.reverse(0))  //取尾字符
    println(str.takeRight(1))  //取尾字符
  }

}
