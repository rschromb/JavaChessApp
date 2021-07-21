public class Knight extends Piece
{
    public Knight (boolean white)
    {
        super(white);
    }
    
    @Override
    public String showPiece()
    {
        return "H";
    }

    public void movePiece(Square a)
    {
        System.out.println(a.showX());
        System.out.println(a.showY());
    }
}
