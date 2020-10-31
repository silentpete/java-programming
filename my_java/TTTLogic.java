
public class TTTLogic {
    char player1 = 'x';
    char player2 = 'o';
    
    private TTTRules rules;
    
    public TTTLogic(TTTRules myRules) {
        rules = myRules;
    }
    
    int x;
    int y;
    
    public boolean CheckTwoInARow(TTTBoard board) {
        char[][] myArray = board.getTTTArray();
        /*
         * checking horizontal 
         */
        if(myArray[0][0] == player1 && myArray[0][1] == player1) {
            x = 0;
            y = 2;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[0][1] == player1 && myArray[0][2] == player1) {
            x = 0;
            y = 0;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[0][0] == player1 && myArray[0][2] == player1) {
            x = 0;
            y = 1;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[1][0] == player1 && myArray[1][1] == player1) {
            x = 1;
            y = 2;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[1][1] == player1 && myArray[1][2] == player1) {
            x = 1;
            y = 0;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[1][0] == player1 && myArray[1][2] == player1) {
            x = 1;
            y = 1;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[1][0] == player1 && myArray[1][2] == player1) {
            x = 1;
            y = 1;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[2][0] == player1 && myArray[2][1] == player1) {
            x = 2;
            y = 2;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[2][0] == player1 && myArray[2][2] == player1) {
            x = 2;
            y = 1;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[2][1] == player1 && myArray[2][2] == player1) {
            x = 2;
            y = 0;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        /*
         * Checking vertical 
         */
        if(myArray[0][0] == player1 && myArray[1][0] == player1) {
            x = 2;
            y = 0;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[1][0] == player1 && myArray[2][0] == player1) {
            x = 0;
            y = 0;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[0][0] == player1 && myArray[2][0] == player1) {
            x = 1;
            y = 0;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[0][1] == player1 && myArray[1][1] == player1) {
            x = 2;
            y = 1;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[1][1] == player1 && myArray[2][1] == player1) {
            x = 0;
            y = 1;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[0][1] == player1 && myArray[2][1] == player1) {
            x = 1;
            y = 1;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[0][2] == player1 && myArray[1][2] == player1) {
            x = 2;
            y = 2;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[1][2] == player1 && myArray[2][2] == player1) {
            x = 0;
            y = 2;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[0][2] == player1 && myArray[2][2] == player1) {
            x = 1;
            y = 2;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        /*
         * Checking diagonal 
         */
        if(myArray[0][0] == player1 && myArray[1][1] == player1) {
            x = 2;
            y = 2;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[1][1] == player1 && myArray[2][2] == player1) {
            x = 0;
            y = 0;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[0][0] == player1 && myArray[2][2] == player1) {
            x = 1;
            y = 1;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[2][0] == player1 && myArray[1][1] == player1) {
            x = 0;
            y = 2;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[1][1] == player1 && myArray[0][2] == player1) {
            x = 2;
            y = 0;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        if(myArray[2][0] == player1 && myArray[0][2] == player1) {
            x = 1;
            y = 1;
            if(rules.checkAvailable(board, x, y) == true) {
                return true;
            }
        }
        return false;
    }
    
    void setBlock(TTTBoard board) {
        board.setTTTArray(player2, x, y);
        System.out.println("The computer selected location: " + x + "," + y + ".\n");
    }
    
}
