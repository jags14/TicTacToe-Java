public class TicTacToe {
    public static final int X = 1, O = -1; // Players
    public static final int EMPTY = 0;     // Empty cell
    private int board[][] = new int[3][3]; // 3x3 board
    private int player;                     // Current player
    /** Constructor */
    public TicTacToe(){
        clearBoard();
    }

    /** Clears the board */
    public void clearBoard(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j] = EMPTY;
                player = X;

            }
        }
    }

    /** Puts an X or O mark at position board[i][j]  */
    public void putMark(int i, int j) throws IllegalArgumentException{
        if((i < 0) || (i >2) || (j < 0) ||(j > 2))
            throw new IllegalArgumentException("Invalid board position");
        if(board[i][j] != EMPTY)
            throw new IllegalArgumentException("board position is occupied");
        board[i][j] = player; // Place the mark for the current player
        player = -player; // change the player.. X and O are negative of each other
    }
    
    //* Checking if the current player won after the move */
    public boolean isWin(int mark){
        return(
            (board[0][0] + board[0][1] +board[0][2] == mark*3) || // row 1
            (board[1][0] + board[1][1] +board[1][2] == mark*3) || // row 2
            (board[2][0] + board[2][1] +board[2][2] == mark*3) || // row 3
            (board[0][0] + board[1][0] +board[2][0] == mark*3) || // column 1
            (board[0][1] + board[1][1] +board[2][1] == mark*3) ||
            (board[0][2] + board[1][2] +board[2][2] == mark*3) ||
            (board[0][0] + board[1][1] +board[2][2] == mark*3) || // diagonal
            (board[0][2] + board[1][1] +board[2[0] = mark*3)      // reverse diagonal
        );
    
    }
    public int winner(){
        if(isWin(X)) return (X);
        else if(isWin(O)) return (O);
        else return (0);
    
    }
                                              

}
