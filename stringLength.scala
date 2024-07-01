package q2

object stringLength {
  def stringLength(s: List[String], str: List[String] = List()): List[String] = {     //str is an empty list by default
    if (s.isEmpty) str.reverse
    else {
      val head = s.head
      val tail = s.tail
      if (head.length > 5) stringLength(tail, head :: str)
      else stringLength(tail, str)
    }
  }

  def main(args: Array[String]): Unit = {
    val input = List("four", "fivewords", "six", "sevens")
    println(stringLength(input))
  }
}
