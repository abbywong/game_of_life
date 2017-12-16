package gol

import gol.display.Cell
import gol.display.Row
import gol.display.Table
import kotlin.browser.document

fun main(args: Array<String>) {
    println("Hello, world!")
//    val board = Board(10, 12)
//    val myCell = Cell("Jill is Cool")
//    println(myCell)
//    println(myCell.toHtml())
//    val myOtherCell = Cell("Beibei is more cool")
//    println(myOtherCell.toHtml())
//    println(myOtherCell.toHtml())
//    println(myOtherCell.toHtml())
    val firstRow = Row(listOf(
            Cell("Jill"),
            Cell("Smith"),
            Cell("50")
    ))
    val secondRow = Row(listOf(
            Cell("Eve"),
            Cell("Jackson"),
            Cell("94")
    ))
//    println(firstRow.toHtml())
    val table = Table(listOf(
            firstRow,
            secondRow
    ))
    println(table.toHtml())
    document.getElementById("game")!!.innerHTML = table.toHtml()
    //    println(board.toString())
}


