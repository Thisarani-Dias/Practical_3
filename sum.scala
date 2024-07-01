package q4

object sum {
  def evenSum(n:List[Int], m:Int):Int = {
    if (n.isEmpty) m
    else {
      val head = n.head
      val tail = n.tail
      if (head % 2 == 0) evenSum(tail, m+head)
      else evenSum(tail, m)
    }
  }
  def main(args:Array[String]): Unit = {
    var num = List(1,2,4,5,7,8,3)
    var res = evenSum(num, 0)   //start recursion initially with 0 as sum
    println(res)
  }
}
