public class King extends Piece
{
    public King (boolean white)
    {
        super(white);
    }
    
    @Override
    public String showPiece()
    {
        return "K";
    }

    public void movePiece(Square a)
    {
        System.out.println(a.showX());
        System.out.println(a.showY());

    }
}
