package datatype

object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    println(sayhello)
  }

  //比如在开发中，我峨嵋你有一个方法，就会异常中断，这时就使用Nothing
  //即当我们Nothing做返回值，就是明确说明该方法没有正常返回值
  def sayhello:Nothing={
    throw new Exception("抛出异常")
  }

  var num = 1.2
  var num2 = 3.6f
  num = num2   //隐式转换
  //num2=num   //err
  num2 = num.toFloat  //true

}
