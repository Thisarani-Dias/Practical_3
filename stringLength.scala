object stringLength {
  def filterstring(strings: List[String]): List[String] = {
    strings match {
      case Nil => Nil
      case head :: tail =>
        if (head.length > 5) head :: filterstring(tail)
        else filterstring(tail)
    }
  }

  def main(args: Array[String]): Unit = {
    val inputList = List("DSA", "FP", "Mathematics","Science")
    val filtered = filterstring(inputList)
    println(filtered)
  }
}
