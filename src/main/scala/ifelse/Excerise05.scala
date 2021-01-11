package ifelse

import scala.io.StdIn

object Excerise05 {
  def main(args: Array[String]): Unit = {
    println("成绩：")
    val speed = StdIn.readDouble()

    if (speed>=8){
      println("性别")
      val age = StdIn.readChar()
      if (age=='男'){
        println("进入男子组")
      }else{
        println("进入女子组")
      }

    }else{
      println("淘汰")
    }
  }

}
