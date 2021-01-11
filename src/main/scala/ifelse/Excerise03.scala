package ifelse

import scala.io.StdIn

object Excerise03 {
  def main(args: Array[String]): Unit = {
    println("请输入成绩：")
    val sca = StdIn.readDouble()
    if (sca==100){
      println("BMW")
    }else if(sca>90){
      println("iphone")
    }else if(sca>60 && sca<=90){
      println("ipad")
    }else{
      println("啥也没有")
    }
  }

}
