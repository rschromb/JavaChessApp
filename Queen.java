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
}
