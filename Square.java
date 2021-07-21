import java.awt.*;
import javax.swing.JButton;
import java.awt.event.*;

public class Square extends JButton implements ActionListener
{
    private Piece piece;
    private int x, y;

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

        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(piece != null)
                getMove();
            }
        };

        this.addActionListener(listener);

        if((x  % 2 != 0 && y % 2 == 0)||(x % 2 == 0 && y % 2 != 0))
        {
            this.setBackground(Color.BLACK);
        }
        else
        {  
             this.setBackground(Color.WHITE);
        }
        
        setOpaque(true);
    ;
    }

    private void getMove()
    {
        piece.movePiece(this);
    }

    public int showX()
    {
        return this.x;
    }

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

    public void setPiece(Piece x)
    {
        this.piece = x;
    }

    public Piece getPiece()
    {
        return this.piece;
    }

    public void actionPerformed(ActionEvent e)
    {
                
    }
}
