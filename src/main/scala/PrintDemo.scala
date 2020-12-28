object PrintDemo {
  def main(args: Array[String]): Unit = {
    var str1 = "yhello"
    var str2 = " world"
    println(str1+str2)

    //格式化输出
    var name:String = "jim"
    var age:Int = 50
    var sex:String = "男"
    var sal:Double = 1565.5
    printf("名字：%s 年龄：%d 性别：%s",name,age,sex)
    printf("名字：%s 年龄：%d 性别：%s 薪水:%.1f" ,name,age,sex,sal)


    //使用$的引用
    println(s"\r\n名字$name \r\n性别$sex \r\n薪水$sal")
    //${}还可进行运算
    println(s"\r\n名字${name} \r\n性别${sex} \r\n薪水${sal*10}")

  }

}
