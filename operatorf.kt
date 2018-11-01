fun main(args: Array<String>) {
	operator fun Int.times(str: String) = str.repeat(this)
	println(2 * "Maka ")

	operator fun String.get(range: IntRange) = substring(range)
	val str = "To be or not to be"
	println(str[0..7])
}
