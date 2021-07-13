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
}
