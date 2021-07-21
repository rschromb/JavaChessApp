public class Queen extends Piece
{
    public Queen (boolean white)
    {
        super(white);
    }
    
    @Override
    public String showPiece()
    {
        return "Q";
    }

    public void movePiece(Square a)
    {
        System.out.println(a.showX());
        System.out.println(a.showY());
    }
}
