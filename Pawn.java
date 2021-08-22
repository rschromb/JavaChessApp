import java.awt.Color;

public class Pawn extends Piece
{
    public Pawn (boolean white)
    {
        super(white);
    }
    
    @Override
    public String showPiece()
    {
        return "B";
    }

    public void movePiece(Square a)
    {
        System.out.println(a.showX());
        System.out.println(a.showY());

        Board.getSquare(a.showX() - 1, a.showY() - 1).setBackground(Color.RED);
    }
}
