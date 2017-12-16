package gol

/**
 * Created by beibei on 16-12-17.
 */
class Square() {
    val isAlive: Boolean = false

    override fun toString(): String {
        if (isAlive) {
            return "X";
        } else {
            return ".";
        }
    }
}
