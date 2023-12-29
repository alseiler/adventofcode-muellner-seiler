import java.io.File

fun main(args: Array<String>) {

    val input = File("inputs/day2.txt").readText()
    val games = input.split("\r\n")

    val regexGreen = "(\\d+)\\s*green".toRegex()
    val regexRed = "(\\d+)\\s*red".toRegex()
    val regexBlue = "(\\d+)\\s*blue".toRegex()

    var allSetPowers = 0

    for (game in games) {
        val filteredGreen = regexGreen.findAll(game).map { it.value }.toList() // Convert MatchResults to a List of Strings
        val filteredRed = regexRed.findAll(game).map { it.value }.toList() // Convert MatchResults to a List of Strings
        val filteredBlue = regexBlue.findAll(game).map { it.value }.toList() // Convert MatchResults to a List of Strings

        val filteredGreenNumbers = filteredGreen.map { it.replace("\\D+".toRegex(), "").toInt() }
        val filteredBlueNumbers = filteredBlue.map { it.replace("\\D+".toRegex(), "").toInt() }
        val filteredRedNumbers = filteredRed.map { it.replace("\\D+".toRegex(), "").toInt() }

        val product = filteredGreenNumbers.max() * filteredBlueNumbers.max() * filteredRedNumbers.max()

        allSetPowers += product

    }

    println(allSetPowers)

}
