fun main(args: Array<String>){
	val uc1: (String) -> String = { str: String -> str.toUpperCase() }
	val uc2: (String) -> String = { str -> str.toUpperCase()}
	val uc3 = { str: String -> str.toUpperCase() }
	val uc5: (String) -> String = { it.toUpperCase()}
	val uc6: (String) -> String = String::toUpperCase
	val msg: String = "hello"
	println("${uc1(msg)}    ${uc2(msg)}   ${uc3(msg)}   ${uc5(msg)} ${uc6(msg)}")
}
