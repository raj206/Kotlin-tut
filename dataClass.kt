data class User(val name: String, val id: Int)

fun main(args: Array<String>){
	val user  = User("Raj", 1)
	val user2 = User("Bob", 2)
	println("Name of id 1: ${user.component1()}")
	println("Bob's Id: ${user2.component2()}") 
}
