/*
 * create a simple tic tac toe game
 *
 * 1 player input vs random computer input
 */

class TTTArray {
    // set array place markers
    char tttArray [] [] = {
        { '1', '2', '3' },
        { '4', '5', '6' },
        { '7', '8', '9' }
    };
}

/*
class TTTCheckWin {
    TTTArray checkWinner = new TTTArray();
    char x = 'x';
    char o = 'o';
    
    for(int x : tttArray) {
        if()
    }
    return false;
}
*/

class TTTBoard {
    static void show() {
        TTTArray getArray = new TTTArray();
        //Look up values and return the board
        System.out.print("  " + getArray.tttArray[0][0] + "  |  " +
            getArray.tttArray[0][1] + "  |  " +
            getArray.tttArray[0][2] + "  " +
            "\n" +
        "-----+-----+-----" + "\n" +
        "  " + getArray.tttArray[1][0] + "  |  " +
            getArray.tttArray[1][1] + "  |  " +
            getArray.tttArray[1][2] + "  " +
            "\n" +
        "-----+-----+-----" + "\n" +
        "  " + getArray.tttArray[2][0] + "  |  " +
            getArray.tttArray[2][1] + "  |  " +
            getArray.tttArray[2][2] + "  ");
    }
}

class TicTacToe {
    public static void main(String args[]) 
        throws java.io.IOException {
        // connect to the board
        TTTBoard getBoard = new TTTBoard();
        TTTArray testArray = new TTTArray();
        char choice, ignore;
        
        // opening description
        System.out.print("\n\n");
        System.out.println("Would you like to play a game... ");
        System.out.println("Tic Tac Toe");
        System.out.println("\nYou are x, the computer is o");
        
        do {
            System.out.println();

            getBoard.show();
            
            System.out.println("\n\nPlease choose the number where you "
                    + "want to place your x");
            System.out.println("To continue, press enter\n");
            System.out.print("(q to quit): ");
            
            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
        } while(choice < '1' | choice > '9' & choice != 'q');
        
        switch(choice) {
            case '1':
                testArray.tttArray[0][0] = 'x';
                break;
            case '2':
                testArray.tttArray[0][1] = 'x';
                break;
            case '3':
                testArray.tttArray[0][2] = 'x';
                break;
            case '4':
                testArray.tttArray[1][0] = 'x';
                break;
            case '5':
                testArray.tttArray[1][1] = 'x';
                getBoard.show();
                break;
            case '6':
                testArray.tttArray[1][2] = 'x';
                break;
            case '7':
                testArray.tttArray[2][0] = 'x';
                break;
            case '8':
                testArray.tttArray[2][1] = 'x';
                break;
            case '9':
                testArray.tttArray[2][2] = 'x';
                break;
        }
        System.out.println();
    }
}
