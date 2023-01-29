


public class Board {  // איתמר טכנאי 
    private char[][] board;
    private int numOfRows;
    int numOfcollunms;

    public Board(int numOfRows, int numOfcollunms) {
        this.numOfRows = numOfRows;
        this.numOfcollunms = numOfcollunms;
        board = new char[numOfRows][numOfcollunms];
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfcollunms; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void print() {
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfcollunms; j++) {
                System.out.print("*" + board[i][j]);
            }
            System.out.println("*");
        }
        System.out.println("---------------");
    }
    public boolean putchar(int collunm, char sign) {
    	if(collunm > 6 || collunm < 0) {
    		System.out.println("Invalid move, enter between 0 - 6");
    		return false;
    	}
        if (board[0][collunm] != ' ') {
            return false;
        }
        for (int i = numOfRows - 1; i >= 0; i--) {
            if (board[i][collunm] == ' ') {
                board[i][collunm] = sign;
                return true;
            }
        }
        return false;
    }

    public boolean checkWin(char sign) {
       
    	
    	 for (int i = 0; i < numOfRows - 3; i++) {
             for (int j = 3; j < numOfcollunms; j++) {
                 if (board[i][j] == sign && board[i + 1][j - 1] ==
                 		sign && board[i + 2][j - 2] == 
                 		sign && board[i + 3][j - 3] == sign) {
                     return true;
                 }
             }
         }
       
       
        for (int i = 0; i < numOfRows - 3; i++) {
            for (int j = 0; j < numOfcollunms; j++) {
                if (board[i][j] == sign && board[i + 1][j] 
                		== sign && board[i + 2][j]
                		== sign && board[i + 3][j] == sign) {
                    return true;
                }
            }
        }

        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfcollunms - 3; j++) {
                if (board[i][j] == sign && board[i][j + 1] ==
                		sign && board[i][j + 2] ==
                		sign && board[i][j + 3] == sign) {
                    return true;
                }
            }
        }
       
        for (int i = 0; i < numOfRows - 3; i++) {
            for (int j = 0; j < numOfcollunms - 3; j++) {
                if (board[i][j] == sign && board[i + 1][j + 1] ==
                		sign && board[i + 2][j + 2] == 
                		sign && board[i + 3][j + 3] == sign) {
                    return true;
                }
            }
        }

      

        return false;
    }
    public boolean noMoreSpaceLeft() {
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfcollunms; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
