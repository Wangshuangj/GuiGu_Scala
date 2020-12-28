object LookSourceCode {
  def main(args: Array[String]): Unit = {
    var arr = new Array[String](10)

    for (item <- arr) {
      val c = if (Nil.equals(item)) "aa" else "bb"
      println(c)
    }


  }

}
