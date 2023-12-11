import java.awt.*;
import javax.swing.JButton;
import java.awt.event.*;

public class Square extends JButton implements ActionListener {
    private Piece piece;
    private int x, y;
    boolean moving = false;
    public Square(int x, int y, Piece piece) {
        this.setX(x);
        this.setY(y);
        this.setPiece(piece);
        this.setSize(new Dimension(100, 100));

        //Temporary String display until icons can be used on the Squares(JButtons).
        if(piece != null) {
            this.setText(this.piece.getColor() + " " + this.piece.showPiece());
        }

        setBackground((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0) ? Color.WHITE : Color.BLACK);
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                getMove();
            }
        };

        this.addActionListener(listener);
        setOpaque(true);
    }//end Square

    private void getMove() {
        System.out.println("entered getMove");
        if (piece != null && !moving) {
            System.out.println("entered if for getMove");
            moving = true;
            // setPiece(null); // Clear the piece from the current square
        } else if (moving && piece == null) {
            System.out.println("entered else if(moving)");
            int destinationX = this.showX();
            int destinationY = this.showY();

            // Updated method calls to use PieceType and ColorType enums
            Square destinationSquare = Board.getSquare(destinationX, destinationY);

            if (destinationSquare != null && piece != null) {
                piece.movePiece(destinationSquare);
            }

            moving = false;
        } else if (moving) {
            moving = false;
        }

        if (getBackground().equals(Color.RED))
            setBackground((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0) ? Color.WHITE : Color.BLACK);
        else {
            setBackground(Color.RED);
        }
        System.out.println("moving = " + moving);
    }// end getMove

    public int showX() { return this.x; }//end showX

    public int showY() {return this.y;}//end showY

    public void setX(int x) {this.x = x;}//end setX

    public void setY(int y) {this.y = y;}//end setY

    public void setPiece(Piece piece) {
        this.piece = piece;
        // You can also update the appearance or any other logic related to the piece on the square
        if (piece != null) {
            setText(piece.getColor() + piece.showPiece());
        } else {
            setText(""); // Clear the text if there's no piece
        }
    }//end set Piece

    public Piece getPiece() {return this.piece;}//end getPiece

    public void actionPerformed(ActionEvent e) {}
}//end
