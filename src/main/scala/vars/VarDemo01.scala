package vars

object VarDemo01 {
  def main(args: Array[String]): Unit = {
    var name:String = "jim"
    var age:Int = 50
    var sex:String = "男"
    var isPass:Boolean = true
    //注意：Scala中小数默认为double。整数默认为Int
    var sal = 1565.5
    var sal1:Float = 1565.5f
    println(s"$age $name")
  }

}
