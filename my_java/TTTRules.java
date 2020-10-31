/**
 * The Rules of TicTacToe
 */
public class TTTRules {
    // figure out who's turn it is
    int whoTurn = 0;
    String p1 = "player " + whoTurn;
    String p2 = "player " + whoTurn;
    
    /**
     * Use this Method to check the board for a winner
     * @param board Pass the board to check three in a row
     * @return will return true or false
     */
    boolean winner(TTTBoard board) {
        
        char[][] myArray = board.getTTTArray();
        // if three across
        if(myArray[0][0] == myArray[0][1] && myArray[0][1] == myArray[0][2]) return true;
        if(myArray[1][0] == myArray[1][1] && myArray[1][1] == myArray[1][2]) return true;
        if(myArray[2][0] == myArray[2][1] && myArray[2][1] == myArray[2][2]) return true;
        // if three down
        if(myArray[0][0] == myArray[1][0] && myArray[1][0] == myArray[2][0]) return true;
        if(myArray[0][1] == myArray[1][1] && myArray[1][1] == myArray[2][1]) return true;
        if(myArray[0][2] == myArray[1][2] && myArray[1][2] == myArray[2][2]) return true;
        // if diagonal down from 1
        if(myArray[0][0] == myArray[1][1] && myArray[1][1] == myArray[2][2]) return true;
        // if diagonal up from 7
        if(myArray[2][0] == myArray[1][1] && myArray[1][1] == myArray[0][2]) return true;
        
        return false;
    }
    /**
     * Use this method to see if all locations on the board contain a "x" or "o"
     * @param board pass the board to check if full
     * @return returns true or false
     */
    public boolean boardFull(TTTBoard board) {
        /**
         * Use to check if the board is full of x's and o'x
         */
        boolean checkFull = false;
        
        char[][] myArray = board.getTTTArray();
        
        int arrayFull = 0;
        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= 2; j++) {
                if(myArray[i][j] == 'x' || myArray[i][j] == 'o') {
                    arrayFull++;
                }
            }
        }
        if(arrayFull == 9) {
            checkFull = true;
        }
        return checkFull;
    }
    /**
     * Use this method to check if the selected location is available
     * @param board pass the board
     * @param x pass the row location
     * @param y pass the column location
     * @return returns true or false
     */
    public boolean checkAvailable(TTTBoard board, int x, int y) {
        char[][] myArray = board.getTTTArray();
        int row = x;
        int column = y;
        if(myArray[row][column] == 'x' || myArray[row][column] == 'o') {
            return false;
        }
        return true;
    }
    /**
     * Use this method to exit the game with a status 0
     */
    public void QuitGame() {
        System.out.print("\nHave a good one.\n");
        System.exit(0);
    }
    
}
