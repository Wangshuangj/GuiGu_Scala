package ifelse

object Excerise02 {
  def main(args: Array[String]): Unit = {
    /*判断闰年
    *1 年份能被4整除，但不能被100整除
    *2 能被400整除
    **/

    val year = 1995
    if ((year%4==0 && year%100!=0) || (year%400==0)) println("year是闰年") else println("不是闰年")

  }

}
