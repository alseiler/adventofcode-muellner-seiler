import java.io.File

fun main(args: Array<String>) {

    val input = File("inputs/day2.txt").readText()
    val targetValues = listOf(12, 13, 14)

    val games = input.split("\r\n")

    // Regex that matches strings that do not contain the word "red" preceded by numbers 13 or higher, "green" by numbers 14 or higher, or "blue" by numbers 15 or higher
    val regexCheckGamesForPlayability = "^(?!.*\\b(?:1[3-9]|[2-9]\\d|[1-9]\\d{2,}) red\\b|.*\\b(?:1[4-9]|[2-9]\\d|[1-9]\\d{2,}) green\\b|.*\\b(?:1[5-9]|[2-9]\\d|[1-9]\\d{2,}) blue\\b).*".toRegex()

    val listOfPlayableGames: MutableList<Any> = mutableListOf()
    for (game in games) {
        if (game.matches(regexCheckGamesForPlayability)) {
            listOfPlayableGames.add(game)
        }
    }
    println("\nPlayable games:\n$listOfPlayableGames")

    val regexGetGameIDs = "\\d+".toRegex()

    // Iterate over the list and replace each string with the first number found
    val listOfPlayableGameIDs = listOfPlayableGames.map { str ->
        regexGetGameIDs.find(str.toString())?.value ?: "" // Replace with the first number, or an empty string if no number is found
    }

    val sumOfPlayableGameIDs = listOfPlayableGameIDs.sumOf { it.toString().toInt() }
    println(sumOfPlayableGameIDs)

}