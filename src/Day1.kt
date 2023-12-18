import java.io.File

fun main(args: Array<String>) {

    val input = File("inputs/day1.txt").readText()
    val values = input.split("\r\n")

    fun getCalibrationValues(toCheck: String): Int {
        val tmp = toCheck.replace("[a-zA-Z]".toRegex(), "")
        val calibrationNumber: Int = "${tmp[0]}${tmp.last()}".toInt()
        return calibrationNumber
    }

    val newValues = values.map { getCalibrationValues(it) }

    println(newValues.sum())

}

