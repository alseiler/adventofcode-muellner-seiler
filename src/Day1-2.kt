import java.io.File

fun main(args: Array<String>) {

    val input = File("inputs/day1.txt").readText()
    val values = input.split("\r\n")

    fun getCalibrationValues(toCheck: String): Int {
        var tmp = toCheck.replace("one".toRegex(), "one1one")
        tmp = tmp.replace("two".toRegex(), "two2two")
        tmp = tmp.replace("three".toRegex(), "three3three")
        tmp = tmp.replace("four".toRegex(), "four4four")
        tmp = tmp.replace("five".toRegex(), "five5five")
        tmp = tmp.replace("six".toRegex(), "six6six")
        tmp = tmp.replace("seven".toRegex(), "seven7seven")
        tmp = tmp.replace("eight".toRegex(), "eight8eight")
        tmp = tmp.replace("nine".toRegex(), "nine9nine")
        tmp = tmp.replace("[a-zA-Z]".toRegex(), "")
        val calibrationNumber: Int = "${tmp[0]}${tmp.last()}".toInt()
        return calibrationNumber
    }

    val sumOfCalibrationValues = (values.map { getCalibrationValues(it) }).sum()
    println(sumOfCalibrationValues)




}

