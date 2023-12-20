import java.io.File

fun main(args: Array<String>) {

    val colorsInElfBag = listOf(12, 13, 14)

    val inputString = File("inputs/day2.txt").readText()
    println("\nInput String:\n$inputString")

    val allGames = inputString.split("\r\n")
    println("\nAll Games:\n$allGames")


    val allGameSets: MutableList<Any> = mutableListOf()
    for (game in allGames) {
        allGameSets.add(game.split(";"))
    }
    println("\nAll Game Sets:\n$allGameSets")
    println("\nFirst Set:\n${allGameSets[0]}")

    val allGameSetsFirst = allGameSets[0] as List<*>
    println(allGameSetsFirst)

    println(allGameSetsFirst::class.simpleName)


    println(allGameSetsFirst[0])


}
