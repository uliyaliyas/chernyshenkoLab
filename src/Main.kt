import kotlin.random.Random

fun main() {
    val rows = 3 // Количество строк
    val cols = 5 // Количество столбцов
    val array = Array(rows) { IntArray(cols) { Random.nextInt(1, 100) } } // Генерируем рандомный массив

    // Вывод массива
    println("Сгенерированный массив:")
    for (i in array.indices) {
        for (j in 0..<array[i].size) {
            print("${array[i][j]} ")
        }
        println()
    }

    // а) сумма четных элементов массива
    var sumEven = 0
    for (i in array.indices) {
        for (j in 0..<array[i].size) { // Используем ..<
            if (array[i][j] % 2 == 0) {
                sumEven += array[i][j]
            }
        }
    }
    println("Сумма четных элементов: $sumEven")

    // б) количество элементов массива, меньших 50
    var countLessThan50 = 0
    for (i in array.indices) {
        for (j in 0..<array[i].size) { // Используем ..<
            if (array[i][j] < 50) {
                countLessThan50++
            }
        }
    }
    println("Количество элементов, меньших 50: $countLessThan50")

    // в) среднее арифметическое нечетных элементов массива
    var sumOdd = 0
    var countOdd = 0
    for (i in array.indices) {
        for (j in 0..<array[i].size) { // Используем ..<
            if (array[i][j] % 2 != 0) {
                sumOdd += array[i][j]
                countOdd++
            }
        }
    }
    val averageOdd = if (countOdd > 0) sumOdd.toDouble() / countOdd else 0.0
    println("Среднее арифметическое нечетных элементов: $averageOdd")

    // г) сумма тех элементов массива, сумма индексов которых кратна трем
    var sumIndexMulOf3 = 0
    for (i in array.indices) {
        for (j in 0..<array[i].size) { // Используем ..<
            if ((i + j) % 3 == 0) {
                sumIndexMulOf3 += array[i][j]
            }
        }
    }
    println("Сумма элементов с индексами, кратными 3: $sumIndexMulOf3")
}
