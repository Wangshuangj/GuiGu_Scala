package ifelse

object Excerise01 {
  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 5
    val sum = num1+num2
    if (sum%3==0 && sum%5==0) println("两个数的和既能整除3又能整除5") else println("什么都不是")

  }

}
