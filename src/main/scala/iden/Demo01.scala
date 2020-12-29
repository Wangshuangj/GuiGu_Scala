package iden

object Demo01 {
  def main(args: Array[String]): Unit = {
    val ++ = "hello world"
    println(++)

    val -+ = 90
    println(-+)

    //val +Q = "ABC"  //err:首字符为标识符，后续必须再跟一个标识符


    //使用`.....`包括的任意字符，即使是关键字也可以
    var `true` = "hello scala"
    println(`true`)

    var Int = 10.05
    println(Int)

  }

}
