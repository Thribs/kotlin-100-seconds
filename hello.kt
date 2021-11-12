fun main() {
    var hello: String? = "Hi, mom!"
    println(hello)

    var thiago = Humanoid()
    thiago.yo()
    thiago.walk()
    println(lambda(5))
    val person = User("Thiago", 27)
    val (name, age) = person
    println("$name, $age")
}

class Humanoid {
    val name = "Thiago"

    fun yo() {
        println(name)
    }
}

fun Humanoid.walk() {
    println("${this.name} is walking")
}

fun double(x: Int) = x * 2

val lambda: (Int) -> Int = { num -> double(num) }

data class User(val name: String, val age: Int)
