public class Bishop extends Piece
{
    public Bishop (boolean white)
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
    }
}
