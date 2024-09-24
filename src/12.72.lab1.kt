import kotlin.random.Random

fun main() {
    val rows = 3
    val cols = 5
    val array = Array(rows) { IntArray(cols) { Random.nextInt(1, 100) } }
    println("Сгенерированный массив:")
    for (i in array.indices) {
        for (j in 0..<array[i].size) {
            print("${array[i][j]} ")
        }
        println()
    }

    var sumEven = 0
    for (i in array.indices) {
        for (j in 0..<array[i].size) {
            if (array[i][j] % 2 == 0) {
                sumEven += array[i][j]
            }
        }
    }
    println("Сумма четных элементов: $sumEven")

    var countLessThan50 = 0
    for (i in array.indices) {
        for (j in 0..<array[i].size) {
            if (array[i][j] < 50) {
                countLessThan50++
            }
        }
    }
    println("Количество элементов, меньших 50: $countLessThan50")

    var sumOdd = 0
    var countOdd = 0
    for (i in array.indices) {
        for (j in 0..<array[i].size) {
            if (array[i][j] % 2 != 0) {
                sumOdd += array[i][j]
                countOdd++
            }
        }
    }
    val averageOdd = if (countOdd > 0) sumOdd.toDouble() / countOdd else 0.0
    println("Среднее арифметическое нечетных элементов: $averageOdd")

    var sumIndexMulOf3 = 0
    for (i in array.indices) {
        for (j in 0..<array[i].size) {
            if ((i + j) % 3 == 0) {
                sumIndexMulOf3 += array[i][j]
            }
        }
    }
    println("Сумма элементов с индексами, кратными 3: $sumIndexMulOf3")
}
