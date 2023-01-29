import java.util.*;



public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Scanner scanner;
    private boolean isWin = false;
    private Player winner;

    public Game() {
        board = new Board(6, 7);
        player1 = new Player('1');
        player2 = new Player('2');
        scanner = new Scanner(System.in);
        
    }

    public void start() {
        while (!isWin) {
            board.print();
            System.out.print("Player 1 - play now: ");
            player1.playTurn(scanner, board);
            if (board.checkWin(player1.getsign())) {
                winner = player1;
                isWin = true;
                break;
            }
            if (board.noMoreSpaceLeft()) {
                isWin = true;
                break;
            }
            board.print();
            System.out.print("Player 2 - play now: ");
            player2.playTurn(scanner, board);
            if (board.checkWin(player2.getsign())) {
                winner = player2;
                isWin = true;
                break;
            }
            if (board.noMoreSpaceLeft()) {
                isWin = true;
                break;
            }
        }
        board.print();
        printWinner();
    }

    private void printWinner() {
        if (winner == player1) {
            System.out.println("Player1 " + " wins!");
        } else if (winner == player2) {
            System.out.println("Player2 " + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}