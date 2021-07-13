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
}
