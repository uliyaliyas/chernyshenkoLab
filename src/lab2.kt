fun main() {
    println("Введите простое число:")
    val num = readln().toInt()
    val nextNum = findNextPrime(num)
    println("Следующее простое число после $num: $nextNum")
}

fun findNextPrime(number: Int): Int {
    var nextNumber = number + 1
    while (true) {
        if (isPrime(nextNumber)) {
            return nextNumber
        }
        nextNumber++
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}