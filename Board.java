public class Board
{
    Square[][] chessBoard;

    public Board()
    {
        chessBoard = new Square[8][8];

        for(int i = 1; i < 9; i++)
            for(int j = 1; j < 9; j++)
            {
                chessBoard[i - 1][j-1] = new Square(i, j, null);
            }
    }

    public void showBoard()
    {
        for(int i = 0; i < 8; i++)
            for(int j = 0; j < 8; j++)
            {
                System.out.print(chessBoard[i][j].getX(i));
                System.out.print(chessBoard[i][j].getY(j));
                if(j == 7)
                System.out.println();
            }
    }
}
