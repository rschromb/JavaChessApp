import javax.swing.JFrame;
import java.awt.*;

public class Board extends JFrame
{
    private static Square[][] chessBoard = new Square[8][8];
    //Constructor instantiates Squares to the GUI, sets the pieces to proper squares, and to proper colors.
    public Board()
    {
        setTitle("Java Chess App");
        Container c = getContentPane();
        c.setLayout(new GridLayout(8, 8));

        for(int i = 1; i < 9; i++)
            for(int j = 1; j < 9; j++)
            {
                if((i ==  1 || i == 8) && (j == 1 || j == 8))
                {
                    if(i == 1)
                    chessBoard[i - 1][j - 1] = new Square(i, j, new Rook(true)); 
                    else
                    chessBoard[i - 1][j - 1] = new Square(i, j, new Rook(false));
                }
                else if((i ==  1 || i == 8) && (j == 2 || j == 7))
                {
                    if(i == 1)
                    chessBoard[i - 1][j - 1] = new Square(i, j, new Knight(true));
                    else
                    chessBoard[i - 1][j - 1] = new Square(i, j, new Knight(false));
                }
                else if((i ==  1 || i == 8) && (j == 3 || j == 6))
                {
                    if(i == 1)
                    chessBoard[i - 1][j - 1] = new Square(i, j, new Bishop(true));
                    else
                    chessBoard[i - 1][j - 1] = new Square(i, j, new Bishop(false));
                }
                else if((i ==  1 || i == 8) && j == 4)
                {
                    if(i == 1)
                    chessBoard[i - 1][j - 1] = new Square(i, j, new Queen(true));
                    else
                    chessBoard[i - 1][j - 1]= new Square(i, j, new Queen(false));
                }
                else if((i ==  1 || i == 8) && j == 5)
                {
                    if(i == 1)
                    chessBoard[i - 1][j - 1] = new Square(i, j, new King(true));
                    else
                    chessBoard[i - 1][j - 1] = new Square(i, j, new King(false));
                }
                else if(i == 2 || i == 7)
                {
                    if(i == 2)
                    chessBoard[i - 1][j - 1] = new Square(i, j, new Pawn(true));
                    if(i == 7)
                    chessBoard[i - 1][j - 1] = new Square(i, j, new Pawn(false));
                }
                else
                chessBoard[i - 1][j - 1] = new Square(i, j, null);

                c.add(chessBoard[i - 1][j - 1]);
            }
        setSize(new Dimension(800, 800));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static Square getSquare(int x, int y)
    {
        return chessBoard[x][y];
    }
}
