public class Rook extends Piece
{
    public Rook (boolean white)
    {
        super(white);
    }
    
    @Override
    public String showPiece()
    {
        return "R";
    }

    public void movePiece(Square a)
    {
        System.out.println(a.showX());
        System.out.println(a.showY());
    }
}
