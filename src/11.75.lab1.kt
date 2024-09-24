import kotlin.random.Random

fun main() {
    val numberOfStudents = 22
    val mas = IntArray(numberOfStudents) { Random.nextInt(2, 6) }

    println("Сгенерированные оценки:")
    for (m in mas) {
        print("$m ")
    }
    println()

    var countFives = 0
    var countFours = 0
    var countThrees = 0
    var countTwos = 0

    for (m in mas) {
        when (m) {
            5 -> countFives++
            4 -> countFours++
            3 -> countThrees++
            2 -> countTwos++
        }
    }

    println("Количество пятерок: $countFives")
    println("Количество четверок: $countFours")
    println("Количество троек: $countThrees")
    println("Количество двоек: $countTwos")
}
