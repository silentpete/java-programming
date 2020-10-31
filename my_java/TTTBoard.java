/**
 * TicTacToe, the board and how to interact with the board
 * @author peter
 *
 */
class TTTBoard {
    char player1 = 'x';
    char player2 = 'o';
    
    private char tttArray[][] = {
        { '1', '2', '3' },
        { '4', '5', '6' },
        { '7', '8', '9' }
    };

    void show() {
        //Look up values and return the board
        System.out.print("  " + tttArray[0][0] + "  |  " +
            tttArray[0][1] + "  |  " +
            tttArray[0][2] + "  " +
            "\n" +
        "-----+-----+-----" + "\n" +
        "  " + tttArray[1][0] + "  |  " +
            tttArray[1][1] + "  |  " +
            tttArray[1][2] + "  " +
            "\n" +
        "-----+-----+-----" + "\n" +
        "  " + tttArray[2][0] + "  |  " +
            tttArray[2][1] + "  |  " +
            tttArray[2][2] + "  \n\n");
    }
    
    public char[][] getTTTArray() {
        return tttArray;
    }
    
    public void setTTTArray(char player, int x, int y) {
        char playerPiece = player;
        int row = x;
        int column = y;
        tttArray[row][column] = playerPiece;
    }
    
    void PrintWinner(char piece) {
        char playersPiece = piece;
        System.out.print("\nPlayer " + playersPiece + " is the WINNER!!!\n\n");
    }
}
