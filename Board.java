package JavaChessApp;

import javax.swing.JFrame;
import java.awt.*;

public class Board extends JFrame
{
    //Constructor sets pieces to proper squares, and to proper colors.
    public Board()
    {
        setTitle("Java Chess App");
        Container c = getContentPane();
        c.setLayout(new GridLayout(8, 8));
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        for(int i = 1; i < 9; i++)
            for(int j = 1; j < 9; j++)
            {
                Square chessBoard = null;

                if((i ==  1 || i == 8) && (j == 1 || j == 8))
                {
                    if(i == 1)
                    chessBoard = new Square(i, j, new Rook(true)); 
                    else
                    chessBoard = new Square(i, j, new Rook(false));
                }
                else if((i ==  1 || i == 8) && (j == 2 || j == 7))
                {
                    if(i == 1)
                    chessBoard = new Square(i, j, new Knight(true));
                    else
                    chessBoard = new Square(i, j, new Knight(false));
                }
                else if((i ==  1 || i == 8) && (j == 3 || j == 6))
                {
                    if(i == 1)
                    chessBoard = new Square(i, j, new Bishop(true));
                    else
                    chessBoard = new Square(i, j, new Bishop(false));
                }
                else if((i ==  1 || i == 8) && j == 4)
                {
                    if(i == 1)
                    chessBoard = new Square(i, j, new Queen(true));
                    else
                    chessBoard = new Square(i, j, new Queen(false));
                }
                else if((i ==  1 || i == 8) && j == 5)
                {
                    if(i == 1)
                    chessBoard = new Square(i, j, new King(true));
                    else
                    chessBoard = new Square(i, j, new King(false));
                }
                else if(i == 2 || i == 7)
                {
                    if(i == 2)
                    chessBoard = new Square(i, j, new Pawn(true));
                    if(i == 7)
                    chessBoard = new Square(i, j, new Pawn(false));
                }
                else
                chessBoard = new Square(i, j, null);

                if((i  % 2 != 0 && j % 2 == 0)||(i % 2 == 0 && j % 2 != 0))
                chessBoard.setBackground(Color.BLACK);
                else
                chessBoard.setBackground(Color.WHITE);

                c.add(chessBoard);
            }
    }
}
