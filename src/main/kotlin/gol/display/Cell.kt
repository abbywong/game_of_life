package gol.display

/**
 * Created by beibei on 16-12-17.
 */
class Cell(val text: String): DisplayableAsHtml {

    override fun toHtml(): String {
        return "<td>" + text + "</td>"
    }
}