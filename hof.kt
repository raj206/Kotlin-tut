fun calc(x: Int, y: Int, op: (Int, Int) -> Int): Int {
	return op(x, y)
}

fun sum(x: Int, y: Int) = x+y

fun main(args: Array<String>){
	val sumres = calc(4, 5, ::sum)				 // referencing a function by name
	val summul = calc(4, 5) { x, y -> x * y }		 // using lambda function
	println("Sum = $sumres, Mul = $summul")
}
