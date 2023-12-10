import java.awt.*;
import javax.swing.JButton;
import java.awt.event.*;

public class Square extends JButton implements ActionListener
{
    private Piece piece;
    private int x, y;
    private static Color squareBG;
    public Square(int x, int y, Piece piece)
    {
        this.setX(x);
        this.setY(y);
        this.setPiece(piece);
        this.setSize(new Dimension(100, 100));

        //Temporary String display until icons can be used on the Squares(JButtons).
        if(piece != null)
        {
            this.setText(this.piece.showColor(this.piece.checkWhite()) + this.piece.showPiece());
        }

        setBackground((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0) ? Color.WHITE : Color.BLACK);
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                getMove();
            }
        };

        this.addActionListener(listener);
        setOpaque(true);
    }

    private void getMove() {
        if (piece != null) {
            int destinationX = this.showX();
            int destinationY = this.showY();

            Square destinationSquare = Board.getSquare(destinationX, destinationY);

            piece.movePiece(destinationSquare);
            setPiece(null); // Clear the piece from the current square
        }
        if (getBackground().equals(Color.RED)) {
            setBackground((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0) ? Color.WHITE : Color.BLACK);
        } else {
            squareBG = getBackground(); // Store the original color before setting to red
            setBackground(Color.RED);
        }
    }//end getMove

    public int showX() { return this.x; }

    public int showY()
    {
        return this.y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        // You can also update the appearance or any other logic related to the piece on the square
        if (piece != null) {
            setText(piece.showColor(piece.checkWhite()) + piece.showPiece());
        } else {
            setText(""); // Clear the text if there's no piece
        }
    }

    public Piece getPiece()
    {
        return this.piece;
    }

    public Color getColor()
    {
        return squareBG;
    }

    public void actionPerformed(ActionEvent e)
    {
                
    }
}
