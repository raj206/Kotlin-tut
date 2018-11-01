fun main(args: Array<String>){
	infix fun Int.times(str: String) = str.repeat(this)
	println(4 times "Hi!")
	
	val pair = "Delhi" to "Gurgaon"
	println(pair)

	infix fun String.nexus(other: String) = Pair(other, this)
	val myNexus = "Rohit" nexus "Dhawan"
	println(myNexus)

	val Kohli = Person("Kohli")
	val Dhoni = Person("Dhoni")
	print(Kohli likes Dhoni)
}

class Person(val name: String){
	val likedPeeps = mutableListOf<Person>()
	infix fun likes(other: Person) {likedPeeps.add(other)}	
}
