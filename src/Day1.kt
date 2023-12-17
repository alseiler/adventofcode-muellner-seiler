import java.io.File

fun main(args: Array<String>) {

    val input = File("C:/Users/alexa/Desktop/FH/ASD/Advent-Of-Code/Input/Day1.txt").readText()
    val values = input.split("\n")

    fun getCalibrationValues(toCheck: String): Int {
        val tmp = toCheck.replace("[a-zA-Z]".toRegex(), "")
        val calibrationNumber: Int = "${tmp[0]}${tmp.last()}".toInt()
        return calibrationNumber
    }

    val newValues = values.map { getCalibrationValues(it) }

    println(newValues.sum())

}

