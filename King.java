public class King extends Piece {
    public King (ColorType color)
    {
        super(color, PieceType.KING);
    }
    
    @Override
    public String showPiece()
    {
        return "King";
    }

    public void movePiece(Square a) {
        System.out.println(a.showX());
        System.out.println(a.showY());
    }//end movePiece
}//end King

