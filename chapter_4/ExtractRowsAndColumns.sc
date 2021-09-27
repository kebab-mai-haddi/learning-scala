def extractRows(grid: Array[Array[Int]]): Boolean = {
  // print all rows, one by one
  !Range(0, 9).exists { i =>
    val row = Range(0, 9).map(grid(i)(_)).filter(_ != 0)
    println(row)
    val col = Range(0, 9).map(grid(_)(i)).filter(_ != 0)
    println(col)
    val square =
      Range(0, 9).map { j => grid((i % 3) * 3 + j % 3)((i / 3) * 3 + j / 3) }.filter(_ != 0)
    println(square)
    row.distinct.length != row.length || col.distinct.length != col.length || square.distinct.length != square.length
  }
}

val grid = Array(
  Array(3, 1, 6, 5, 7, 8, 4, 9, 2),
  Array(5, 2, 9, 1, 3, 4, 7, 6, 8),
  Array(4, 8, 7, 6, 2, 9, 5, 3, 1),
  Array(2, 6, 3, 0, 1, 0, 0, 8, 0),
  Array(9, 7, 4, 8, 6, 3, 0, 0, 5),
  Array(8, 5, 1, 0, 9, 0, 6, 0, 0),
  Array(1, 3, 0, 0, 0, 0, 2, 5, 0),
  Array(0, 0, 0, 0, 0, 0, 0, 7, 4),
  Array(0, 0, 5, 2, 0, 6, 3, 0, 0)
)

println(extractRows(grid))
