package datatype

object CharDemo {
  def main(args: Array[String]): Unit = {
    var char1:Char = 97
    //当输出char类型时，他会输出对应的字符（码值表 Unicode(包括ascii码)）
    println(char1)

    var c1:Char = 'a'
    var num = c1+10
    println(num)  //107

    //原因：
    //1 当将一个计算结果赋值给一个变量，则编译器会进行类型转换和判断
    //2 当将一个字面量覅只给一个变量，则编译器会进行范围判定
    //var c2:Char = 'a'+1   //err:'a'会先转化为int类型再和1相加，最后将int赋给char，所以err
    //var c3:Char = 97+1    //err:结果为int,赋值给char，err
    var c2:Char = 98

  }

}
