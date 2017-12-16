package gol

import gol.display.Table
import org.w3c.dom.HTMLTableElement

/**
 * Created by beibei on 16-12-17.
 */
class Board(rows: Int, cols: Int) {
    val nrRows: Int = rows
    val nrCols: Int = cols

    val squares: MutableList<MutableList<Square>> = makeBoard(nrRows, nrCols);

    companion object {
        fun makeBoard(rows: Int, cols: Int): MutableList<MutableList<Square>> {
            val newSquares = mutableListOf<MutableList<Square>>()
            for (rowNr in 0 .. rows - 1) {
                newSquares.add(mutableListOf<Square>())
                for (colNr in 0 .. cols - 1) {
                    newSquares.get(rowNr).add(Square())
                }
            }
            return newSquares
        }
    }

    override fun toString(): String {
        val text = StringBuilder();
        for (rowNr in 0 .. nrRows - 1) {
            for (colNr in 0 .. nrCols - 1) {
                text.append(squares.get(rowNr).get(colNr))
                text.append(" ")
            }
            text.append("\n")
        }
        return text.toString()
    }

//    fun toHTML(): Table {
////        val table = HTMLTableElement()
//        for (rowNr in 0 .. nrRows - 1) {
//            for (colNr in 0 .. nrCols - 1) {
//            }
//        }
//        return Table() // tODO
//    }
}