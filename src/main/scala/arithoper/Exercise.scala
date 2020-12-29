package arithoper

object Exercise {
  def main(args: Array[String]): Unit = {
    /*
    加入还有97天放假  问：xx个星期天xx天
     */

    val day = 97
    printf("统计结果是 %d个星期零%d天", day / 7, day % 7)


    /*
    华氏温度：232.5=>摄氏温度(公式：5/9*(华氏温度-100))
     */
    val huashi = 232.5
    val shehsi = 5.0 / 9 * (huashi - 100)
    println("\n摄氏温度是" + shehsi.formatted("%.2f"))
  }

}
