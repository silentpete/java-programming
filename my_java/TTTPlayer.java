/**
 * TicTacToe player interaction
 * @author peter
 *
 */
public class TTTPlayer {
    char player1 = 'x';
    char player2 = 'o';
    
    private TTTLogic logic;
    
    private TTTRules rules;
    
    public TTTPlayer(TTTRules myRules, TTTLogic myLogic) {
        rules = myRules;
        logic = myLogic;
    }
    
    void HumanPlayer(TTTBoard board) throws java.io.IOException {
        char choice, ignore;
        
        do {
            System.out.println("Please choose an available location");
            System.out.print("Choose one (q to quit): ");
            
            choice = (char) System.in.read();
            
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
        } while(choice < '1' | choice > '9' & choice != 'q');
        
        switch(choice) {
        case '1':
            int x1 = 0;
            int y1 = 0;
            if(rules.checkAvailable(board, x1, y1) == true) {
                board.setTTTArray(player1, x1, y1);
            }
            else {
            HumanPlayer(board);
            }
            break;
        case '2':
            int x2 = 0;
            int y2 = 1;
            if(rules.checkAvailable(board, x2, y2) == true) {
                board.setTTTArray(player1, x2, y2);
            }
            else {
            HumanPlayer(board);
            }
            break;
        case '3':
            int x3 = 0;
            int y3 = 2;
            if(rules.checkAvailable(board, x3, y3) == true) {
                board.setTTTArray(player1, x3, y3);
            }
            else {
            HumanPlayer(board);
            }
            break;
        case '4':
            int x4 = 1;
            int y4 = 0;
            if(rules.checkAvailable(board, x4, y4) == true) {
                board.setTTTArray(player1, x4, y4);
            }
            else {
            HumanPlayer(board);
            }
            break;
        case '5':
            int x5 = 1;
            int y5 = 1;
            if(rules.checkAvailable(board, x5, y5) == true) {
                board.setTTTArray(player1, x5, y5);
            }
            else {
            HumanPlayer(board);
            }
            break;
        case '6':
            int x6 = 1;
            int y6 = 2;
            if(rules.checkAvailable(board, x6, y6) == true) {
                board.setTTTArray(player1, x6, y6);
            }
            else {
            HumanPlayer(board);
            }
            break;
        case '7':
            int x7 = 2;
            int y7 = 0;
            if(rules.checkAvailable(board, x7, y7) == true) {
                board.setTTTArray(player1, x7, y7);
            }
            else {
            HumanPlayer(board);
            }
            break;
        case '8':
            int x8 = 2;
            int y8 = 1;
            if(rules.checkAvailable(board, x8, y8) == true) {
                board.setTTTArray(player1, x8, y8);
            }
            else {
            HumanPlayer(board);
            }
            break;
        case '9':
            int x9 = 2;
            int y9 = 2;
            if(rules.checkAvailable(board, x9, y9) == true) {
                board.setTTTArray(player1, x9, y9);
            }
            else {
            HumanPlayer(board);
            }
            break;
        case 'q':
            rules.QuitGame();
        }
    }
    
    void ComputerPlayer(TTTBoard board) {
        if(logic.CheckTwoInARow(board) == true) {
            logic.setBlock(board);
            System.out.println("going for the block");
        }
        else{
        
        
        int xComputer = (int)(Math.random() * 3);
        int yComputer = (int)(Math.random() * 3);
        
        if(rules.checkAvailable(board, xComputer, yComputer) == true) {
            board.setTTTArray(player2, xComputer, yComputer);
            System.out.println("The computer selected location: " + xComputer + "," + yComputer + ".\n");
        }
        else {
        ComputerPlayer(board);
        }
        return;
        }
    }
}
