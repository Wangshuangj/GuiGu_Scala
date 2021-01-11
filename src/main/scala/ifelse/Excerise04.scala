package ifelse

import scala.io.StdIn
import math._

object Excerise04 {
  def main(args: Array[String]): Unit = {
    val a = StdIn.readInt()  //3
    val b = StdIn.readInt()  //100
    val c = StdIn.readInt()  //6
    var m = b*b-4*a*c
    if(m>0){
      var x1 = (-b+sqrt(b*b-4*a*c))/(2*a)
      var x2 = (-b-sqrt(b*b-4*a*c))/(2*a)
      println(x1+"````````"+x2)
    }else if (m==0){
      println("只有一个")
    }else{
      println("无根")
    }


  }

}
