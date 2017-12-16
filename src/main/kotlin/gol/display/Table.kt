package gol.display

/**
 * Created by beibei on 16-12-17.
 */
class Table(val ListOfRow: List<Row>) : DisplayableAsHtml {

    override fun toHtml(): String {
        val text = StringBuilder()
        text.append("<table><tbody>")
        for (row in ListOfRow) {
            text.append(row.toHtml())
        }
        text.append("<tbody></table>")
        return text.toString()
    }
}