
//1.我们可以理解scala再运行时进行了一个包装
//2.object TestScala 对应的是一个TestScala$的静态单例对象Module$
object TestScala {

  def main(args: Array[String]): Unit = {
    println("hello,world~~")
  }

}
