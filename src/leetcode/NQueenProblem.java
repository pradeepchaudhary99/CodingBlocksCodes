package leetcode;

public class NQueenProblem {

    // Sudoku
    // backtracking method
    /*
        Backtracking theory:
        It is also useful in the scenerio's when we want to explore all the posibilities.

        Principle of Backtracking

        Do changes,
          Call Recursively
        Undo changes

     */

public static boolean isSafe(boolean[][] board, int row,int col)
{
    int left = Math.min(row,col);
    int right = Math.min(row,board.length-col-1);

    //checking left diagonal
    for(int i=1;i<=left;i++)
    {
        if(board[row-i][col-i])
        {
            return false;
        }
    }

    //checking for right
    for(int i=1;i<=right;i++)
    {
        if(board[row-i][col+i])
        {
            return false;
        }
    }

    //checking top of the element

    int i=row-1;
    while(i>=0)
    {
        if(board[i][col])
        {
            return false;
        }
        i--;
    }

    return true;

}
//
    public static void nqueens(boolean[][] board, int row){

        if(row==board.length){
            display(board);
            return;
        }

        for(int col=0; col<board.length;col++)
        {
            if(isSafe(board,row,col)){

                board[row][col]=true;    //

                nqueens(board,row+1);

                board[row][col]=false;          //this is important to do  backtracking
            }
        }
    }

    public static void display(boolean[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0; j<board[i].length;j++){

                if(board[i][j]){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int n=5;
        boolean board[][]=new boolean[n][n];

        nqueens(board,0);

    }

}
