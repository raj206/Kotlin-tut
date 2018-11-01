fun main(args: Array<String>){
	val msg: String = "immutable string"
	val msg1: String = "added"
	var isTrue: Boolean = checkStr(msg)
	println(isTrue)
	println(!isTrue)
	println("--------------------------------------------------------")
	checkStr2(msg)
	println("--------------------------------------------------------")
	checkStr2(msg, msg1)
	println("--------------------------------------------------------")
	println(retInt())
	println("--------------------------------------------------------")
	println(oneLineRetInt(3, 5))
	println("--------------------------------------------------------")
	
}

fun checkStr(msg: String): Boolean{
	println(msg)
	return true;
}

fun checkStr2(msg: String, msg2: String = "Info"): Unit{
	println("[$msg2], $msg")
}

fun retInt(): Int {
	return 5;
}

fun oneLineRetInt(x: Int, y: Int) = x * y 

