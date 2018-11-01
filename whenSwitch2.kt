
fun main(args: Array<String>){
	cases("Hello")
	cases(0L)
	cases(MyClass())
	cases(1)
	cases("hello")
}


fun cases(obj: Any) {
	when(obj) {
		1          -> println("Number One")
		is Long	   -> println("of type Long")
		!is String -> println("Not a String")
		"Hello"    -> println("Hello!")
		else 	   -> println("Unknown")
	}
}

class MyClass
