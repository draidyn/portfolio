import java.util.Scanner;

public class TicTacToe {
    public static void main (String[] args) {
        char[] board; //Tic Tac Toe Board
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println(num);
        input.close();
    }

    
    public static char[] newBoard() {
        char[] board = {'-','-','-','-','-','-','-','-','-'};
        return board;
    }
}
