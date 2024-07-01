package q1

object reverse {
  def reverse(s:String):String = {
    if (s.isEmpty) ""
    else reverse(s.tail) + s.head
  }

  def main(args:Array[String]): Unit = {
    println (reverse("scala"))
  }
}
