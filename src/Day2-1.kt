import java.io.File

fun main(args: Array<String>) {

    val targetValues = listOf(12, 13, 14)
    val input = File("inputs/day2.txt").readText()

    val games = input.split("\r\n")

    println("\nTarget values:\n$targetValues")

    println("\nGames:\n$games")
    println("First game: " + games[0])

    val sets = games[0].split(";")
    println("\nSets:\n$sets")
    println("First set: " + sets[0])

    val setsNumbers = sets[0].replace("[ a-zA-Z]".toRegex(), "").substringAfter(":") // re: replaces all letters with empty string and keeps only text after ":"
    println("\nFirst set with only numbers:\n${setsNumbers.split(",")}")

    val gameValues = setsNumbers.split(",").map { it.toInt() }
    println("\nGameValues:\n$gameValues")

    var gameCounter = 0
    var setCounter = 0
    for (j in 1..1) {
        var colorCounter = 0
        for (i in 0..<gameValues.count())
            if (gameValues[i] <= targetValues[i]) {
                colorCounter += 1
            }
        if (colorCounter == gameValues.count()) {
            println("\nSet ${sets[0]} can be played.")
        } else {
            println("\nSet ${sets[0]} can't be played.")
        }
    }
}

