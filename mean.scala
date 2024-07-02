package q3

object mean {
  def mean(n1:Double, n2:Double):Double = {
    val tot = n1+n2
    val mean = tot/2.0
    val rounded = f"$mean%.2f".toDouble
    rounded
  }
  def main(args:Array[String]): Unit = {
    var n1 = 5.34
    var n2 = 2.33
    var res = mean(n1, n2)
    println(res)
  }
}
