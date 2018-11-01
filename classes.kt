class Customer

class Contact(val id: Int, var email: String)

fun main(args: Array<String>){
	val customer = Customer() 		//creating an instance
	val contact = Contact(1, "a@e.com")     //creating an instance with using the constructor with two args
	println(contact.id)
	contact.email = "b@e.com"
	println(contact.email) 			//showing that the email is mutable because we used var to define it 
	println(customer)
}
