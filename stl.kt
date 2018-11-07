fun main(args: Array<String>){
	val nums = listOf(1, 2, -6, 2, -99, 4)
	val words = listOf("SFO","SEA","DFW","JFK","LAS","LAX")
	val pos  = nums.filter {it > 0}
	val neg  = nums.filter {it < 0}
	val times2 = nums.map{it * 2}
	val anynegs = nums.any {it < 0}
	val allPos = nums.all {it > 0}
	val allLess5 = nums.none {it > 5 }
	val first = words.find{it.startsWith("S")}
	val last = words.findLast{it.startsWith("L")}
 	val firstEven = nums.first { it % 2 == 0 }       
        val lastOdd = nums.last { it % 2 != 0 }	
	val tot = nums.count()
	val (po, ne) = nums.partition{it>0}
	val A = listOf("a", "b", "c", "d")
	val B = listOf(1,2,3,4,5)
	val zipInfix = A zip B
	val zipConcatenate = A.zip(B) {a,b -> "$a$b"}
	val tripled = nums.flatMap{listOf(it, it, it)}
	val asc = nums.sorted()
	val desc = nums.sortedBy{-it}
	print(" pos: $pos\n neg: $neg\n times2: $times2\n anynegs: $anynegs\n allPos: $allPos\n allLess5: $allLess5\n first : $first\n last : $last\n first even: $firstEven\n last Odd: $lastOdd\n Number of elements: $tot\n [$po],[$ne]\n $zipInfix\n $zipConcatenate")
	println("\n $nums -> $tripled\n Min element: ${nums.min()}\n Max element: ${nums.max()}\n Sorted ASC -> $asc\n Sorted DESC -> $desc")
	print(" "+nums.getOrElse(6) {99})
}
