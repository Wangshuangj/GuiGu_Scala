package vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //类型推导
    var num = 10

    //方法一：使用idea进行类型推导
    //方法2 ：isInstanceOf[]判断
    println(num.isInstanceOf[Int])

    //类型确定后就不能修改


    var age = 30
    age = 20//ok


    //val num = 30
    //num = 20  //val修饰的变量时不可变的

    //设计val和var的原因“
    //（1）在实际编程，我们在创建或者获取一个对象后，
    // 更多的是修改哦对象的属性值，很少改变对象本身，这时，
    // 我们就可以使用val，因为val没有线程安全问题，效率高
    //val修饰的变量在编译后，等同于加上了一个final

  }

  val dog = new Dog
  dog.age = 90 //ok
  dog.name="小哈"//ok


  class Dog{
    var age = 10
    var name = "tom"
  }

}
