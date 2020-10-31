/**
 * The Game TicTacToe
 * @author peter gallerani
 *
 */
class TicTacToe {
    public static void main(String args[])
            throws java.io.IOException {
        TTTBoard board = new TTTBoard();
        TTTRules rules = new TTTRules();
        TTTLogic logic = new TTTLogic(rules);
        TTTPlayer player = new TTTPlayer(rules, logic);
        
        // Start of new game
        
        System.out.println("Play a game of Tic Tac Toe.\n"
                + "Rules are to match three locations (1 - 9) in a row.\n"
                + "Across, Down or Diagonal\n"
                + "You are X, the computer is O\n");
        
        board.show();
        
        
        while(rules.boardFull(board) == false) {
            
            if(rules.boardFull(board) == true) {
                System.out.println("\nno more spaces.\nGame Over\n");
                System.exit(0); //need to figure out something better
            }
            
            player.HumanPlayer(board);
            
            if(rules.winner(board) == true) {
                char X = 'X';
                board.PrintWinner(X);
                board.show();
                break;
            }
            
            
            if(rules.boardFull(board) == true) {
                System.out.println("\nUnfortunately there are no more spaces.\nGame Over\n");
                System.exit(0); //need to figure out something better
            }
            
            System.out.println("Computers turn...");
            player.ComputerPlayer(board);

            if(rules.winner(board) == true) {
                char O = 'O';
                board.PrintWinner(O);
                board.show();
                break;
            }
            board.show();
        }
    }
}
