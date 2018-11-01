class ExampleClass(){
	fun example(){
		println("I am in the class.")
	}
}

object ExampleObject{
	fun example(){
		println("I am in the object.")
	}
}

fun main(args: Array<String>){
	val exampleClass = ExampleClass()
	exampleClass.example()
	ExampleObject.example()
}
