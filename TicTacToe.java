import java.util.Scanner;

public class TicTacToe {
    public static void main (String[] args) {
        char[] board; //Tic Tac Toe Board
        boolean winner = false;
        board = newBoard(); //generates new board for Tic Tac Toe
        boolean player = true; //true = player1; false = player2
        int counter = 1;
        // while there is no winner, keep looping
        while (!winner) {
            
            printBoard(board);
            board = play(board, player); //sends the board and player to play for turn
            player = !player;
            winner = checkWinner(board);

            if (counter == 9) { //check to see if all the slots have been taken without a winner being declared
                System.out.println("No winner");
                winner = true;
            }
        }
    }

    private static char[] play(char[] board, boolean player) {
        Scanner input = new Scanner(System.in);
        int playerNum = player ? 1 : 2;
        char symbol = player ? 'X' : 'O';

        System.out.println("Player " + playerNum + ". Its your turn. Whats your move?");
        boolean validEntry = false;
        int move = input.nextInt(); //location of move

        while (!validEntry) { //checks the user entry to make sure the integer is within the accepted range/bounds
            if (move < 0 || move > 8) {
                System.out.println("Invalid Entry. Integer has to be greater or equal to 0 and less than or equal to 8");
                System.out.println("0 represent 1st slot in first row. 1 represents 2nd spot in row 1, and so on");
                System.out.println("Please try again");
                move = input.nextInt();
            }
            else validEntry = true;
        }

        board[move] = symbol;
        input.close();
        return board;
    }

    //to be initialized
    private static boolean checkWinner(char[] board) {

        return true;
    }
    
    /**
     * Generates new board the game of tic tac toe
     * @return
     */
    private static char[] newBoard() {
        char[] board = {'-','-','-','-','-','-','-','-','-'};
        return board;
    }
    /**
     * prints the board in the correct orientation
     */
    private static void printBoard(char[] board) {
        for (int i = 0; i < board.length; i++) {
            if (i == 2 || i == 5 || i == 8) System.out.println(" " + board[i]+ " ");
            else System.out.print(" "+ board[i] + " ");
        }
    }
}
