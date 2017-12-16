package gol.display

/**
 * Created by beibei on 16-12-17.
 */
class Row(val cells: List<Cell>): DisplayableAsHtml {

    override fun toHtml(): String {
        val text = StringBuilder()
        text.append("<tr>")
//        return "<tr>" + cells.joinToString() + "</tr>"
        for (cell in cells) {
            text.append(cell.toHtml())
        }
        text.append("</tr>")
        return text.toString()
    }
}