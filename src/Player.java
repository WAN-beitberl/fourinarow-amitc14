import java.util.*;
// לא עשית מספיק oop
public class Player {
    private char sign; // לא שם טוב למשתנה תשנה לאיתמר טכנאי

    public Player(char sign) {
        this.sign = sign;
    }

    public char getsign() {   // פעולה מיותרת איתמר טכנאי
        return sign;
    }

    public void playTurn(Scanner scanner, Board board) {
        System.out.print("Choose a collumnumn (0-6) to put your sign in:");
        int collumn = scanner.nextInt();
        while(collumn < 0 || collumn > 6) {
        	System.out.println("you can not enter a number smaller than 0 or bigger than 6!!");
        	System.out.print("Choose a collumnumn (0-6) to put your sign in:");
            collumn = scanner.nextInt();
        }
         while (board.putchar(collumn, sign) == false) {
            System.out.println("Invalid move, try again.");
            System.out.print("Choose a collumnumn (0-6) to put your sign in:");
            collumn = scanner.nextInt();
        }
       
    }
}




