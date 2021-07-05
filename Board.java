public class Board
{
    Square[][] chessBoard;

    public Board()
    {
        chessBoard = new Square[8][8];

        for(int i = 1; i < 9; i++)
            for(int j = 1; j < 9; j++)
            {
                if((i ==  1 || i == 8) && (j == 1 || j == 8))
                {
                    if(i == 1)
                    chessBoard[i - 1][j-1] = new Square(i, j, new Rook(true)); 
                    else
                    chessBoard[i - 1][j-1] = new Square(i, j, new Rook(false));
                }
                else if((i ==  1 || i == 8) && (j == 2 || j == 7))
                {
                    if(i == 1)
                    chessBoard[i - 1][j-1] = new Square(i, j, new Knight(true));
                    else
                    chessBoard[i - 1][j-1] = new Square(i, j, new Knight(false));
                }
                else if((i ==  1 || i == 8) && (j == 3 || j == 6))
                {
                    if(i == 1)
                    chessBoard[i - 1][j-1] = new Square(i, j, new Bishop(true));
                    else
                    chessBoard[i - 1][j-1] = new Square(i, j, new Bishop(false));
                }
                else if((i ==  1 || i == 8) && j == 4)
                {
                    if(i == 1)
                    chessBoard[i - 1][j-1] = new Square(i, j, new Queen(true));
                    else
                    chessBoard[i - 1][j-1] = new Square(i, j, new Queen(false));
                }
                else if((i ==  1 || i == 8) && j == 5)
                {
                    if(i == 1)
                    chessBoard[i - 1][j-1] = new Square(i, j, new King(true));
                    else
                    chessBoard[i - 1][j-1] = new Square(i, j, new King(false));
                }
                else if(i == 2 || i == 7)
                {
                    if(i == 2)
                    chessBoard[i - 1][j-1] = new Square(i, j, new Pawn(true));
                    if(i == 7)
                    chessBoard[i - 1][j-1] = new Square(i, j, new Pawn(false));
                }
                else
                chessBoard[i - 1][j-1] = new Square(i, j, null);
            }
    }

    public void showBlackView()
    {
        for(int i = 0; i < 8; i++)
            for(int j = 7; j >= 0; j--)
            {
                System.out.print(convertToLetter(chessBoard[j][i].getX(j)));
                System.out.print(chessBoard[j][i].getY(i));
                if(j == 0)
                System.out.println();
            }
    }


   public void showWhiteView()
   {
        for(int i = 7; i >= 0; i--)
            for(int j = 0; j < 8; j++)
            {
            System.out.print(convertToLetter(chessBoard[j][i].getX(j)));
            System.out.print(chessBoard[j][i].getY(i));
            if(j == 7)
            System.out.println();
            }
    }
    
    private String convertToLetter(int x)
    {
        int input = x;
        switch(input)
        {
            case 1:
            return "A";
            case 2:
            return "B";
            case 3:
            return "C";
            case 4:
            return "D";
            case 5:
            return "E";
            case 6:
            return "F";
            case 7:
            return "G";
            case 8:
            return "H";
            default:
            return "Error";
        }
    }
}
