import java.io.File

fun main(args: Array<String>) {

    val input = File("inputs/day1.txt").readText()
    val values = input.split("\r\n")

    fun getCalibrationValues(toCheck: String): Int {
        var tmp = toCheck.replace("[a-zA-Z]".toRegex(), "")
        tmp = tmp.replace("[one]".toRegex(), "1")
        tmp = tmp.replace("[two]".toRegex(), "2")
        tmp = tmp.replace("three".toRegex(), "3")
        tmp = tmp.replace("four".toRegex(), "4")
        tmp = tmp.replace("five".toRegex(), "5")
        tmp = tmp.replace("six".toRegex(), "6")
        tmp = tmp.replace("seven".toRegex(), "7")
        tmp = tmp.replace("eight".toRegex(), "8")
        tmp = tmp.replace("nine".toRegex(), "9")
        val calibrationNumber: Int = "${tmp[0]}${tmp.last()}".toInt()
        return calibrationNumber
    }

    val newValues = values.map { getCalibrationValues(it) }

    println(newValues.sum())

}

