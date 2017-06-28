public class RegexTicTacToeWinChecker {
    public static boolean regexTicTacToeWinChecker(String board) {
        return board.matches("(XXX|OOO).{6}|.{6}(XXX|OOO)|.{3}(XXX|OOO).{3}"
        +"|.*X..X..X.*|.*O..O..O.*"
        +"|X...X...X|O...O...O"
        +"|..X.X.X..|..O.O.O..");
    }
}
