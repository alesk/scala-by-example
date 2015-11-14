package chapter01

object QuickSort {

  def sort(xs: Array[Int]): Array[Int] =
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)

      // (pivot ==) in explicit form (x => pivot > x)
      Array.concat(
        sort(xs filter (pivot >)),
        xs filter (pivot ==),
        sort(xs filter (pivot <))
      )
    }

  def main(args: Array[String]) {
    val input = List(1, 5, 3, 99, 13, 6, 1, 5, 41)
    val sorted = sort(input.toArray).mkString(", ")
    println(s"Sorted $sorted")
  }
}

