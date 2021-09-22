object Loops extends App {
val numbers = List(1,3,5,7,9)
  numbers.foreach(println(_))
  val iter = numbers.iterator
  while(iter.hasNext) println(iter.next())
  for(element <- numbers) println(element)
}
