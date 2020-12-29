package datatype

object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    println("Long的最大值"+Long.MaxValue+"Long的最小值"+Long.MinValue)

    //var s = 15985459515884  //err：超过int
    var s = 15985459515884L  //长整型

    //var f:Float = 1.1 //err:Double=>Float(不行)
    var f:Float = 1.1f

    var f1 = 1.2  //ok
    var f2:Double = 1.2 //ok
    var f3:Double = 1.2f //float=>double ok


    //float的精度损失
    //2.2345678912f , 2.2345678912
    var num1:Float = 2.2345678912f
    var num2:Double = 2.2345678912
    println("num1="+num1+"\r\num2="+num2)



  }

}
