package arithoper

object Demo01 {
  def main(args: Array[String]): Unit = {
    var r1: Int = 10 / 3
    println(r1) //3
    var r2: Double = 10 / 3
    println(r2) //3.0
    var r3: Double = 10.0 / 3
    println(r3) //3.3333
    println(r3.formatted("%.2f")) //3.33


    //%的使用
    println(10 % 3)
    println(-10 % 3)
    println(-10 % -3)
    println(10 % -3)

    //++  --
    //在Scala中没有++和--，而使用+=1  和-=1
    var num = 10
    num += 1
    num -= 1
    println(num)

    //替换三元运算符
    var x = if (num == 11) 0 else 12
    println(x)

  }

}
