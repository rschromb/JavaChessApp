package JavaChessApp;

import javax.swing.JButton;

public class Square extends JButton
{
    private int x;
    private int y;
    private Piece piece;

    public Square(int x, int y, Piece piece)
    {
        this.setX(x);
        this.setY(y);
        this.setPiece(piece);
        
        //Temporary String display until icons can be used on the Squares(JButtons).
        if(piece != null)
        {
            this.setText(this.piece.showColor(this.piece.checkWhite()) + this.piece.showPiece());
        }
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getX(int x)
    {
        return this.x;
    }

    public int getY(int y)
    {
        return this.y;
    }

    public void setPiece(Piece x)
    {
        this.piece = x;
    }

    public Piece getPiece()
    {
        return this.piece;
    }
}
