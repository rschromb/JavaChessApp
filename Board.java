import javax.swing.JFrame;
import java.awt.*;

public class Board extends JFrame {
    private final static Square[][] chessBoard = new Square[8][8];
    //Constructor instantiates Squares to the GUI, sets the pieces to proper squares, and to proper colors.
    public Board() {
        setTitle("Java Chess App");
        Container c = getContentPane();
        c.setLayout(new GridLayout(8, 8));

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if ((i == 1 || i == 8) && j == 5) {
                    if (i == 1) chessBoard[i - 1][j - 1] = new Square(i, j, new King(Piece.ColorType.PLAYER1));
                    else chessBoard[i - 1][j - 1] = new Square(i, j, new King(Piece.ColorType.PLAYER2));
                }//end King
                if ((i == 1 || i == 8) && (j == 1 || j == 8)) {
                    if (i == 1) chessBoard[i - 1][j - 1] = new Square(i, j, new Rook(Piece.ColorType.PLAYER1));
                    else chessBoard[i - 1][j - 1] = new Square(i, j, new Rook(Piece.ColorType.PLAYER2));
                }//end Rook
                if ((i == 1 || i == 8) && (j == 2 || j == 7)) {
                    if (i == 1) chessBoard[i - 1][j - 1] = new Square(i, j, new Knight(Piece.ColorType.PLAYER1));
                    else chessBoard[i - 1][j - 1] = new Square(i, j, new Knight(Piece.ColorType.PLAYER2));
                }//end Knight
                if ((i == 1 || i == 8) && (j == 3 || j == 6)) {
                    if (i == 1) chessBoard[i - 1][j - 1] = new Square(i, j, new Bishop(Piece.ColorType.PLAYER1));
                    else chessBoard[i - 1][j - 1] = new Square(i, j, new Bishop(Piece.ColorType.PLAYER2));
                }//end Bishop
                if ((i == 1 || i == 8) && j == 4) {
                    if (i == 1) chessBoard[i - 1][j - 1] = new Square(i, j, new Queen(Piece.ColorType.PLAYER1));
                    else chessBoard[i - 1][j - 1] = new Square(i, j, new Queen(Piece.ColorType.PLAYER2));
                }//end Queen
                if (i == 2 || i == 7) {
                    if (i == 2) chessBoard[i - 1][j - 1] = new Square(i, j, new Pawn(Piece.ColorType.PLAYER1));
                    if (i == 7) chessBoard[i - 1][j - 1] = new Square(i, j, new Pawn(Piece.ColorType.PLAYER2));
                }//end Pawn
                else chessBoard[i - 1][j - 1] = new Square(i, j, null);

                c.add(chessBoard[i - 1][j - 1]);
            }//end inner for
        }//end outer for

        setSize(new Dimension(800, 800));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//end Board


    public static Square getSquare(int x, int y)
    {
        if(x >= 0 && x < 8 && y >= 0 && y < 8) return chessBoard[x - 1][y-1];
        else return null;
    }//end getSquare
}//end

