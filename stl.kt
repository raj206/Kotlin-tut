fun main(args: Array<String>){
	val nums = listOf(1, 2, -6, 2, -99, 4)
	val pos  = nums.filter {it > 0}
	val neg  = nums.filter {it < 0}
	val times2 = nums.map{it * 2}
	val anynegs = nums.any {it < 0}
	val allPos = nums.all {it > 0}
	val allLess5 = nums.none {it > 5 }
	print("pos: $pos, neg: $neg , times2: $times2, anynegs: $anynegs, allPos: $allPos, allLess5: $allLess5")
}
